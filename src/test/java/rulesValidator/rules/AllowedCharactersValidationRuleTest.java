package rulesValidator.rules;

import com.insurely.rulesValidator.constants.ValidationConstants;
import com.insurely.rulesValidator.rules.AllowedCharactersValidationRule;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AllowedCharactersValidationRuleTest {

    @Test
    public void testValidSpecialChar() {
        var rule = new AllowedCharactersValidationRule<>("[a-zA-ZåäöÅÄÖ ]+");
        assertTrue(rule.apply("Jönköping Ångström"));
    }

    @Test
    public void testInvalidSpecialChar() {
        var rule = new AllowedCharactersValidationRule<>("åäöÅÄÖ");
        assertFalse(rule.apply("John!Doe"));
    }
}
