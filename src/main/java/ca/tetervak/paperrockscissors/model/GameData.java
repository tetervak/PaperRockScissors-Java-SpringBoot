package ca.tetervak.paperrockscissors.model;

public class GameData {
    private final Choice playerOneChoice;
    private final Choice playerTwoChoice;
    private final GameResult gameResult;

    public Choice getPlayerOneChoice() {
        return playerOneChoice;
    }

    public Choice getPlayerTwoChoice() {
        return playerTwoChoice;
    }

    public GameResult getGameResult() {
        return gameResult;
    }

    private static GameResult getGameResult(
            Choice playerOneChoice,
            Choice playerTwoChoice){

        switch(playerOneChoice){
            case PAPER:
                switch(playerTwoChoice){
                    case PAPER: return GameResult.REPLAY;
                    case ROCK: return GameResult.PLAYER_ONE_WINS;
                    case SCISSORS: return GameResult.PLAYER_TWO_WINS;
                }
            case ROCK:
                switch(playerTwoChoice){
                    case PAPER: return GameResult.PLAYER_TWO_WINS;
                    case ROCK: return GameResult.REPLAY;
                    case SCISSORS: return GameResult.PLAYER_ONE_WINS;
                }
            case SCISSORS:
                switch(playerTwoChoice){
                    case PAPER: return GameResult.PLAYER_ONE_WINS;
                    case ROCK: return GameResult.PLAYER_TWO_WINS;
                    case SCISSORS: return GameResult.REPLAY;
                }
        }
        throw new AssertionError("should never be reached");
    }

    public GameData(Choice playerOneChoice, Choice playerTwoChoice) {
        this.playerOneChoice = playerOneChoice;
        this.playerTwoChoice = playerTwoChoice;
        gameResult = getGameResult(playerOneChoice, playerTwoChoice);
    }
}
