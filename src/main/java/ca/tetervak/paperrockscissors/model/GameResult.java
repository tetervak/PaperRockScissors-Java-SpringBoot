package ca.tetervak.paperrockscissors.model;

public enum GameResult {
    USER_WINS,
    COMPUTER_WINS,
    REPLAY;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
