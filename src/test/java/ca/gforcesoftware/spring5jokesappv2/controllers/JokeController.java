package ca.gforcesoftware.spring5jokesappv2.controllers;

import ca.gforcesoftware.spring5jokesappv2.services.JokeService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gavinhashemi on 2024-10-05
 */
@Controller
public class JokeController {
   private final JokeService jokeService;

    public JokeController(@Qualifier("jokeServiceImpl") JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String getJoke(Model model) {
       model.addAttribute("joke", jokeService.getJoke());
       return "index";
    }


}
