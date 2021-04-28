package command;

import java.util.function.Supplier;

public class IntegerPowerCommand implements Command{
    private Supplier<Integer> value;
    private int result;
    public IntegerPowerCommand(Supplier<Integer> value) {
        this.value = value;
    }

    @Override
    public void execute() {
        result = value.get() * value.get();
    }

    public int getResult(){
        return result;
    }
}
