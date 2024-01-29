package ca.tetervak.paperrockscissors.model;

public class GameData {
    private final Choice userChoice;
    private final Choice computerChoice;
    private final GameResult gameResult;

    public Choice getUserChoice() {
        return userChoice;
    }

    public Choice getComputerChoice() {
        return computerChoice;
    }

    public GameResult getGameResult() {
        return gameResult;
    }

    private static GameResult getGameResult(
            Choice userChoice,
            Choice computerChoice) {

        return switch (userChoice) {
            case PAPER -> switch (computerChoice) {
                case PAPER -> GameResult.REPLAY;
                case ROCK -> GameResult.USER_WINS;
                case SCISSORS -> GameResult.COMPUTER_WINS;
            };
            case ROCK -> switch (computerChoice) {
                case PAPER -> GameResult.COMPUTER_WINS;
                case ROCK -> GameResult.REPLAY;
                case SCISSORS -> GameResult.USER_WINS;
            };
            case SCISSORS -> switch (computerChoice) {
                case PAPER -> GameResult.USER_WINS;
                case ROCK -> GameResult.COMPUTER_WINS;
                case SCISSORS -> GameResult.REPLAY;
            };
        };
    }

    public GameData(Choice userChoice, Choice computerChoice) {
        this.userChoice = userChoice;
        this.computerChoice = computerChoice;
        gameResult = getGameResult(userChoice, computerChoice);
    }

    @Override
    public String toString() {
        return "GameData{" +
                "userChoice=" + userChoice +
                ", computerChoice=" + computerChoice +
                ", gameResult=" + gameResult +
                '}';
    }
}
