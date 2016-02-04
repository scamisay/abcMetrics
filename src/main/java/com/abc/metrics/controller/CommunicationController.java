package com.abc.metrics.controller;

import com.abc.metrics.domain.MetricCommunication;
import com.abc.metrics.service.CommunitationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/communication")
public class CommunicationController {

    @Autowired
    private CommunitationService communitationService;

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public String view() {
        return "communication/view";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public ModelAndView create() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("communication/create");
        mav.addObject("metric", new MetricCommunication());
        return mav;
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(MetricCommunication metric){
        communitationService.save(metric);
        return "redirect:/communication/create";
    }
}