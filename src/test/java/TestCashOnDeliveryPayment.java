import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCashOnDeliveryPayment {

    @Test
    public void testSendCashOnDeliveryPaymentNotificationThroughEmail(){
        PaymentType payment = new CashOnDeliveryPayment(new EmailChannel());

        String expected = "Send message through email: Cash On Delivery Payment Complete";
        String actual = payment.sendNotification();
        assertEquals(expected, actual);
    }

}
