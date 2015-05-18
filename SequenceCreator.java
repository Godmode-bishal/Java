import javax.sound.midi.*;
public class SequenceCreator
{
    public void play()
    {
        try
        {
            Sequencer sequencer=MidiSystem.getSequencer();
            System.out.println("We got a sequencer");
        }
        catch(midiUnavailableException ex)
        {
            System.out.println("Bummer!!");
        }
    }
    public static void main(String[] args)
    {
        SequenceCreator sc=new SequenceCreator();
        sc.play();
    }
}
        
        