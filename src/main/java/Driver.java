public class Driver {
    public static void main(String[] args){
        PaymentType onlineEmail = new OnlinePayment(new EmailChannel());
        PaymentType onlineSMS = new OnlinePayment(new SmsChannel());

        PaymentType cashOnDeliveryEmail = new CashOnDeliveryPayment(new EmailChannel());
        PaymentType cashOnDeliverySMS = new CashOnDeliveryPayment(new SmsChannel());

        System.out.println(onlineEmail.sendNotification());
        System.out.println(onlineSMS.sendNotification());

        System.out.println(cashOnDeliveryEmail.sendNotification());
        System.out.println(cashOnDeliverySMS.sendNotification());

    }

}
