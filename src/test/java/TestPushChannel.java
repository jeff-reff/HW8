import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPushChannel {

    @ParameterizedTest
    @ValueSource(strings = "Payment Complete")
    public void sendMessage(String message){
        PaymentNotificationChannel pushChannel = new PushChannel();

        String expected = "Sending message through push: " + message;
        String actual = pushChannel.sendMessage(message);
        assertEquals(expected, actual);
    }

}
