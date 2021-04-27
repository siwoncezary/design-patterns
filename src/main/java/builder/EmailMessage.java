package builder;

import java.io.File;

public class EmailMessage {
    private final String emailAddress;
    private final String subject;
    private final String content;
    private final String DW;
    private final String UDW;
    private final File attachedFile;

    public EmailMessage(String emailAddress){
        this.emailAddress = emailAddress;
        this.attachedFile = null;
        this.DW = null;
        this.UDW = null;
        this.content = null;
        this.subject = null;
    }


    public EmailMessage(String emailAddress, String subject){
        this.emailAddress = emailAddress;
        this.attachedFile = null;
        this.DW = null;
        this.UDW = null;
        this.content = null;
        this.subject = subject;
    }
    public EmailMessage(String emailAddress, String subject, String content){
        this.emailAddress = emailAddress;
        this.attachedFile = null;
        this.DW = null;
        this.UDW = null;
        this.content = content;
        this.subject = subject;
    }

    public EmailMessage(String emailAddress, String subject, String content, String DW, String UDW, File attachedFile) {
        this.emailAddress = emailAddress;
        this.subject = subject;
        this.content = content;
        this.DW = DW;
        this.UDW = UDW;
        this.attachedFile = attachedFile;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new EmailMessage(this.emailAddress, this.subject, this.content, this.DW, this.UDW
        ,this.attachedFile);
    }

    static public RequiredEmailAddress builder(){
        return new Builder();
    }

    public interface RequiredEmailAddress{
        RequiredSubject emailAddress(String address);
    }

    public interface RequiredSubject{
        Builder subject(String subject);
    }

    public static class Builder implements RequiredEmailAddress, RequiredSubject{
        private String emailAddress;
        private String subject;
        private String content;
        private String DW;
        private String UDW;
        private File attachedFile;
        private Builder(){
        }

        public Builder emailAddress(String emailAddress){
            this.emailAddress = emailAddress;
            return this;
        }

        public Builder subject(String subject){
            this.subject = subject;
            return this;
        }

        public Builder content(String content){
            this.content = content;
            return this;
        }

        public Builder DW(String DW){
            this.DW = DW;
            return this;
        }

        public Builder UDW(String UDW){
            this.UDW = UDW;
            return this;
        }

        public Builder attachedFile(File file){
            this.attachedFile = file;
            return this;
        }

        public EmailMessage build(){
            return new EmailMessage(emailAddress, subject, content, DW, UDW, attachedFile);
        }
    }

    @Override
    public String toString() {
        return "EmailMessage{" +
                "emailAddress='" + emailAddress + '\'' +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                ", DW='" + DW + '\'' +
                ", UDW='" + UDW + '\'' +
                ", attachedFile=" + attachedFile +
                '}';
    }
}
