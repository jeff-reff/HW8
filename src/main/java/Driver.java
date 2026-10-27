public class Driver {
    public static void main(String[] args){
        PaymentType onlineEmail = new OnlinePayment(new EmailChannel());
        PaymentType onlineSMS = new OnlinePayment(new SmsChannel());
        PaymentType onlinePush = new OnlinePayment(new PushChannel());

        PaymentType cashOnDeliveryEmail = new CashOnDeliveryPayment(new EmailChannel());
        PaymentType cashOnDeliverySMS = new CashOnDeliveryPayment(new SmsChannel());
        PaymentType cashOnDeliveryPush = new CashOnDeliveryPayment(new PushChannel());

        PaymentType bitcoinEmail = new BitcoinPayment(new EmailChannel());
        PaymentType bitcoinSMS = new BitcoinPayment(new SmsChannel());
        PaymentType bitcoinPush = new BitcoinPayment(new PushChannel());



        System.out.println(onlineEmail.sendNotification());
        System.out.println(onlineSMS.sendNotification());
        System.out.println(onlinePush.sendNotification());

        System.out.println(cashOnDeliveryEmail.sendNotification());
        System.out.println(cashOnDeliverySMS.sendNotification());
        System.out.println(cashOnDeliveryPush.sendNotification());

        System.out.println(bitcoinEmail.sendNotification());
        System.out.println(bitcoinSMS.sendNotification());
        System.out.println(bitcoinPush.sendNotification());


    }

}
