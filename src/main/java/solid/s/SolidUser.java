package solid.s;

public class SolidUser {
    private final String  name;
    private final EmailAddress address;

    public SolidUser(String name, EmailAddress address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public EmailAddress getAddress() {
        return address;
    }
}
