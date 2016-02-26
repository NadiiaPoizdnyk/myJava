import org.junit.Assert;
import org.junit.Test;

public class TestNotNumbers {



    @Test
    public void testNotANumbers() throws Exception {
        OddAndEvenNumbers oddAndEvenNumbers = new OddAndEvenNumbers();
        Assert.assertEquals(false,oddAndEvenNumbers.verifyNotANumb(" "));
        Assert.assertEquals(false,oddAndEvenNumbers.verifyNotANumb(" 56"));
        Assert.assertEquals(false,oddAndEvenNumbers.verifyNotANumb("+"));
        Assert.assertEquals(false,oddAndEvenNumbers.verifyNotANumb("k"));
        Assert.assertEquals(true,oddAndEvenNumbers.verifyOdevity(516));
        System.out.println("===================================");
    }

}
