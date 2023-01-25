package ca.tetervak.paperrockscissors.model;

public enum Choice {
    PAPER, ROCK, SCISSORS;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
