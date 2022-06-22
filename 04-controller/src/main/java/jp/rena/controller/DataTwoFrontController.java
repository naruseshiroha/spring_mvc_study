package jp.rena.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/dtfc")
public class DataTwoFrontController {

    // Reference TestController1
    // public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
    //         throws Exception {
    //     // 返回一个模型视图对象
    //     ModelAndView mv = new ModelAndView();
    //     mv.addObject("msg", "ControllerTest1");
    //     mv.setViewName("test");
    //     return mv;
    // }

    @RequestMapping("/modelMap")
    public String helloModelMap(@RequestParam("username") String name, ModelMap model) {
        // 封装要显示到视图中的数据
        // 相当于req.setAttribute("name",name);
        model.addAttribute("name", name);
        System.out.println(name);
        return "hello";
    }

    @RequestMapping("/model")
    public String helloModel(@RequestParam("username") String name, Model model) {
        // 封装要显示到视图中的数据
        // 相当于req.setAttribute("name",name);
        model.addAttribute("msg", name);
        System.out.println(name);
        return "test";
    }
}
