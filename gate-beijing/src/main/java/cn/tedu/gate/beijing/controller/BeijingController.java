package cn.tedu.gate.beijing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;

@RestController
@RequestMapping("/bj")
public class BeijingController {

    @GetMapping("/show")
    public String show(){
        //System.out.println(ZonedDateTime.now());
        return "这里是北京！";
    }


}
