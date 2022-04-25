package AlbumOrSingle;
import Artists.Artist;
public class Album {
    public String title;
    public int releaseDate;
    public Artist artist;

    public Album(String title, Artist artist) {
        this.title = title;
        this.artist = artist;
    }

    public Album(String title, int releaseDate, Artist artist) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.artist = artist;
    }

    public Artist getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }
}

