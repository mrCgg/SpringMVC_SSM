package com.demo.controller;

import com.demo.model.Account;
import com.demo.model.Detail;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @RequestMapping(value = "/saveDetail")
    public String saveAcount(Detail detail){
        System.out.println(detail);
        return "success";
    }
}
