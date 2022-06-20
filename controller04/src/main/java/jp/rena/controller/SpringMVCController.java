package jp.rena.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/springmvc")
public class SpringMVCController {

    @GetMapping("/v1")
    public String v1() {
        return "../index.jsp";
    }
    
    @GetMapping("/v2")
    public String v2() {
        return "forward:../index.jsp";
    }

    @GetMapping("/v3")
    public String v3() {
        return "redirect:../index.jsp";
    }

}
