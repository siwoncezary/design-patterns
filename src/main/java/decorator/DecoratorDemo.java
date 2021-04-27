package decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Message message = new EmailMessage("Hello!", "world@op.pl");
        message = new EmailMessageSubjectDecorator(message,"greetings");
        System.out.println(message.content());
    }
}
