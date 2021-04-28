package solid.i;

/**
 * Klasa implementuje zbyt szeroki interfejs
 */
public class SMSMessenger implements Messenger{
    @Override
    public void sendEmail() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void sendSMS() {
        System.out.println("Sending SMS");
    }

    @Override
    public void sendNotification() {
        throw new UnsupportedOperationException();
    }
}
