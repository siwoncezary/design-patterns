package solid.i;

/**
 * Klasa korzysta z segregacji interfejsów i implementuje tylko potrzebne metody
 */
public class SegregatedSMSMessenger implements MessengerForSMS{
    @Override
    public void sendSMS() {
        System.out.println("Sending SMS");
    }
}
