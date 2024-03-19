package com.insurely.rulesValidator.rules;


import com.insurely.rulesValidator.constants.ValidationFailureReasons;

import java.util.regex.Pattern;

public class AllowedCharactersValidationRule<T> implements ValidationRule<T> {

    private final Pattern pattern;

    public AllowedCharactersValidationRule(String allowedCharacters) {
        this.pattern = Pattern.compile(allowedCharacters);
    }

    @Override
    public boolean apply(T input) {
        return pattern.matcher(input.toString()).matches();
    }

    @Override
    public String getFailureReason() {
        return ValidationFailureReasons.INVALID_SPECIAL_CHARACTERS;
    }
}
