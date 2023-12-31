package structural.facade;

public class MusicPlayerFacade {
    private AudioPlayer audioPlayer;
    private SongFinder songFinder;
    private VideoPlayer videoPlayer;

    public MusicPlayerFacade() {
        this.audioPlayer = new AudioPlayer();
        this.songFinder = new SongFinder();
        this.videoPlayer = new VideoPlayer();
    }


    public void playMusic(String fileName) {
        audioPlayer.playAudio(fileName);
    }

    public void findAndPlaySong(String keyword) {
        String foundSong = songFinder.findSong(keyword);
        audioPlayer.playAudio(foundSong);
    }

    public void playVideo(String fileName) {
        videoPlayer.playVideo(fileName);
    }
}
