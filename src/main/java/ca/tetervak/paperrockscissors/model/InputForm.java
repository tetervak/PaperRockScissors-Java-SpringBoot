package ca.tetervak.paperrockscissors.model;

public class InputForm {

    private final Choice userChoice;

    public InputForm(Choice userChoice) {
        this.userChoice = userChoice;
    }

    public Choice getUserChoice() {
        return userChoice;
    }

}
