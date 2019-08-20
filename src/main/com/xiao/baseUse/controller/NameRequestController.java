package main.com.xiao.baseUse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试命名服务
 */
@Controller("/nameRequestController.mc")
public class NameRequestController {

    @RequestMapping( params = {"method=getSign"})
    @ResponseBody
    public Map<String,Object> getSign(){
        Map<String,Object> aa=new HashMap<>();
        aa.put("a","a");
        return  aa;
    }
}
