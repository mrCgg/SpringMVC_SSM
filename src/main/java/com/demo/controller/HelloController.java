package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * describe:
 *
 * @author cgg
 * @date 2019/06/23
 */
@Controller
public class HelloController {
    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("hello spring");
        return "success";
    }

    /**
     * 原生的servlet  api
     */
    @RequestMapping(path = "/servletapi")
    public String test(HttpServletResponse response, HttpServletRequest request){
        System.out.println(request);

        HttpSession session = request.getSession();
        System.out.println(session);

        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext);

        return "success";
    }
}
