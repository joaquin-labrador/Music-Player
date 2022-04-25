package Music_Player;

import Artists.Artist;
import Songs.Songs;

import java.util.ArrayList;

public interface MusicPlayer {
     void playMusic();
     void setSong(Songs song);
     void deleteSong();
     void showListSong();
     void infoArtist();
     void showListArtist();
}
