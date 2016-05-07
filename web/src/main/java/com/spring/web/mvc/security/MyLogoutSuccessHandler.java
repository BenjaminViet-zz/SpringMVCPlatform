package com.spring.web.mvc.security;

import com.spring.util.AccountTypeEnum;
import com.spring.util.Constants;
import org.apache.log4j.Logger;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.security.web.authentication.logout.SimpleUrlLogoutSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: vietquocpham
 * Date: 5/5/16
 * Time: 14:07
 * To change this template use File | Settings | File Templates.
 */
@Component
public class MyLogoutSuccessHandler extends SimpleUrlLogoutSuccessHandler implements LogoutSuccessHandler{

    private transient final Logger logger = Logger.getLogger(getClass());
    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
    private static final String USER_LOGOUT_URL = "/home.html";

    public MyLogoutSuccessHandler(){
        super();
    }

    @Override
    public void onLogoutSuccess(HttpServletRequest request,
                                HttpServletResponse response,
                                Authentication authentication) throws IOException, ServletException {
        if(authentication.getAuthorities().size() > 0){
            for(GrantedAuthority grantedAuthority : authentication.getAuthorities()){
                if(grantedAuthority.equals(AccountTypeEnum.USER.getCode())){
                    redirectStrategy.sendRedirect(request, response, USER_LOGOUT_URL);
                }
            }
        }
        redirectStrategy.sendRedirect(request, response, getDefaultTargetUrl());
    }


}
