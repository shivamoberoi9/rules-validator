package com.inurely.rulesValidator.rules;

import com.insurely.rulesValidator.rules.DigitsLengthValidationRule;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class DigitsLengthValidationRuleTest {

    @Test
    public void testValidLength() {
        var rule = new DigitsLengthValidationRule<>(12, 10);
        assertTrue(rule.apply("19900125-5570"));
    }

    @Test
    public void testInvalidLength() {
        var rule = new DigitsLengthValidationRule<>(12, 10);
        assertFalse(rule.apply("19900125-557"));
    }
}
