import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
        if(this.songs.findSong(trackNumber) == null) return false;
        playlist.add(this.songs.findSong(trackNumber));
        return true;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist){
        if(this.songs.findSong(title) == null) return false;
        playlist.add(this.songs.findSong(title));
        return true;
    }

    public static class SongList{
        private ArrayList<Song> songs;

        private SongList(){
            this.songs = new ArrayList<Song>();
        }

        private boolean add(Song song) {
            if(this.findSong(song.getTitle()) != null) return false;
            this.songs.add(song);
            return true;
        }

        private Song findSong(String title) {
            for (Song song : this.songs) {
                if (song.getTitle() == title) return song;
            }
            return null;
        }

        private Song findSong(int trackNumber){
            if(trackNumber >= 1 && trackNumber <= this.songs.size()){
                return this.songs.get(trackNumber - 1);
            }
            return null;
        }
    }
}

