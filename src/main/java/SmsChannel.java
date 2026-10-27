public class SmsChannel implements PaymentNotificationChannel{

    @Override
    public String sendMessage(String message){
        return "Sending message through SMS: " + message;
    }

}
