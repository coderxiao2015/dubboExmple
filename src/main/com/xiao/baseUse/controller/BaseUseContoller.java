package main.com.xiao.baseUse.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Scope("prototype")
@RequestMapping("/baseUse")
public class BaseUseContoller {

    /**
     * 返回一个视图
     */
    @RequestMapping("/goBasePage.do")
    public ModelAndView goBasePage(){
        ModelAndView view=new ModelAndView();
        /*在InternalResourceViewResolver 的prefix的基础上继续拼接*/
        view.setViewName("base/base_page");
        return view;
    }



}
