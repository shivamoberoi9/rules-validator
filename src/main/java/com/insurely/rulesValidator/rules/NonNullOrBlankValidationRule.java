package com.insurely.rulesValidator.rules;


import com.insurely.rulesValidator.constants.ValidationFailureReasons;

public class NonNullOrBlankValidationRule<T> implements ValidationRule<T> {
    @Override
    public boolean apply(T input) {
        return (input != null && !input.toString().trim().isEmpty());
    }
    @Override
    public String getFailureReason() {
        return ValidationFailureReasons.INVALID_INPUT;
    }
}
