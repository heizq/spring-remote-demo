package com.hei.remote.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2015/8/27 0027.
 */
@Controller
public class TemplateController {

    @RequestMapping(value="home" ,method = RequestMethod.GET)
    public ModelAndView home (){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        return mv;
    }

    @RequestMapping(value="index" ,method = RequestMethod.GET)
    public ModelAndView index (){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }


}
