package jp.rena.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jp.rena.entity.User;

@RestController
@RequestMapping("/dhc")
public class DataHandleController {

    @GetMapping("/h1")
    // 参数名一致
    public String h1(String name) {
        System.out.println(name);
        return name;
    }

    @GetMapping("/h2")
    // 参数名不一致 @RequestParam
    public String h2(@RequestParam("username") String name) {
        System.out.println(name);
        return name;
    }

    @GetMapping("/h3")
    public String h3(User user) {
        System.out.println(user);
        return user.toString();
    }

}
