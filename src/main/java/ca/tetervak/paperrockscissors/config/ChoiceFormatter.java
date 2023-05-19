package ca.tetervak.paperrockscissors.config;

import ca.tetervak.paperrockscissors.model.Choice;
import org.springframework.format.Formatter;

import java.util.Locale;

@SuppressWarnings("NullableProblems")
public class ChoiceFormatter implements Formatter<Choice> {
    @Override
    public Choice parse(String text, Locale locale) {
        return Choice.valueOf(text.toUpperCase());
    }

    @Override
    public String print(Choice choice, Locale locale) {
        return choice.toString().toLowerCase();
    }
}
