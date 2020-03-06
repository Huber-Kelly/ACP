//sandbox code from Shaun Courtney
//changed from football roster to song list
//calls to ApplicationControl which is going to control and call all handlers to do what you what it to do
//scanner to be able to accept the inputs on page

package ApplicationControl;

import java.util.HashMap;
import java.util.Scanner;

import ApplicationControl.Library;

public class SongManagement {

    public SongManagement() {
    }

    public static void main(String[] args) {

        ApplicationControl controller = new ApplicationControl();
        Scanner scanner = new Scanner(System.in);
        Library songLib = new Library();

        try {

            int action = -1;
            while (action != 0) {
                action = (int1)controller.doCommand("showMenu", GetCommandData("scanner", scanner));
                switch (action) {

                    case 1:
                        controller.doCommand("showSong", GetCommandData("library", songLib));
                        break;

                    case 2:
                        HashMap<String, Object> commandData = GetCommandData("scanner", scanner);
                        commandData.put("library", songLib);
                        controller.doCommand("addSong", commandData);
                        break;
                        //exit the program
                    case 0:
                        System.out.println("Thank you for using the System.");
                        break;
                    default:
                        System.out.println("Selection not available.  Please try again.");
                        break;

                }

            }

        } catch (Exception e) {
            System.err.println(e.toString());
        }
        finally {
            scanner.close();
        }
    }

    public static HashMap<String, Object> GetCommandData(String key, Object value) {
        HashMap<String, Object> data = new HashMap<String, Object>();
        data.put(key, value);
        return data;
    }
}
