package ApplicationControl;

import java.util.HashMap;
import java.util.Scanner;

import ApplicationControl.Song;
import ApplicationControl.Handler;
import ApplicationControl.Library;


public class AddSongHandler implements Handler {

    @Override
    public Object handleIt(HashMap<String, Object> data) {
        Scanner scanner = (Scanner) data.get("scanner");
        Library songLib = (Library) data.get("library");

        System.out.println("Enter song name: ");
        String name = scanner.nextLine();
        System.out.println("Enter artist: ");
        String artist = scanner.nextLine();
        System.out.println("Enter song genre: ");
        String genre = scanner.nextLine();

        Song newSong = new Song(name, artist, genre);
        songLib.addSongs(newSong);
        return null;

    }


    ;



}
