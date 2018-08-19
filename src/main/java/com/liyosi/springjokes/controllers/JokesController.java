package com.liyosi.springjokes.controllers;

import com.liyosi.springjokes.services.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liyosi on Aug, 2018
 */
@Controller
public class JokesController {

  @Autowired
  private JokesService jokesService;

  @RequestMapping("/")
  public String randomJokes(Model model) {

    model.addAttribute("joke", jokesService.randomJoke());

    return "chucknorris";
  }
}
