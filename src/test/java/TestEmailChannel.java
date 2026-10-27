import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEmailChannel {

    PaymentNotificationChannel emailChannel = new EmailChannel();

    @ParameterizedTest
    @ValueSource(strings = "Payment Complete")
    public void testSendMessage(String message){
        String expected = "Sending message through email: " + message;
        String actual = emailChannel.sendMessage(message);
        assertEquals(expected, actual);
    }

}
