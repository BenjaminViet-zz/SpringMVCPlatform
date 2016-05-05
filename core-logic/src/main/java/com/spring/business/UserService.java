package com.spring.business;


import com.spring.dto.UserDTO;

/**
 * Created with IntelliJ IDEA.
 * User: vietquocpham
 * Date: 4/21/16
 * Time: 14:43
 * To change this template use File | Settings | File Templates.
 */
public interface UserService {
    UserDTO findById(Long userId);

    UserDTO findByUserName(String userName);

    UserDTO fetchByTerm(String admin);

    void saveAndEncodePassword(UserDTO dto);
}
