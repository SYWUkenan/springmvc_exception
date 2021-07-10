package cn.yswu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import sun.jvm.hotspot.memory.StringTable;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @author yswu
 * @date 2021-07-10 15:43
 */
@Controller
public class ExceptionController {

    @RequestMapping("/exception")
    public String exception(@RequestParam("name") String name){
        System.out.println("处理异常");
        return "show";
    }

    @ExceptionHandler(Exception.class)
    public ModelAndView handleException(Exception ex){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error");
        modelAndView.addObject("ex",ex);

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        ex.printStackTrace(pw);
        System.out.println(sw.toString());
        return modelAndView;

    }
}
