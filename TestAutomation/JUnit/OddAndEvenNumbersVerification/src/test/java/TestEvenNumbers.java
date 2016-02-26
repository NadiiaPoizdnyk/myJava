import org.junit.Assert;
import org.junit.Test;

public class TestEvenNumbers {




    @Test
    public void testEvenNumb() throws Exception {
        OddAndEvenNumbers oddAndEvenNumbers = new OddAndEvenNumbers();
        Assert.assertEquals(true,oddAndEvenNumbers.verifyOdevity(0));
        Assert.assertEquals(true,oddAndEvenNumbers.verifyOdevity(516));
        Assert.assertEquals(false,oddAndEvenNumbers.verifyOdevity(5555));
        System.out.println("===================================");
    }
}
