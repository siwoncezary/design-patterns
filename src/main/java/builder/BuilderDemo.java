package builder;

public class BuilderDemo {
    public static void main(String[] args) {
        EmailMessage messageFromConstructor = new EmailMessage("ala@op.pl","temat");
        EmailMessage.Builder builder = EmailMessage.builder().emailAddress("ala@op.pl").subject(null);
        EmailMessage messageFromBuilder = builder
                .emailAddress("ala@op.pl")
                .subject("temat")
                .content("Treść wiadomości")
                .build();
        EmailMessage messageFromNewBuilder = EmailMessage.builder().emailAddress("aaa@op.pl").subject("").build();
        EmailMessage messageFromExistingBuilder = builder.emailAddress("newaddress@op.pl").build();
        System.out.println(messageFromBuilder);
        System.out.println(messageFromExistingBuilder);
        System.out.println(messageFromNewBuilder);
    }
}
