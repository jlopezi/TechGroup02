package abel.tic_tac_toe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TicTacToeTest {

    @Test
    void test_validator() {
        String[][] matrixTest = {{"X", "X", "X"}, {"-", "O", "-"}, {"-", "O", "O"}};
        assertTrue(TicTacToe.validator(matrixTest));
    }


    @Test
    void testValidatorRow() {
        String[][] matrixTest = {{"X", "-", "-"}, {"X", "O", "-"}, {"X", "O", "O"}};
        assertTrue(TicTacToe.validator(matrixTest));
    }

    @Test
    void testValidatorNegative() {
        String[][] matrixTest2 = {{"X", "-", "-"}, {"X", "O", "X"}, {"-", "O", "O"}};
        assertFalse(TicTacToe.validator(matrixTest2));
    }
}