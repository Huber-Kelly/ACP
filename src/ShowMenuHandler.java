package ApplicationControl;


import java.util.HashMap;
import java.util.Scanner;

public class ShowMenuHandler implements Handler {

    public ShowMenuHandler() {

    }

    @Override
    public Object handleIt(HashMap<String, Object> data) {
        System.out.println("Main Menu:");
        System.out.println("\t1 - Show Songs");
        System.out.println("\t2 - Add Song");
        System.out.println("\t0 - Exit Program");
        System.out.println("Select 1, 2 or 0: ");

        Scanner scanner = (Scanner)data.get("scanner");
        int selection = GetNextInt(scanner);
        return selection;
    }

    private int GetNextInt (Scanner scanner) {
        String input = scanner.nextLine();
        try {
            int result = Integer.parseInt(input);
            return result;
        } catch (Exception e) {
            System.out.println("You must select a number from the menu.");
            return -1;
        }
    }
}
