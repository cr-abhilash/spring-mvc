package com.telusko;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.HelperService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class AddController {
    @RequestMapping("/add")
    public String add(@RequestParam("n1") int i, @RequestParam("n2") int j,  HttpServletRequest request, HttpServletResponse response){
//        int i = Integer.parseInt(request.getParameter("n1"));
//        int j = Integer.parseInt(request.getParameter("n2"));
        HelperService s = new HelperService();
        System.out.println(request);
        System.out.println(response);
        int k=s.add(i,j);

        ModelAndView v1 = new ModelAndView();
        v1.setViewName("display");
        v1.addObject("result",k);

        return "display";

    }
}