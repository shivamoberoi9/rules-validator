package com.insurely.rulesValidator.rules;


import com.insurely.rulesValidator.constants.ValidationFailureReasons;

import java.util.Arrays;

public class DigitsLengthValidationRule<T> implements ValidationRule<T> {
    private final int[] lengths;

    public DigitsLengthValidationRule(int... lengths) {
        this.lengths = lengths;
    }

    @Override
    public boolean apply(T input) {
        String sanitizedInput = input.toString().replaceAll("[^\\d]", "");
        return Arrays.stream(lengths).anyMatch(length -> sanitizedInput.length() == length);
    }

    @Override
    public String getFailureReason() {
        return ValidationFailureReasons.INVALID_LENGTH;
    }
}
