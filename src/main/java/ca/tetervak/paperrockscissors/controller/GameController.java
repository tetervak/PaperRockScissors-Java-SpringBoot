package ca.tetervak.paperrockscissors.controller;

import ca.tetervak.paperrockscissors.model.Choice;
import ca.tetervak.paperrockscissors.model.GameData;
import ca.tetervak.paperrockscissors.service.GameService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
public class GameController {

    private final Logger log = LoggerFactory.getLogger(GameController.class);

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping(value = {"/", "/input"})
    public String input(){
        log.trace("input() is called");
        return "Input";
    }

    @GetMapping("/play")
    public ModelAndView play(@RequestParam Choice userChoice){
        log.trace("play() is called");
        log.debug("userChoice = " + userChoice);
        Choice computerChoice = gameService.getRandomChoice();
        log.debug("computerChoice = " + computerChoice);
        GameData gameData = gameService.getGameData(userChoice, computerChoice);
        log.debug("gameData = " + gameData);
        return new ModelAndView("Output", "gameData", gameData);
    }

    @ModelAttribute("localDate")
    LocalDate getlLocalDate(){
        return LocalDate.now();
    }

}
