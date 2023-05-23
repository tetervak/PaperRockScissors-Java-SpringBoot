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
            Choice playerTwoChoice) {

        return switch (playerOneChoice) {
            case PAPER -> switch (playerTwoChoice) {
                case PAPER -> GameResult.REPLAY;
                case ROCK -> GameResult.PLAYER_ONE_WINS;
                case SCISSORS -> GameResult.PLAYER_TWO_WINS;
            };
            case ROCK -> switch (playerTwoChoice) {
                case PAPER -> GameResult.PLAYER_TWO_WINS;
                case ROCK -> GameResult.REPLAY;
                case SCISSORS -> GameResult.PLAYER_ONE_WINS;
            };
            case SCISSORS -> switch (playerTwoChoice) {
                case PAPER -> GameResult.PLAYER_ONE_WINS;
                case ROCK -> GameResult.PLAYER_TWO_WINS;
                case SCISSORS -> GameResult.REPLAY;
            };
        };
    }

    public GameData(Choice playerOneChoice, Choice playerTwoChoice) {
        this.playerOneChoice = playerOneChoice;
        this.playerTwoChoice = playerTwoChoice;
        gameResult = getGameResult(playerOneChoice, playerTwoChoice);
    }

    @Override
    public String toString() {
        return "GameData{" +
                "playerOneChoice=" + playerOneChoice +
                ", playerTwoChoice=" + playerTwoChoice +
                ", gameResult=" + gameResult +
                '}';
    }
}
