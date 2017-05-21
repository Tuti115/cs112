
import java.io.File;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;

public class Audio implements Runnable
{
    /* Initializations */
    private int decision;
    public static Thread thread = new Thread();


    /* Accessor Methods */
    public int getDecision()
    {
        return this.decision;
    }
    public Thread getThread()
    {
        return thread;
    }

    /* Mutator Methods */
    public void setDecision(int decision)
    {
        this.decision = decision;
    }
    public void endThread()
    {
        try
        {
            thread.join();

        }
        catch (InterruptedException e)
        {
            System.out.println("Error with joining thread.");
            System.exit(0);
        }

    }
    /* Constructors */
    public Audio()
    {
        thread = new Thread();
    }

    /* Methods */
    public void run()
    {
        try
        {

            playBattleMusic();
        }
        catch (Exception e)
        {
            System.out.println("Error with audio thread.");
            System.exit(0);
        }

    }

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

