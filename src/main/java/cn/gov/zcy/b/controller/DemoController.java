package cn.gov.zcy.b.controller;

import cn.gov.zcy.b.application.DemoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private DemoServiceImpl demoService;

    @RequestMapping("/send")
    public void send(){
        demoService.send();
    }

}