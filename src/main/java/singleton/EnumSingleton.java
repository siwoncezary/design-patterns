package singleton;

public enum EnumSingleton {
    INSTANCE;

    public void printMenu(){
        System.out.println("Menu");
        System.out.println("1. Opcja 1");
        System.out.println("2. Opcja 2");
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
