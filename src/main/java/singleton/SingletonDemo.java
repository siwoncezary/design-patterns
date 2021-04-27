package singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        //referencja do singletona
        EagerSingleton singleton = EagerSingleton.SINGLETON;
        //inna referencja do singletona
        EagerSingleton newInstance = EagerSingleton.SINGLETON;
        //obie referencje wskazują ta ten sam obiekt Singletona
        System.out.println(singleton == newInstance);
        //testowliśmy, czy samo odwołanie do klasy Singletona wywołuje
        //konstruktor instancji - kazuje się że nie
        //tylko odwoałanie do EagerSingleton.SINGLETON powoduje utworznie instancji
        System.out.println(EagerSingleton.VERSION);
        EnumSingleton.getInstance().printMenu();
    }
}
