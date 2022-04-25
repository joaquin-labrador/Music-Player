package Music_Player;

import Artists.Artist;
import Songs.Songs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PremiumList implements MusicPlayer {
    public final String name = "Premium list";
    private List<Songs> songs = new LinkedList<Songs>();
    private List<Artist> myFavoriteArtist = new LinkedList<>();

    public PremiumList(List<Songs> songs, List<Artist> artist) {
        this.songs = songs;
        this.myFavoriteArtist = artist;
    }

    /* Explicacion LinkedList
     * LinkedList deferencia con ArrayList :
     * La principal diferencia es un tema de implementación ArrayList implementa la lista con arreglos linkeados,
     * lo que la hace muy eficiente para recorrer pero ineficiente para insertar o eliminar elementos que se no encuentren en el final.
     * En cambio LinkedList es una lista de elementos linkeados (en realidad es una lista doblemente enlazada)
     * lo que la hace lenta para recorrer pero sumamente eficiente para insertar o eliminar elementos.
     * Esta es la principal diferencia y hay que recordarla siempre.
     * */
    @Override
    public void playMusic() {
        if (songs.size() > 0) {
            Scanner sc = new Scanner(System.in);
            int selection;
            char exit;
            showListSong();
            do {
                System.out.println("Seleccione cancion a reproducir");
                selection = sc.nextInt() - 1;
                for (int i = 0; i < songs.size(); i++) {
                    if (i == selection) {
                        System.out.println("Reproduciendo " + songs.get(i).toString());
                    }
                }
                System.out.println("Presione X para salir, si apreta otro boton padra seguir escuchando");
                exit = sc.nextLine().charAt(0);
            } while (exit != 'x' && exit != 'X');
        }
    }

    @Override
    public void setSong(Songs song) {
        this.songs.add(song);
        this.myFavoriteArtist.add(song.getAlbum().getArtist());

    }

    @Override
    public void showListSong() {
        int i = 1;
        if (songs.size() > 0) {
            for (Songs song : songs) {
                System.out.println(i + " " + song.toString());
                i++;
            }
        }

    }

    @Override
    public void deleteSong() {
        boolean flag = false;
        int i = 0;
        if (songs.size() > 0) {
            Scanner sc = new Scanner(System.in);
            showListSong();
            System.out.println("Seleccione Cancion a Borrar");
            int selection = sc.nextInt() - 1;
            while (i < songs.size() && !flag) {
                if (i == selection) {
                    System.out.println("Se elimino de tu PlayList: " + songs.get(selection).getTitle());
                    songs.remove(songs.get(i));
                    flag = true; //se borro

                }
                i++;
            }
            if (!flag)
                System.out.println("Opcion Incorrecta");
        }
    }

    @Override
    public void showListArtist() {
        int i = 1;
        if (myFavoriteArtist.size() > 0) {
            for (Artist artist : myFavoriteArtist) {
                System.out.println(i + " " + artist.getName());
                i++;
            }
        }
    }

    @Override
    public void infoArtist() {
        if(myFavoriteArtist.size() > 0){
            Scanner sc = new Scanner(System.in);
            int selector = 0;
            do {
                showListArtist();
                System.out.println("Seleccione Artista para ver su Informacion / 0 para salir");
                selector = sc.nextInt() - 1;
                for (int i = 0; i < myFavoriteArtist.size(); i++) {
                    if (i == selector) {
                        System.out.println(myFavoriteArtist.get(i));
                    }
                }
            }while (selector <= 0);
        }

    }

}
