package ApplicationControl;

import java.util.ArrayList;

public class Library {

    private ArrayList<Song> songs;

    public Library() {
        songs = new ArrayList<>();
        songs.add(new Song("Perfect", "Ed Sheeran", "Pop"));
        songs.add(new Song("Someone You Loved", "Lewis Capaldi", "Pop"));
        songs.add(new Song("It's Your Love", "Tim Mcgraw ", "Country"));

    }

    public void addSongs(Song song) {
        this.songs.add(song);

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Library [songs=\n\t");
        ArrayList<String> songList = new ArrayList<>();
        for(Song song: songs) {
            songList.add(song.toString());
        }
        String songStrings = String.join(",\n\t", songList);
        builder.append(songStrings);
        builder.append("\n");
        return builder.toString();
    }


}
