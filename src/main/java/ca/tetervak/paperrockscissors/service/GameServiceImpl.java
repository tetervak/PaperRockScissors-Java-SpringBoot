package ca.tetervak.paperrockscissors.service;

import ca.tetervak.paperrockscissors.model.Choice;
import ca.tetervak.paperrockscissors.model.GameData;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class GameServiceImpl implements GameService {

    private final Random random;

    public GameServiceImpl(Random random) {
        this.random = random;
    }

    public GameServiceImpl() {
        this(new Random());
    }

    @Override
    public GameData getGameData(Choice playerOneChoice, Choice playerTwoChoice){
        return new GameData(playerOneChoice, playerTwoChoice);
    }

    @Override
    public Choice getRandomChoice(){
        Choice[] values = Choice.values();
        return values[random.nextInt(values.length)];
    }
}
