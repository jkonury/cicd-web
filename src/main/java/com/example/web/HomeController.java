package com.example.web;

import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  private final Logger logger = LoggerFactory.getLogger(getClass());

  @GetMapping("/")
  public String index(Model model) {
    logger.debug("Welcome to com.example...");

    model.addAttribute("msg", getMessage());
    model.addAttribute("today", new Date());
    System.out.println(model.getAttribute("today"));
    return "index";

  }

  private String getMessage() {
    return "Hi, there";
  }
}
