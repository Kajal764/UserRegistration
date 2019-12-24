import com.bridgelabz.UserRegisteration;
import org.junit.Assert;
import org.junit.Test;

public class UserRegisterationTest {
    //Test cases to validate first name
    @Test
    public void whenGivenFirstName_ShouldHaveMinimum3CharWithCamelCase(){
        UserRegisteration firstName = new UserRegisteration();
        String fname = firstName.checkName("Kajal");
        Assert.assertEquals("Valid",fname);
    }
    @Test
    public void whenGivenFirstName_WithSmallLetter(){
        UserRegisteration firstName= new UserRegisteration();
        String fname = firstName.checkName("kajal");
        Assert.assertEquals("Invalid",fname);
    }
    @Test
    public void whenGivenFirstName_With2Character(){
        UserRegisteration firstName= new UserRegisteration();
        String fname = firstName.checkName("ka");
        Assert.assertEquals("Invalid",fname);
    }
    @Test
    public void whenGivenFirstName_WithOtherLetterCapital(){
        UserRegisteration firstName= new UserRegisteration();
        String fname = firstName.checkName("kAjal");
        Assert.assertEquals("Invalid",fname);
    }


    //Test case to validate last name
    @Test
    public void whenGivenLastName_ShouldHaveMinimum3CharWithCamelCase(){
        UserRegisteration lastName = new UserRegisteration();
        String lname = lastName.checkName("Waghmare");
        Assert.assertEquals("Valid",lname);
    }
    @Test
    public void whenGivenLastName_WithSmallLetter(){
        UserRegisteration lastName= new UserRegisteration();
        String lname = lastName.checkName("waghmare");
        Assert.assertEquals("Invalid",lname);
    }
    @Test
    public void whenGivenLastName_With2Character(){
        UserRegisteration lastName= new UserRegisteration();
        String lname = lastName.checkName("ma");
        Assert.assertEquals("Invalid",lname);
    }
    @Test
    public void whenGivenLastName_WithOtherLetterCapital(){
        UserRegisteration lastName= new UserRegisteration();
        String lname = lastName.checkName("wagHmare");
        Assert.assertEquals("Invalid",lname);
    }


    //Test Cases to validate email Id
    @Test
    public void whenGivenEmail_Valid() {
        UserRegisteration email = new UserRegisteration();
        String emailId = email.checkEmailId("abc.xyz@bl.co.in");
        Assert.assertEquals("Valid",emailId);
    }
    @Test
    public void whenGivenEmail_WithoutatSignShouldReturnInvalid() {
        UserRegisteration email = new UserRegisteration();
        String emailId = email.checkEmailId("abc.xyzbl.co.in");
        Assert.assertEquals("InValid",emailId);
    }

    @Test
    public void whenGivenEmail_StartWithDotShouldReturnInvalid() {
        UserRegisteration email = new UserRegisteration();
        String emailId = email.checkEmailId(".abc.xyz@bl.co.in");
        Assert.assertEquals("InValid",emailId);
    }


    //Test Cases To Validate EmailId
    @Test
    public void whenGivenMobileNo_Valid() {
        UserRegisteration mobno = new UserRegisteration();
        String num = mobno.checkMobileNo("+91 7666612345");
        Assert.assertEquals("Valid",num);
    }

    @Test
    public void whenGivenMobileNo_WithoutCountryCodeShouldReturnInvalid() {
        UserRegisteration mobno = new UserRegisteration();
        String num = mobno.checkMobileNo("+ 7666612345");
        Assert.assertEquals("InValid",num);
    }

    @Test
    public void whenGivenMobileNo_WithoutSpaceShouldReturnInvalid() {
        UserRegisteration mobno = new UserRegisteration();
        String num = mobno.checkMobileNo("+917666612345");
        Assert.assertEquals("InValid",num);
    }

    @Test
    public void whenGivenMobileNo_LessThan10DiditShouldReturnInvalid() {
        UserRegisteration mobno = new UserRegisteration();
        String num = mobno.checkMobileNo("+91 76612345");
        Assert.assertEquals("InValid",num);
    }
    @Test
    public void whenGivenMobileNo_greaterThan10DiditShouldReturnInvalid() {
        UserRegisteration mobno = new UserRegisteration();
        String num = mobno.checkMobileNo("+91 766666612345");
        Assert.assertEquals("InValid",num);
    }


}

