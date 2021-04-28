package command;

import java.util.Scanner;

public class ReadFromScannerCommand implements Command{
    private Scanner scanner;
    private String input = "1";
    public ReadFromScannerCommand(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        input = scanner.nextLine();
    }

    public String getInput() {
        return input;
    }
}
