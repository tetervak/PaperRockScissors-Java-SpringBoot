package ca.tetervak.paperrockscissors.service;

import ca.tetervak.paperrockscissors.model.Choice;
import ca.tetervak.paperrockscissors.model.GameData;

public interface GameService {
    GameData getGameData(Choice playerOneChoice, Choice playerTwoChoice);

    Choice getRandomChoice();
}
