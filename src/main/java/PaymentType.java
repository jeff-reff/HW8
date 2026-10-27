public abstract class PaymentType {
    protected PaymentNotificationChannel channel;

    public PaymentType(PaymentNotificationChannel channel){
        this.channel = channel;
    }

    public abstract String sendNotification();

}
