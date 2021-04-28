package command;

import java.util.function.Supplier;

public class PrintIntegerCommand implements Command{
    private Supplier<Integer> value;

    public PrintIntegerCommand(Supplier<Integer> value) {
        this.value = value;
    }

    @Override
    public void execute() {
        System.out.println("Wartość: " + value.get());
    }
}
