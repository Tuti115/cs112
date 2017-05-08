
import java.io.File;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;

public class PokemonAudio implements Runnable
{

    /* Initializations */
    private int decision;


    /* Accessor Methods */
    public int getDecision()
    {
        return this.decision;
    }

    /* Mutator Methods */

    public void setDecision(int decision)
    {
        this.decision = decision;
    }

    /* Constructors */
    public PokemonAudio()
    {
        this.decision = 0;
    }

    public PokemonAudio(int decision)
    {

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
            System.out.println("error.");
            System.exit(0);
        }

    }

    public static void playBattleMusic()
    {
        File battlemusic = new File("Pokemon_Emerald_Wild_Battle.wav");

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

