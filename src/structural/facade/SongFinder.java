package structural.facade;

public class SongFinder {
    public String findSong(String songName) {
        System.out.println("Finding song: " + songName);
        return "cancion.mp3";
    }
}
