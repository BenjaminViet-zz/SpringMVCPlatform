package com.spring.business.impl;

import com.spring.beanUtil.UserGroupBeanUtil;
import com.spring.business.UserGroupService;
import com.spring.domain.UserGroupEntity;
import com.spring.dto.UserGroupDTO;
import com.spring.repository.UserGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: vietquocpham
 * Date: 5/5/16
 * Time: 13:26
 * To change this template use File | Settings | File Templates.
 */
@Service
public class UserGroupServiceImpl implements UserGroupService{

    @Autowired
    private UserGroupRepository userGroupRepository;

    @Override
    public List<UserGroupDTO> findAll() {
        return UserGroupBeanUtil.entityList2DTOList(this.userGroupRepository.findAll());
    }
}
