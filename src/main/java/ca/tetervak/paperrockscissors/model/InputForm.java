package ca.tetervak.paperrockscissors.model;

public class InputForm {

    private Choice userChoice = Choice.ROCK;

    public InputForm() {
    }

    public InputForm(Choice userChoice) {
        this.userChoice = userChoice;
    }

    public Choice getUserChoice() {
        return userChoice;
    }

    public void setUserChoice(Choice userChoice) {
        this.userChoice = userChoice;
    }
}
