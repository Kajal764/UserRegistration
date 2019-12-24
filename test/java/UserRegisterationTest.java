import com.bridgelabz.UserRegisteration;
import org.junit.Assert;
import org.junit.Test;

public class UserRegisterationTest {
    @Test
    public void whenGivenFirstName_ShouldHaveMinimum3CharWithCamelCase(){
        UserRegisteration firstName = new UserRegisteration();
        String fname = firstName.checkFirstName("Kajal");
        Assert.assertEquals("Valid",fname);
    }
    @Test
    public void whenGivenFirstName_WithSmallLetter(){
        UserRegisteration firstName= new UserRegisteration();
        String fname = firstName.checkFirstName("kajal");
        Assert.assertEquals("Invalid",fname);
    }
    public void whenGivenFirstName_With2Character(){
        UserRegisteration firstName= new UserRegisteration();
        String fname = firstName.checkFirstName("ka");
        Assert.assertEquals("Invalid",fname);
    }
    public void whenGivenFirstName_WithOtherLetterCapital(){
        UserRegisteration firstName= new UserRegisteration();
        String fname = firstName.checkFirstName("kAjal");
        Assert.assertEquals("Invalid",fname);
    }

}

