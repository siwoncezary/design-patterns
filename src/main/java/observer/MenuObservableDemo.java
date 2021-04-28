package observer;

import java.util.List;
import java.util.Scanner;

public class MenuObservableDemo {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        MenuItem loadFile = new MenuItem("Wczytaj plik", 1);
        MenuItem saveFile = new MenuItem("Zapisz plik", 2);
        /*
            Dodaj pozycję menu o etykiecie 'Potęguj liczbę' o numerze 3
            która wczyta z klawiatury liczbę double i wyświetli jej potęgę
         */
        MenuItem quit = new MenuItem("Wyjdź", 0);
        loadFile.addObserver(()-> {
            System.out.println("Wpisz nazwę pliku");
        });
        saveFile.addObserver(() ->{
            System.out.println("Podaj nazwę pliku do zapisu");
        });
        quit.addObserver(() -> {
            System.exit(0);
        });
        Menu menu = new Menu(List.of(loadFile, saveFile, quit));

        while(true){
            menu.print();
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                scanner.nextLine();
                if (!menu.process(number)){
                    System.out.println("Brak takiej opcji!!!");
                }
            } else {
                System.out.println("Wpisz proszę liczbę całkowitą");
                scanner.nextLine();
            }
        }
    }
}
