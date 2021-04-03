import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        if(this.findSong(title) != null) return false;
        Song song = new Song(title, duration);
        this.songs.add(song);
        return true;
    }

    private Song findSong(String title) {
        for (Song song : this.songs) {
            if (song.getTitle() == title) return song;
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
        if(trackNumber > this.songs.size() || trackNumber <= 0) return false;
        playlist.add(this.songs.get(trackNumber - 1));
        return true;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist){
        if(this.findSong(title) == null) return false;
        playlist.add(this.findSong(title));
        return true;
    }
}
