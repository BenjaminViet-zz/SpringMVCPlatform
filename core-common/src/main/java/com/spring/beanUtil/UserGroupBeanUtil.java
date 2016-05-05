package com.spring.beanUtil;

import com.spring.domain.UserGroupEntity;
import com.spring.dto.UserGroupDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: vietquocpham
 * Date: 5/5/16
 * Time: 13:27
 * To change this template use File | Settings | File Templates.
 */
public class UserGroupBeanUtil {

    public static UserGroupDTO entity2DTO(UserGroupEntity entity){
        UserGroupDTO dto = new UserGroupDTO();
        dto.setUserGroupId(entity.getUserGroupId());
        dto.setCode(entity.getCode());
        dto.setPath(entity.getPath());
        dto.setDescription(entity.getDescription());
        dto.setCreatedDate(entity.getCreatedDate());
        return dto;
    }

    public static List<UserGroupDTO> entityList2DTOList(List<UserGroupEntity> entityList){
        List<UserGroupDTO> dtoList = new ArrayList<UserGroupDTO>();
        for(UserGroupEntity entity : entityList){
            dtoList.add(UserGroupBeanUtil.entity2DTO(entity));
        }
        return dtoList;
    }
}
