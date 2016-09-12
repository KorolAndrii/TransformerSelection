package com.korol.controller.admin;

import com.korol.service.TransParamsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Somebody on 12.09.2016.
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminMainController {
    @Autowired
    private TransParamsService transParamsService;
    @RequestMapping(value = "/adminMain", method = RequestMethod.GET)
    public ModelAndView adminMainPage() {
        ModelAndView modelAndView = new ModelAndView("admin/adminMain");
        modelAndView.addObject("transParams", transParamsService.getAll());
        return modelAndView;
    }
}
