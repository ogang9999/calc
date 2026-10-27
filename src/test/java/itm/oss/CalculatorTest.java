package itm.oss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Calculator tests for OSS class")
    class CalculatorTest {
        private final Calculator calc = new Calculator();

        @Test
        @DisplayName("Test for function add")
        void add() {
            assertEquals(10, calc.add(5, 5), "5 + 5 should be 10");
        }
        @Test 
        @DisplayName("Test for prime")
        void prime() {
            assertTrue(calc.isPrime(2), "2 is prime number");
        }
        @Test 
        @DisplayName("Test for negative prime")
        void primeNegative() {
            assertFalse(calc.isPrime(-4), "-4 is not prime");
        }

    }