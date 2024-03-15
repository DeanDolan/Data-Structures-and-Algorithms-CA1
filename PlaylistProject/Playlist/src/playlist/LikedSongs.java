/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playlist;

/**
 *
 * @author deand
 */
public class LikedSongs{
    private String sSongName;
    private String sGenre;

    public LikedSongs(String sSongName, String sGenre) {
        this.sSongName = sSongName;
        this.sGenre = sGenre;
    }

    public String getTitle() {
        return sSongName;
    }

    public String getGenre() {
        return sGenre;
    }

    @Override
    public String toString() {
        return sSongName + " (" + sGenre + ")";
    }
    
}
