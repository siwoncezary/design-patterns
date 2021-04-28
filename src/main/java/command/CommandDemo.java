package command;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommandDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Command> commands = new ArrayList<>();
        PrintStringCommand printMessage = new PrintStringCommand("Wpisz liczbę całkowitą: ");
        ReadFromScannerCommand readValue = new ReadFromScannerCommand(scanner);
        IntegerPowerCommand powerCommand = new IntegerPowerCommand(() -> Integer.parseInt(readValue.getInput()));
        PrintIntegerCommand printInteger = new PrintIntegerCommand(() -> powerCommand.getResult());
        commands.addAll(List.of(printMessage, readValue, powerCommand, printInteger));
        //Odtworzenie ciągu zapamiętanych poleceń
        for(Command command: commands){
            command.execute();
        }
    }
}
