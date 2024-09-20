package Muisic;

import java.util.HashMap;
import java.util.HashSet;

public class MusicLibrary {

    private HashMap<String, HashSet<MusicTrack>> musiclib = new HashMap<>();

    //добавление трека в библиотеку

    public void addMusicTrack(MusicTrack musicTrack) {
        musiclib.putIfAbsent(musicTrack.getGenre(), new HashSet<>());
        musiclib.get(musicTrack.getGenre()).add(musicTrack);
    }

    //удаление трека из библиотеки

    public void removeTrack(MusicTrack track) {
        if (musiclib.containsKey(track.getGenre())) {
            //Получили ссылку на объек, поэтому далее удаляем из экземпляра
            //и он удалит по ссылке это же из musiclib
            HashSet<MusicTrack> t1 = musiclib.get(track.getGenre());
            t1.remove(track);
        }
    }

    //получение всех треков заданного жанра
    public HashSet<MusicTrack> getTracks(String genre) {
        if (musiclib.containsKey(genre)) {
            return musiclib.get((genre));
        } else {
            return new HashSet<MusicTrack>();
        }
    }
}

