package com.andi;

import java.util.ArrayList;

public class Album {
    private String albumName;
    private String author;
    private ArrayList<Song> albumSongs;

    public Album(String albumName, String author) {
        this.albumName = albumName;
        this.author = author;
        this.albumSongs = new ArrayList<Song>();
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getAuthor() {
        return author;
    }

    public ArrayList<Song> getAlbumSongs() {
        return albumSongs;
    }

    public void addSong(String title, double duration){
        if(onAlbum(title)){
            System.out.println("Song " + title + " is already in the album " + this.getAlbumName());
        } else {
            this.albumSongs.add(new Song(title, duration));
        }
    }

    public Song getSong(String songTitle) {
        if(onAlbum(songTitle)){
            return this.albumSongs.get(findSong(songTitle));
        } else{
            System.out.println("Song " + songTitle + " is not in the album " + this.albumName);
            return null;
        }
    }

    private int findSong(String songTitle){
        for(int i = 0; i < this.albumSongs.size(); i++){
            if(this.albumSongs.get(i).getTitle().equals(songTitle)){
                return this.albumSongs.indexOf(this.albumSongs.get(i));
            }
        }
        return -1;
    }

    public boolean onAlbum(String songTitle){
        if(findSong(songTitle) >= 0){
            return true;
        }
        return false;
    }
} // end class Album


// Create a program that implements a playlist for songs
// Create a Song class having Title and Duration for a song.
// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList
// Songs from different albums can be added to the playlist and will appear in the list in the order
// they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()
