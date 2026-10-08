//import org.junit.Test;
//
//import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertFalse;
//
//public class UserInfoLabTest {
//
//    @Test
//    public void testGenerateUsernameTypicalCases() {
//        assertEquals("johsmi", UserInfoLab.generateUsername("John", "Smith"));
//        assertEquals("emmjoh", UserInfoLab.generateUsername("Emma", "Johnson"));
//        assertEquals("tommcj", UserInfoLab.generateUsername("Tom", "McJava"));
//        assertEquals("sarwhi", UserInfoLab.generateUsername("Sara", "White"));
//    }
//
//
//    @Test
//    public void testGenerateUsernameWhenFirstNameIsShort() {
//        assertEquals("ades", UserInfoLab.generateUsername("A", "DeSteph"));
//        assertEquals("alies", UserInfoLab.generateUsername("Ali", "Es"));
//    }
//
//
//    @Test
//    public void testGenerateUsernameWhenBothNamesAreShort() {
//        assertEquals("alli", UserInfoLab.generateUsername("Al", "Li"));
//        assertEquals("miwu", UserInfoLab.generateUsername("Mi", "Wu"));
//    }
//
//    @Test
//    public void testValidatePassword() {
//        System.out.println("\nTesting password");
//        assertTrue(UserInfoLab.validatePassword("Secure123"));
//        assertFalse(UserInfoLab.validatePassword("simplepass")); // No capital letter
//        assertFalse(UserInfoLab.validatePassword("short1")); // Too short
//        assertFalse(UserInfoLab.validatePassword("NoNumberHere!")); // No digit
//        assertTrue(UserInfoLab.validatePassword("Sara1234"));
//    }
//
//    @Test
//    public void testMaskCreditCardValid() {
//        assertEquals("**** **** **** 5678", UserInfoLab.maskCreditCard("1234567812345678"));
//        assertEquals("**** **** **** 7654", UserInfoLab.maskCreditCard("9876543210987654"));
//        assertEquals("**** **** **** 8888", UserInfoLab.maskCreditCard("5555666677778888"));
//        assertEquals("**** **** **** 1234", UserInfoLab.maskCreditCard("1234123412341234"));
//    }
//
//
//    @Test
//    public void testMaskCreditCardTooShort() {
//        assertEquals("N/A", UserInfoLab.maskCreditCard("876543218765"));
//    }
//
//
//    @Test
//    public void testMaskCreditCardTooLong() {
//        assertEquals("N/A", UserInfoLab.maskCreditCard("123456781234567890"));
//    }
//
//
//    @Test
//    public void testMaskCreditCardContainsNonDigits() {
//        assertEquals("N/A", UserInfoLab.maskCreditCard("111122224444AD24"));
//        assertEquals("N/A", UserInfoLab.maskCreditCard("1234 5678 1234 5678"));
//    }
//
//}
