package Music_Player;

import Artists.Artist;
import Songs.Songs;

import java.util.ArrayList;
import java.util.Stack;


public class BasicList implements MusicPlayer {
    public final String name = "Basic List";
    private Stack<Songs> songs = new Stack<>();
    public BasicList(Stack<Songs> songs) {
        this.songs = songs;
    }

    @Override
    public void playMusic() {
        /*
        * El método Reproducir solo reproducirá la primera canción del stack y la enviará al
          final del mismo.
        * */
        if (!songs.empty()) {
            Stack<Songs> stackAux = new Stack<>();
            Songs toPlay = songs.pop();
            System.out.println("Play : " + toPlay.toString());
            stackAux.push(toPlay); //La mando al fonndo de la pila aux
            System.out.println("Para seguir escuchando,  compre el paquete PREMIUM");
            while (!songs.empty()) {
                stackAux.push(songs.pop()); //Pongo base de la pila por encima de la cancion reproc
            }
            songs = stackAux;
        } else
            System.out.println("No tienes canciones en tu STACK");
    }

    @Override
    public void setSong(Songs song) {
        this.songs.push(song);

    }

    @Override
    public void showListSong() {
       if(!songs.empty()) {
           int i = 1;
           for (Songs song : songs) {
               System.out.println(i + " " + song);
               i++;
           }
       }

    }

    @Override
    public void deleteSong() {
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");

    }

    @Override
    public void showListArtist() {
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");
    }

    @Override
    public void infoArtist() {
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");
    }
}
