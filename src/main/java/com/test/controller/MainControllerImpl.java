package com.test.controller;

import com.test.service.MainService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Controller
public class MainControllerImpl implements MainController{

    @Resource(name = "mainService")
    private MainService mainService;

    @Override
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(ModelAndView mav){
        List<HashMap<String, Object>> tb = mainService.selectTboard();
        mav.addObject("list", tb);
        mav.setViewName("index");
        return mav;
    }
}
