package com.inurely.rulesValidator.rules;

import com.insurely.rulesValidator.rules.LuhnValidationValidationRule;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LuhnValidationValidationRuleTest {

    @Test
    public void testValidLuhn() {
        var rule = new LuhnValidationValidationRule<>(10);
        assertTrue(rule.apply("199001255570"));
    }

    @Test
    public void testInvalidLuhn() {
        var rule = new LuhnValidationValidationRule<>(10);
        assertFalse(rule.apply("199001255571"));
    }
}
