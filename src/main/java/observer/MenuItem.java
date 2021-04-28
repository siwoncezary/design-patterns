package observer;

import java.util.ArrayList;
import java.util.List;

public class MenuItem implements Observable{
    private String label;
    private int number;
    private List<Observer> observerList = new ArrayList<>();

    public MenuItem(String label, int number) {
        this.label = label;
        this.number = number;
    }

    public void action(){
        notifyAllObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        observerList.forEach(observer -> observer.update());
    }

    public String getLabel() {
        return label;
    }

    public int getNumber() {
        return number;
    }
}
