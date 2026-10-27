import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBitcoinPayment {

    @Test
    public void testBitcoinPaymentThroughEmail(){
        PaymentType payment = new BitcoinPayment(new EmailChannel());

        String expected = "Sending message through email: Bitcoin Payment Complete";
        String actual = payment.sendNotification();
        assertEquals(expected, actual);
    }
}
