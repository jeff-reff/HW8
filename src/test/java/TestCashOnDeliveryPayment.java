import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCashOnDeliveryPayment {

    @Test
    public void testSendCashOnDeliveryPaymentNotificationThroughEmail(){
        PaymentType payment = new CashOnDeliveryPayment(new EmailChannel());

        String expected = "Sending message through email: Cash On Delivery Payment Complete";
        String actual = payment.sendNotification();
        assertEquals(expected, actual);
    }

    @Test
    public void testSendCashOnDeliveryPaymentNotificationThroughSMS(){
        PaymentType payment = new CashOnDeliveryPayment(new SmsChannel());

        String expected = "Sending message through SMS: Cash On Delivery Payment Complete";
        String actual = payment.sendNotification();
        assertEquals(expected, actual);
    }

}
