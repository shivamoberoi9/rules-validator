package com.insurely.rulesValidator.rules;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LuhnValidationRuleTest {

    @Test
    public void testValidLuhn() {
        var rule = new LuhnValidationRule<>(10);
        assertTrue(rule.apply("199001255570"));
    }

    @Test
    public void testInvalidLuhn() {
        var rule = new LuhnValidationRule<>(10);
        assertFalse(rule.apply("199001255571"));
    }
}
