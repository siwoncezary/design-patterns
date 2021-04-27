package decorator;

public class EmailMessage implements Message{
    private String content;
    private String address;

    public EmailMessage(String content, String address) {
        this.content = content;
        this.address = address;
    }

    @Override
    public String content() {
        return "from: " + address + " content: " + content;
    }
}
