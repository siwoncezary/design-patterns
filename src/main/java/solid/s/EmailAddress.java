package solid.s;

public class EmailAddress {
    private final String email;

    public EmailAddress(String email) {
        this.email = email;
    }
    public String getUserAt() {
        return email.substring(0, email.indexOf("@"));
    }
    public String getTopDomain(){
        return email.substring(email.lastIndexOf("."));
    }

    public String getEmail() {
        return email;
    }
}
