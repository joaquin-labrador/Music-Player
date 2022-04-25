package Songs;
import AlbumOrSingle.Album;
import Artists.Artist;
import java.util.ArrayList;
import java.util.List;

public class Songs{
    private String title;
    private String duration;
    private GenreSong genre;
    private Album album;
    private Artist collaborations = null;

    public Songs() {
    }

    public Songs(String title, String duration, GenreSong genre, Album album) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.album = album;
    }

    public Songs(String title, String duration, GenreSong genre, Album album, Artist collaborations) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.album = album;
        this.collaborations = collaborations;
    }

    public Album getAlbum() {
        return album;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
       return  title+ " " + "by " + album.getArtist().getName() + " "
               + ((collaborations != null) ?  " ft " + collaborations.getName(): "")
               + " " + duration + " " + genre + " album " + album.getTitle();
    }
}
