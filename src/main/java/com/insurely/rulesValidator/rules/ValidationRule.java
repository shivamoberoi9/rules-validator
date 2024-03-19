package com.insurely.rulesValidator.rules;

public interface ValidationRule<T> {
    boolean apply(T input);
    String getFailureReason();
}
