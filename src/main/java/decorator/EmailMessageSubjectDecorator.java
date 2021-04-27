package decorator;

public class EmailMessageSubjectDecorator implements Message{
    private Message emailMessage;
    private String subject;

    public EmailMessageSubjectDecorator(Message emailMessage, String subject) {
        this.emailMessage = emailMessage;
        this.subject = subject;
    }

    @Override
    public String content() {
        return emailMessage.content() + " subject: " + subject;
    }
}
