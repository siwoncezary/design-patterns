package solid.s;

public class UserDemo {
    public static void main(String[] args) {
        User user = new User("ada", "adusia@op.pl");
        System.out.println(user.getUserNameFromEmail());
        SolidUser solidUser = new SolidUser("ada", new EmailAddress("adusia@op.pl"));
        System.out.println(solidUser.getAddress().getUserAt());
    }
}
