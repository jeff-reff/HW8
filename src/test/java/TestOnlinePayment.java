import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOnlinePayment {

    @Test
    public void sendOnlinePaymentNotificationThroughEmail(){
        PaymentType payment = new OnlinePayment(new EmailChannel());

        String expected = "Sending message through email: Online Payment Complete";
        String actual = payment.sendNotification();
        assertEquals(expected, actual);
    }

    @Test
    public void sendOnlinePaymentNotificationThroughSMS(){
        PaymentType payment = new OnlinePayment(new SmsChannel());

        String expected = "Sending message through SMS: Online Payment Complete";
        String actual = payment.sendNotification();
        assertEquals(expected, actual);
    }

}
