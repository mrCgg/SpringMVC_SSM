package com.demo.controller;

import com.demo.model.Detail;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;
import java.util.Map;

/**
 * describe:
 *
 * @author cgg
 * @date 2019/06/24
 */
@Controller
@RequestMapping("/testParam")
@SessionAttributes(value = {"name"})
public class AnnoController {
    @RequestMapping("/PathVariable/{sid}")
    public String testPathvariable(@PathVariable(name="sid")String id){
        System.out.println(id);
        return "success";
    }

    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("test") Detail detail){
        System.out.println(detail);
        return "success";
    }


    @ModelAttribute
    public void showDetail(String address, Map<String,Detail> map){
        Detail detail = new Detail();
        detail.setAddress(address);
        detail.setPhone(130);
        detail.setDate(new Date());
        map.put("test",detail);

    }


    @RequestMapping("/testSessionAttribute")
    public String testSessionAttribute(Model model){
        model.addAttribute("name","cgg");
        return "success";
    }

    @RequestMapping("/getSessionAttribute")
    public String getSessionAttribute(ModelMap modelMap){
        String name = (String) modelMap.get("name");
        System.out.println(name);
        return "success";
    }

    @RequestMapping("/deleteSessionAttribute")
    public String deleteSessionAttribute(SessionStatus status){
        status.setComplete();
        return "success";
    }
}
