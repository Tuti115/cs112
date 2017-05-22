
import java.io.File;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;

public class Audio
{

    public static void playBattleMusic()
    {
        File battlemusic = new File("Pokemon Files/Audio/EmeraldBattleMusic.wav");

        PlaySound(battlemusic);

    }

    public static void PlaySound(File Sound)
    {
        try
        {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();

            Thread.sleep(clip.getMicrosecondLength() / 1000);

        } catch (Exception e)
        {
            System.out.println("Error with audio...");
            System.exit(0);
        }

    }
}

