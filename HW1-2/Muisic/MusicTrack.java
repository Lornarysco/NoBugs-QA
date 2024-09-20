package Muisic;

public class MusicTrack {
    public String name;
    public String artist;
    public String genre;

    public MusicTrack(String name, String artist, String genre) {
        this.name = name;
        this.artist = artist;
        this.genre = genre;
    }

    // Геттеры для полей
    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }
}
