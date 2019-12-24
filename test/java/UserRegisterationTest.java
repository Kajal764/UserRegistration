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

}

