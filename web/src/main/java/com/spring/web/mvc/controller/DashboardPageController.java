package com.spring.web.mvc.controller;

import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 * User: vietquocpham
 * Date: 10/7/16
 * Time: 22:19
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class DashboardPageController extends ApplicationObjectSupport{

    @RequestMapping("/admin/dashboard.html")
    public ModelAndView adminDashBoard(){
        return new ModelAndView("admin/dashboard");

    }
}
