package com.lushanwenku.server;

import org.springframework.stereotype.Service;

import javax.jws.WebService;
import java.util.Date;

@Service
@WebService(serviceName = "DemoService", // 与接口中指定的name一致
        targetNamespace = "http://server.lushanwenku.com", // 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "com.lushanwenku.server.DemoService"// 接口地址
)
public class DemoServiceImpl implements DemoService {
 
    @Override
    public String sayHello(String user) {
        return user+"，现在时间："+"("+new Date()+")";
    }
 
}