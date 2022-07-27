package cn.tedu.gate.shanghai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sh")
public class ShanghaiController {

    @GetMapping("/show")
    public String show(){

        return "这里是上海！";
    }


}
