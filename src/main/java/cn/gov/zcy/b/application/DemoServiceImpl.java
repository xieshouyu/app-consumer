package cn.gov.zcy.b.application;

import org.apache.dubbo.config.annotation.DubboReference;

//import cn.gov.zcy.a.model.DTO;
import cn.gov.zcy.a.model.HelloWorldResponse;
import cn.gov.zcy.a.model.Response;
import cn.gov.zcy.a.service.HelloA;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DemoServiceImpl {

    @DubboReference(version = "1.0.0", retries = 0)
    private HelloA helloA;

    public void send(){
//        helloA.helloWorld(new HelloWorldRequest());
//        System.out.println("success");
        Response<List<HelloWorldResponse>> response = helloA.helloWorld(1L);
        List<HelloWorldResponse>  responseList = response.getResult();
        cn.gov.zcy.a.model.DTO dto = (cn.gov.zcy.a.model.DTO)responseList.get(0).getDto();
        System.out.println(dto);
    }

}
