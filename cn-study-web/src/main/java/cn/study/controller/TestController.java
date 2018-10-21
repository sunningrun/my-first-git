package cn.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lenovo on 2018/10/21.
 */
@Controller
public class TestController {

    @GetMapping("/test")
    public String testProject() {
        return "success";
    }
}
