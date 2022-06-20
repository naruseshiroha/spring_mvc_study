package jp.rena.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restful")
public class RestCFulController {

    /**
     * @GetMapping
     * @PostMapping
     * @PutMapping
     * @DeleteMapping
     * @PatchMapping
     */
    @RequestMapping("/commit/{a}/{b}")
    public String index(@PathVariable Integer a, @PathVariable Integer b) {
        return "res is " + String.valueOf(a + b);
    }

}
