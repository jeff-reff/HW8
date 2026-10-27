public class BitcoinPayment extends PaymentType{

    public BitcoinPayment (PaymentNotificationChannel channel){
        super(channel);
    }

    @Override
    public String sendNotification(){
        return channel.sendMessage("Bitcoin Payment Complete");
    }

}
