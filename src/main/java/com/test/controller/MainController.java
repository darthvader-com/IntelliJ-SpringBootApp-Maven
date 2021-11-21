package com.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public interface MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    ModelAndView index(ModelAndView mav);

}
