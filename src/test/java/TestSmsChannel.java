import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSmsChannel {
    PaymentNotificationChannel smsChannel = new SmsChannel();

    @ParameterizedTest
    @ValueSource(strings = "Payment Complete")
    public void testSendMessage(String message){
        String expected = "Sending message through SMS: " + message;
        String actual = smsChannel.sendMessage(message);
        assertEquals(expected, actual);
    }

}
