package main.com.dubbo.provider;

import org.springframework.stereotype.Component;

@Component
public class ProviderServiceImpl implements  IProviderService {

    /**
     * 提供方法
     * @return
     */
    public Object provideMessage(){
        System.out.println("开始调用服务提供方的消息提醒方法");
        return "this is demo";
    }

}
