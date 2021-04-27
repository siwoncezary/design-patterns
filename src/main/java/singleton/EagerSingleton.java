package singleton;

public class EagerSingleton {
    public static final EagerSingleton SINGLETON = new EagerSingleton();
    public static final int VERSION = 100;

    private EagerSingleton(){
        System.out.println("SINGLETON CREATED");
        //zabezpieczenie przed tworzeniem obiektu metodą refleksji
        System.setSecurityManager(new SecurityManager());
    }

    public void printMenu(){
        System.out.println("1. Opcja 1");
        System.out.println("2. Opcja 2");
        System.out.println("3. Opcja 3");
    }
}
