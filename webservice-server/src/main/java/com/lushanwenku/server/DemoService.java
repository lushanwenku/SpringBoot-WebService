package com.lushanwenku.server;
 
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name = "DemoService", // 暴露服务名称
    targetNamespace = "http://server.lushanwenku.com"// 命名空间,一般是接口的包名倒序
)
public interface DemoService {

    @WebMethod
    public String sayHello(@WebParam(name = "user") String user);

}