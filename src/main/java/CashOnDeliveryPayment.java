public class CashOnDeliveryPayment extends PaymentType{

    public CashOnDeliveryPayment (PaymentNotificationChannel channel){
        super(channel);
    }

    @Override
    public String sendNotification(){
        return "";
    }

}
