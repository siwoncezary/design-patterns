package command;

public class PrintStringCommand implements Command{
    private String value;

    public PrintStringCommand(String value) {
        this.value = value;
    }

    @Override
    public void execute() {
        System.out.println(value);
    }
}
