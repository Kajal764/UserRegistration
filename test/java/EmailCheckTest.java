import com.bridgelabz.UserRegisteration;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.*;

@RunWith(Parameterized.class)
public class EmailCheckTest{

    private String email;
    String result;

    public EmailCheckTest(String email,String result){
        this.email = email;
        this.result = result;
    }


    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com","Valid"},
                {"abc-100@yahoo.com","Valid"},
                {"abc.100@yahoo.com", "Valid"},
                {"abc111@abc.com", "Valid"},
                {"abc-100@abc.net", "Valid"},
                {"abc.100@abc.com.au", "Valid"},
                {"abc@1.com", "Valid"},
                {"abc@gmail.com.com", "Valid"},
                {"abc@.com.my", "InValid"},
                {"abc123@gmail.a", "InValid"},
                {"abc123@.com", "InValid"},
                {"abc123@.com.com", "InValid"},
                {".abc@abc.com", "InValid"},
                {"abc()*@gmail.com", "InValid"},
                {"abc@%*.com", "InValid"},
                {"abc..2002@gmail.com", "InValid"},
                {"abc.@gmail.com", "InValid"},
                {"abc@abc@gmail.com", "InValid"},
                {"abc@gmail.com.1a", "InValid"},
                {"abc@gmail.com.aa.au", "InValid"}});

    }


        @Test
        public void checkEmailId () {
            UserRegisteration password = new UserRegisteration();
            String pw = password.checkEmailId(email);
            Assert.assertEquals(pw,result);
        }
    }
