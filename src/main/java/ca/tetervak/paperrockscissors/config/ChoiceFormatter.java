package ca.tetervak.paperrockscissors.config;

import ca.tetervak.paperrockscissors.model.Choice;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class ChoiceFormatter implements Formatter<Choice> {
    @Override
    public Choice parse(String text, Locale locale) throws ParseException {
        return Choice.valueOf(text.toUpperCase());
    }

    @Override
    public String print(Choice choice, Locale locale) {
        return choice.toString().toLowerCase();
    }
}
