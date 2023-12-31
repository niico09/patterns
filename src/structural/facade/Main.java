package structural.facade;

public class Main {
    public static void main(String[] args) {
        var musicPlayerFacade = new MusicPlayerFacade();
        musicPlayerFacade.playMusic("song.mp3");
        musicPlayerFacade.findAndPlaySong("Jazz");
        musicPlayerFacade.playVideo("video.mp4");
    }
}
