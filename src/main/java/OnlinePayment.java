public class OnlinePayment extends PaymentType{

    public OnlinePayment(PaymentNotificationChannel channel){
        super(channel);
    }

    @Override
    public String sendNotification(){
        return channel.sendMessage("");
    }

}
