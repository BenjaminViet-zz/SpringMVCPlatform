package com.spring.beanUtil;

import com.spring.domain.UserEntity;
import com.spring.dto.UserDTO;

/**
 * Created with IntelliJ IDEA.
 * User: vietquocpham
 * Date: 5/5/16
 * Time: 13:11
 * To change this template use File | Settings | File Templates.
 */
public class UserBeanUtil {

    public static UserDTO entity2DTO(UserEntity entity){
        UserDTO dto = new UserDTO();
        dto.setUserId(entity.getUserId());
        dto.setUserName(entity.getUserName());
        dto.setPassword(entity.getPassword());
        dto.setEmail(entity.getEmail());
        dto.setActive(entity.getActive());
        dto.setCreatedDate(entity.getCreatedDate());
        return dto;
    }
}
