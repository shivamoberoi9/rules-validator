package com.inurely.rulesValidator.rules;

import com.insurely.rulesValidator.rules.NonNullOrBlankValidationRule;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NonNullOrBlankValidationRuleTest {

    @Test
    public void testValidNotBlank() {
        var rule = new NonNullOrBlankValidationRule<>();
        assertTrue(rule.apply("John Doe"));
    }

    @Test
    public void testInvalidNotBlank() {
        var rule = new NonNullOrBlankValidationRule<>();
        assertFalse(rule.apply(""));
    }
}
