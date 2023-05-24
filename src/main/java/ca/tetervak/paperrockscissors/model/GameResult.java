package ca.tetervak.paperrockscissors.model;

public enum GameResult {
    PLAYER_ONE_WINS,
    PLAYER_TWO_WINS,
    REPLAY;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
