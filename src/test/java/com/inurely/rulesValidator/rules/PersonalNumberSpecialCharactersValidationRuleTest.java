package com.inurely.rulesValidator.rules;

import com.insurely.rulesValidator.rules.PersonalNumberSpecialCharactersValidationRule;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonalNumberSpecialCharactersValidationRuleTest {

    @Test
    public void testValidSpecialChar() {
        var rule = new PersonalNumberSpecialCharactersValidationRule<>(6, 8, "+-");
        assertTrue(rule.apply("19900125-5570"));
    }

    @Test
    public void testInvalidSpecialChar() {
        var rule = new PersonalNumberSpecialCharactersValidationRule<>(6, 8, "+-");
        assertFalse(rule.apply("19900125*5570"));
    }
}
