package com.demo.controller;

import com.demo.model.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * describe:
 *
 * @author cgg
 * @date 2019/06/23
 */
@Controller
@RequestMapping(value = "/param")
public class ParamController {

    @RequestMapping(value = "/save")
    public String saveAcount(Account account){
        System.out.println(account);
        return "success";
    }
}
