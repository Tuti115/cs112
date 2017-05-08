
public class SuitorLinkList
{

    /* Initializations */
    private SuitorLinkNode head;
    /* Constructor */
    public SuitorLinkList()
    {
        this.head = null;
    }

    /* Methods */
    public void addSuitorNode(int position)
    {
        head = new SuitorLinkNode(position, head);
    }

    public void removeSuitorNode()
    {

    }





}
