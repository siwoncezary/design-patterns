package solid.s;

public class User {
    private final String name;
    private final String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    /**
     * Metoda łamie zasadę Single Resposibility, bo zajamuje się szczegółami budowy maila
     * @return
     */
    public String getUserNameFromEmail(){
        return email.substring(0, email.indexOf("@"));
    }
}
