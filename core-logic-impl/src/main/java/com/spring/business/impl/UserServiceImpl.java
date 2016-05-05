package com.spring.business.impl;

import com.spring.beanUtil.UserBeanUtil;
import com.spring.business.UserService;
import com.spring.domain.UserEntity;
import com.spring.domain.UserGroupEntity;
import com.spring.dto.UserDTO;
import com.spring.repository.UserRepository;
import com.spring.util.AccountStateEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 * User: vietquocpham
 * Date: 5/5/16
 * Time: 13:05
 * To change this template use File | Settings | File Templates.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDTO findById(Long userId) {
        return UserBeanUtil.entity2DTO(userRepository.findOne(userId));
    }

    @Override
    public UserDTO findByUserName(String userName) {
        UserEntity entity = userRepository.findByUserName(userName);
        if(entity != null){
            return UserBeanUtil.entity2DTO(entity);
        }
        return null;
    }

    @Override
    public UserDTO fetchByTerm(String admin) {
        return UserBeanUtil.entity2DTO(userRepository.findByUserName(admin));
    }

    @Override
    public void saveAndEncodePassword(UserDTO dto) {
        UserEntity entity = new UserEntity();
        entity.setUserName(dto.getUserName());
        entity.setPassword(passwordEncoder.encode(dto.getPassword()));
        entity.setEmail(dto.getEmail());
        entity.setActive(AccountStateEnum.ACTIVE.getValue());
        entity.setCreatedDate(new Timestamp(System.currentTimeMillis()));

        UserGroupEntity userGroupEntity = new UserGroupEntity();
        userGroupEntity.setUserGroupId(dto.getUserGroup().getUserGroupId());
        entity.setUserGroup(userGroupEntity);

        userRepository.save(entity);
    }
}
