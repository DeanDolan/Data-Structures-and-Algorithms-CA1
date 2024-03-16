/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playlist;

/**
 *
 * @author deand
 */
public class LikedSongs {

    // Instance variables to store song name and genre
    private String songName;
    private String genre;

    /**
     * Constructs a new LikedSongs object with the given song name and genre.
     *
     * @param songName The name of the song.
     * @param genre The genre of the song.
     */
    public LikedSongs(String songName, String genre) {
        this.songName = songName;
        this.genre = genre;
    }

    /**
     * Retrieves the name of the song.
     *
     * @return The song name.
     */
    public String getTitle() {
        return songName;
    }

    /**
     * Retrieves the genre of the song.
     *
     * @return The genre of the song.
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Provides a string representation of the LikedSongs object.
     *
     * @return A string containing the song name and genre.
     */
    @Override
    public String toString() {
        return "Song name: " + songName + " | Genre: " + genre;
    }

}
