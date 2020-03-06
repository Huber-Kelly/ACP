package ApplicationControl;

import java.util.HashMap;
import ApplicationControl.Library;


public class ShowSongHandler implements Handler {


    @Override
    public Object handleIt(HashMap<String, Object> data) {
        Library playerLib = (Library) data.get("library");

        String s = playerLib.toString();
        System.out.println(s);
        return null;

    }
}
