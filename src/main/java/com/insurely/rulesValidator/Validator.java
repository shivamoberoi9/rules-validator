package com.insurely.rulesValidator;

import com.insurely.rulesValidator.exceptions.ValidationException;

public interface Validator<T> {
    boolean validate(T input) throws ValidationException;
}
