public class PushChannel implements PaymentNotificationChannel{

    @Override
    public String sendMessage(String message){
        return "Sending message through push: " + message;
    }

}
