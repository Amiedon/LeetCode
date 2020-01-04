package AdapterPattern;

/**
 * Created by Amie on 2019/8/6.
 */
public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String audioType, String FileName) {
        if (audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name:" + FileName);
        }else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            MediaPlayer mediaPlayer = new MediaAdapter(audioType);
            mediaPlayer.play(audioType, FileName);
        }
        else {
            System.out.println("Invalid media."+ audioType+"format not supported");
        }
    }
}
