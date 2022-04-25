import AlbumOrSingle.Album;
import Artists.Artist;
import Countries.Country;
import Music_Player.BasicList;
import Music_Player.PremiumList;
import Songs.*;
import User.User;
import Artists.*;

import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import AlbumOrSingle.*;

public class Main {


    public static void main(String[] args) {
        User user1 = new User("Premium");
       //Seteo los articas
        if (user1.getTypePack().equals("Basic")) {
            Stack<Songs> stackBasicSongs = new Stack<>();
            stackBasicSongs.addAll(user1.getUserSongs());
            BasicList basicList = new BasicList(stackBasicSongs);
            basicList.playMusic();
            basicList.showListSong();
            basicList.deleteSong();
            basicList.setSong(songToSet());
            basicList.showListSong();

        } else if (user1.getTypePack().equals("Premium")) {
            List<Songs> linkedListSongs = new LinkedList<>(user1.getUserSongs());
            List<Artist> linkedListArtist = new LinkedList<>(user1.getMyArtist());
            PremiumList premiumList = new PremiumList(linkedListSongs,linkedListArtist);
            //premiumList.playMusic(); //Buscar error
            premiumList.setSong(songToSet());
            /*premiumList.deleteSong();
            premiumList.showListSong();
            */
            premiumList.infoArtist();




        } else
            System.out.println("ERROR");

    }

    public static Songs songToSet() {
        //Song para setear en el metodo setSong(Songs song);
        Artist duki = new Artist("Duki", LocalDate.of(1996, 6, 24), Country.ARGENTINA);
        Album newAlbum = new Album("Single", duki);
        return new Songs("Goteo", "3:04", GenreSong.TRAP, newAlbum);
    }

}
