import URV.userRegistration;

import org.junit.Assert;
import org.junit.Test;

public class userRegistrationTest {
    boolean check = true;
    boolean checkFalse = false;
    /**
     * @method testValidateFirstName test Happy case for first name
     * @Test take a correct input where first latter is Cap
     * @return true
     */
    @Test
    public void testValidateFirstName() {
        userRegistration userValidator = new userRegistration();
        boolean result = userValidator.isValidFirstName("Anurag");
        Assert.assertEquals(check, result);
    }

    /**
     * @method testValidateLastName test Happy case for Last name
     * @Test take a correct input
     * @return true
     */
    @Test
    public void testValidateLastName() {
        userRegistration userValidator = new userRegistration();
        boolean result = userValidator.isValidLastName("Bhardwaj");
        Assert.assertEquals(check, result);
    }
    /**
     * @method testValidateLastName test Happy case for email
     * @Test take a correct input
     * @return true
     */

    @Test
    public void testValidateEmail() {
        userRegistration userValidator = new userRegistration();
        boolean result = userValidator.isValidEmail("abc.@bl.com");
        Assert.assertEquals(check, result);
    }

    /**
     * @method testValidateLastName test Happy case for mobile number
     * @Test take a correct input
     * @return true
     */
    @Test
    public void testValidateMobileNumber() {
        userRegistration userValidator = new userRegistration();
        boolean result = userValidator.isValidMobileNumber("+91 6350391128");
        Assert.assertEquals(check, result);
    }

    /**
     * @method testValidateLastName test Happy case for password
     * @Test take a correct input
     * @return true
     */
    @Test
    public void testValidatePassword() {
        userRegistration userValidator = new userRegistration();
        boolean result = userValidator.isValidPassword("ANU1@-_rag");
        Assert.assertEquals(check, result);
    }


    /**
     * @method testValidateFirstName test Sad case for first name
     * @Test take a correct input where first latter is Cap
     * @return true
     */
    @Test
    public void testNotValidateFirstName() {
        userRegistration userValidator = new userRegistration();
        boolean result = userValidator.isValidFirstName("anurag");
        Assert.assertEquals(checkFalse, result);
    }

    /**
     * @method testValidateLastName test sad case for Last name
     * @Test take a correct input
     * @return true
     */
    @Test
    public void testNotValidateLastName() {
        userRegistration userValidator = new userRegistration();
        boolean result = userValidator.isValidLastName("bhardwaj");
        Assert.assertEquals(checkFalse, result);
    }
    /**
     * @method testValidateLastName test sad case for email
     * @Test take a correct input
     * @return true
     */

    @Test
    public void testNotValidateEmail() {
        userRegistration userValidator = new userRegistration();
        boolean result = userValidator.isValidEmail("abc.@blcom");
        Assert.assertEquals(checkFalse, result);
    }

    /**
     * @method testValidateLastName test sad case for mobile number
     * @Test take a correct input
     * @return true
     */
    @Test
    public void testNotValidateMobileNumber() {
        userRegistration userValidator = new userRegistration();
        boolean result = userValidator.isValidMobileNumber("916350391128");
        Assert.assertEquals(checkFalse, result);
    }

    /**
     * @method testValidateLastName test sad case for password
     * @Test take a correct input
     * @return true
     */
    @Test
    public void testNotValidatePassword() {
        userRegistration userValidator = new userRegistration();
        boolean result = userValidator.isValidPassword("anu@-_rag");
        Assert.assertEquals(checkFalse, result);
    }

}