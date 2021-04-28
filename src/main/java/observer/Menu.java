package observer;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Menu {
    public static final String MESSAGE_NO_OPTION = "Brak takiej opcji!!!";
    public static final String MESSAGE_INPUT_VALID_NUMBER = "Wpisz proszę liczbę całkowitą";
    private List<MenuItem> items;

    public Menu(List<MenuItem> items) {
        this.items = items;
    }

    public void print(){
        items.forEach(item -> System.out.println(item.getNumber()+". "+ item.getLabel()));
    }

    public boolean process(int menuPosition){
        Optional<MenuItem> item = items.stream()
                .filter(menuItem -> menuItem.getNumber() == menuPosition)
                .findFirst();
        return item.map(menuItem -> {
            menuItem.action();
            return true;
        }).orElse(false);
    }

    public void run(Scanner scanner){
        while(true){
            this.print();
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                scanner.nextLine();
                if (!this.process(number)){
                    System.out.println(MESSAGE_NO_OPTION);
                }
            } else {
                System.out.println(MESSAGE_INPUT_VALID_NUMBER);
                scanner.nextLine();
            }
        }
    }
}
