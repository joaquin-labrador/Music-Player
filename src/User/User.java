package User;

import AlbumOrSingle.Album;
import Artists.Artist;
import Countries.Country;
import Songs.GenreSong;
import Songs.Songs;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class User {
    public List<Songs> userSong = new ArrayList<>();
    public String typePack;
    public List<Artist> myArtist = new ArrayList<>();

    public User(String typePack) {
        this.userSong = getUserSongs();
        this.typePack = typePack;
        setMyArtist();
    }

    public String getTypePack() {
        return typePack;
    }

    public List<Songs> getUserSongs() {
        List<Songs> songs = new ArrayList<Songs>();
        List<Artist> collaborations = new ArrayList<>();
        Artist disturbed = new Artist("Disturbed", LocalDate.of(1994, Month.APRIL, 2), Country.USA);
        Album theSickness = new Album("The Sickness", 2000, disturbed);
        Songs downWithTheSickness = new Songs("Down With The Sickness", "4:38", GenreSong.ROCK, theSickness);

        songs.add(downWithTheSickness);


        Artist gunsNRoses = new Artist("Guns 'n Roses", LocalDate.of(1985, Month.MARCH, 26), Country.USA);
        Album appetiteForDestruction = new Album("Appetite for Destruction", 1987, gunsNRoses);
        Songs sweetChildOMine = new Songs("Sweet Child o' Mine", "5:38", GenreSong.ROCK, appetiteForDestruction);

        songs.add(sweetChildOMine);

        Artist billieEilish = new Artist("Billie Eilish", LocalDate.of(2001, Month.DECEMBER, 18), Country.USA);
        Album whenWeAllFallAsleep = new Album("When We All Fall Asleep, Where Do We Go?", 2019, billieEilish);
        Songs badGuy = new Songs("Bad Guy", "3:33", GenreSong.POP, whenWeAllFallAsleep);

        songs.add(badGuy);

        Artist queen = new Artist("Queen", LocalDate.of(1970, Month.JANUARY, 1), LocalDate.of(1991, Month.NOVEMBER, 21), Country.UNITED_KINGDOM);
        Artist davidBowie = new Artist("David Bowie", LocalDate.of(1947, Month.JANUARY, 8), LocalDate.of(2016, Month.JANUARY, 10), Country.USA);
        Album hotSpace = new Album("Hot Space", 1982, queen);
        Songs underPressure = new Songs("Under Pressure", "5:33", GenreSong.ROCK, hotSpace, davidBowie);

        songs.add(underPressure);

        Album newsOfTheWorld = new Album("News Of The World", 1977, queen);
        Songs weWillRockYou = new Songs("We Will Rock You", "5:21", GenreSong.ROCK, newsOfTheWorld);

        songs.add(weWillRockYou);

        Artist gorillaz = new Artist("Gorillaz", LocalDate.of(1998, Month.JANUARY, 1), Country.UNITED_KINGDOM);
        Album demonDays = new Album("Demon Days", 2005, gorillaz);
        Songs feelGoodInc = new Songs("Feel Good Inc", "4:25", GenreSong.ROCK, demonDays);

        songs.add(feelGoodInc);

        Artist michaelJackson = new Artist("Michael Jackson", LocalDate.of(1958, Month.AUGUST, 29), LocalDate.of(2009, Month.JUNE, 25), Country.USA);
        Album bad = new Album("Bad", 1987, michaelJackson);
        Songs smoothCriminal = new Songs("Smooth Criminal", "5:33", GenreSong.POP, bad);

        songs.add(smoothCriminal);


        Artist theWeeknd = new Artist("The Weeknd", LocalDate.of(1990, 2, 16), Country.CANADA);
        Artist daftPunk = new Artist("Daft Punk", LocalDate.of(1993, 1, 1), LocalDate.of(2021, 2, 22), Country.FRANCE);
        Album starboy = new Album("Starboy", 2016, theWeeknd);
        Songs iFeelItComing = new Songs("I Feel It Coming", "4:33", GenreSong.POP, starboy, daftPunk);
        songs.add(iFeelItComing);


        Artist theStrokes = new Artist("The Strokes", LocalDate.of(1998, 1, 1), Country.USA);
        Album roomOnFire = new Album("Room On Fire", 2003, theStrokes);
        Songs reptilia = new Songs("Reptilia", "4:15", GenreSong.POP, roomOnFire);

        songs.add(reptilia);

        Album randomAccessMemories = new Album("Random Access Memories", 2013, daftPunk);
        Songs instantCrush = new Songs("Instant Crush ", "4:15", GenreSong.POP, randomAccessMemories, theStrokes);

        songs.add(instantCrush);

        return songs;
    }


    public void setMyArtist() {
        if (userSong.size() > 0) {
            for (Songs song : userSong) {
                if (verificationArtist(song.getAlbum().getArtist(), this.myArtist)) {
                    this.myArtist.add(song.getAlbum().getArtist());
                }
            }
        }
    }

    public List<Artist> getMyArtist() {
        return myArtist;
    }

    private boolean verificationArtist(Artist artist, List<Artist> myArtist) {
        for (Artist value : myArtist) {
            if (artist.equals(value)) {
                return false;
            }
        }
        return true;

    }
}



