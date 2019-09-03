import org.junit.Test;

import static org.junit.Assert.*;

public class FooBarTest {

    @Test
    public void fooBar() {

        String expected = "1 2 foo 4 bar foo 7 8 foo bar 11 foo 13 14 foobar 16 17 foo 19 bar foo 22 23 foo bar 26 foo 28 29 foobar 31 32 foo 34 bar foo 37 38 foo bar 41 foo 43 44 foobar 46 47 foo 49 bar foo 52 53 foo bar 56 foo 58 59 foobar 61 62 foo 64 bar foo 67 68 foo bar 71 foo 73 74 foobar 76 77 foo 79 bar foo 82 83 foo bar 86 foo 88 89 foobar 91 92 foo 94 bar foo 97 98 foo bar ";
        assertEquals(expected, FooBar.fooBar());
    }

    @Test //Normal expected scenario
    public void fooBarWithValidInputsOneToTen() {

        String expected = "1 2 foo 4 bar foo 7 8 foo bar ";
        try {
            assertEquals(expected, FooBar.fooBarWithInputs(1, 10));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(expected = Exception.class) //Inputs are the wrong way round - should throw exception
    public void fooBarWithInvalidRange() throws Exception {
            FooBar.fooBarWithInputs(10, 1);
    }

    @Test // Both inputs negative but valid
    public void fooBarWithNegativeInputs() {
        String expected = "bar -19 foo -17 -16 foobar -14 -13 foo -11 bar foo -8 -7 foo bar ";
        try {
            assertEquals(expected, FooBar.fooBarWithInputs(-20, -5));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Both inputs the same
    public void fooBarWithEqualInputs() {
        String expected = "foo ";
        try {
            assertEquals(expected, FooBar.fooBarWithInputs(3,3));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}