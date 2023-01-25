package ca.tetervak.paperrockscissors.service;

import ca.tetervak.paperrockscissors.model.Choice;
import ca.tetervak.paperrockscissors.model.GameData;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class GameService {

    private final Random random;

    public GameService(Random random) {
        this.random = random;
    }

    public GameService() {
        this(new Random());
    }

    public GameData getGameData(Choice playerOneChoice, Choice playerTwoChoice){
        return new GameData(playerOneChoice, playerTwoChoice);
    }

    public Choice getRandomChoice(){
        Choice[] values = Choice.values();
        return values[random.nextInt(values.length)];
    }
}
