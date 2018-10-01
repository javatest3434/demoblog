package com.example.demoblog.controller;

import com.example.demoblog.model.BlogModel;
import com.example.demoblog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private BlogRepository blogRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView ModelAndView() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");

        modelAndView.addObject("blog", blogRepository.findAll());

        return modelAndView;
    }
    @RequestMapping(value = "newpost", method = RequestMethod.GET)
    public ModelAndView NewBlog() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("newpost");
        return modelAndView;
    }

    @RequestMapping(value = "edit", method = RequestMethod.GET)
    public ModelAndView editBlog() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("edit");
        return modelAndView;
    }

    @RequestMapping(value = "/textform", method = RequestMethod.POST)
    public String fooForm(Model model, @ModelAttribute("word") String word, String definition) {

        if ((word == "")) {
            return "redirect:/newpost";
        } else {
            BlogModel blog = new BlogModel();
            blog.setText(word);
                     blogRepository.save(blog);


            return "redirect:/";
        }

    }
}
