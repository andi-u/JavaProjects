package com.andi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {
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

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        System.out.print("Create a playlist. Enter the name of the playlist: ");
        String playlistName = scanner.nextLine();
        scanner.nextLine();
        Playlist playlist = new Playlist(playlistName);
        ListIterator<Song> listIterator = playlist.getListOfSongs().listIterator();

        if(playlist.getListOfSongs().isEmpty()) {
            System.out.println("No songs in the playlist");
            System.out.println("Enter a song in the playlist: ");

        } else{
            System.out.println("Now listening " + listIterator.next());
            printMenu();
        }

        while(!quit) {
            int action = scanner.nextInt();
            boolean goingForward = true;
            scanner.nextLine(); // clear the next line (handle the enter)
            switch (action) {
                case 0:
                    System.out.println("Close the playlist");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now listening " + listIterator.next());
                    } else{
                        System.out.println("Reached the end of the playlist");
                        goingForward = false;
                    }
                    goingForward = true;
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now listening " + listIterator.previous() );
                    } else{
                        System.out.println("We are at the start of the playlist");
                        goingForward = true;
                    }
                    goingForward = false;
                    break;
                case 3:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now replay " + listIterator.previous() );
                        } else{
                            System.out.println("We are at the start of the playlist");
                            goingForward = true;
                        }
                        goingForward = false;
                    } else{
                        if(listIterator.hasNext()){
                            System.out.println("Now replay " + listIterator.next());
                        } else{
                            System.out.println("Reached the end of the playlist");
                            goingForward = false;
                        }
                        goingForward = true;
                    }
                    break;
                case 5:
                    printMenu();
                    break;
            }
        }




    }

    private static void printMenu(){
        System.out.println("Available actions: \npress ");
        System.out.println("0 - to quit the playlist\n" +
                "1 - to skip forward to the next song\n" +
                "2 - to skip backwards to a previous song\n" +
                "3 - to replay the current song\n" +
                "4 - to remove the current song\n" +
                "5 - print menu options");
    }
}
