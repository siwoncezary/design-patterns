package homework.task02;

import java.io.File;

public class EmailMessage {
    private final String to;
    private final String from;
    private final String subject;
    private final String content;
    private final String dw;
    private final String udw;
    private final File attachedFile;

    public EmailMessage(String to, String from, String subject, String content, String dw, String udw, File attachedFile) {
        this.to = to;
        this.from = from;
        this.subject = subject;
        this.content = content;
        this.dw = dw;
        this.udw = udw;
        this.attachedFile = attachedFile;
    }

    static public RequiredToAddress builder(){
        Builder builder = new Builder();
        return to -> {
            builder.to = to;
            return from ->{
                builder.from = from;
                return subject -> {
                    builder.subject = subject;
                    return builder;
                };
            };
        };
    }

    @FunctionalInterface
    public interface RequiredToAddress {
        RequiredFromAddress to(String toAddress);
    }

    @FunctionalInterface
    public interface RequiredFromAddress {
        RequiredSubject from(String fromAddress);
    }

    @FunctionalInterface
    public interface RequiredSubject{
        Builder subject(String subject);
    }

    public static class Builder {
        private String to;
        private String subject;
        private String content;
        private String dw;
        private String udw;
        private String from;
        private File attachedFile;
        private Builder(){
        }

        public Builder content(String content){
            this.content = content;
            return this;
        }

        public Builder dw(String DW){
            this.dw = DW;
            return this;
        }

        public Builder udw(String UDW){
            this.udw = UDW;
            return this;
        }

        public Builder attachedFile(File file){
            this.attachedFile = file;
            return this;
        }

        public EmailMessage build(){
            return new EmailMessage(to,from, subject, content, dw, udw, attachedFile);
        }
    }

    @Override
    public String toString() {
        return "EmailMessage{" +
                "to='" + to + '\'' +
                ", from='" + from + '\'' +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                ", dw='" + dw + '\'' +
                ", udw='" + udw + '\'' +
                ", attachedFile=" + attachedFile +
                '}';
    }
}
