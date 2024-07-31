package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ValidBracketTest {

    @ParameterizedTest
    @ValueSource(strings = {"{}", "{{}}", "[{()}]", "[[]]", "{{a}}"})
    public void testValidBracket(String chars) {
        assertTrue(ValidBracket.validBrackets(chars));
    }

    @ParameterizedTest
    @ValueSource(strings = {"[]]", "{}}", "[())", "(()", "}{"})
    public void testInValidBracket(String chars) {
        assertFalse(ValidBracket.validBrackets(chars));
    }
}