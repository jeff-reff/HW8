public class EmailChannel implements PaymentNotificationChannel{

    @Override
    public String sendMessage(String message){
        return "Sending message through email: " + message;
    }

}
