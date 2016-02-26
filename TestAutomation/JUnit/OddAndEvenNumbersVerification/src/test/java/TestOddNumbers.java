import org.junit.Assert;
import org.junit.Test;

public class TestOddNumbers {




    @Test
    public void testEvenNumb() throws Exception {
        OddAndEvenNumbers oddAndEvenNumbers = new OddAndEvenNumbers();
        Assert.assertEquals(false,oddAndEvenNumbers.verifyOdevity(169));
        Assert.assertEquals(false,oddAndEvenNumbers.verifyOdevity(5555));
        Assert.assertEquals(true,oddAndEvenNumbers.verifyOdevity(2));
        System.out.println("===================================");
    }
}
