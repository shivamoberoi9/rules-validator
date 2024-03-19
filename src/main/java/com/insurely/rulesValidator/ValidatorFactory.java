package com.insurely.rulesValidator;

import com.insurely.rulesValidator.exceptions.ValidationException;
import com.insurely.rulesValidator.rules.ValidationRule;

public class ValidatorFactory {
    @SafeVarargs
    public static <T> Validator<T> createValidator(ValidationRule<T>... validationRules) {
        return input -> {
            for (ValidationRule<T> validationRule : validationRules) {
                if (!validationRule.apply(input)) {
                    String failureReason = validationRule.getFailureReason();
                    throw new ValidationException(failureReason);
                }
            }
            return true;
        };
    }
}