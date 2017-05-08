/**
 * Created by Josie on 5/1/2017.
 */
public class SuitorLinkNode
{
    /* Declarations */
    private int position;
    private SuitorLinkNode nextnode;

    /* Accessor Methods */
    public int getPosition()
    {
        return this.position;
    }

    public SuitorLinkNode getLink()
    {
        return this.nextnode;
    }

    /* Mutator Methods */
    public void setPosition(int position)
    {
        this.position = position;
    }

    /* Constructors */
    public SuitorLinkNode()
    {
        this.position = 0;
        this.nextnode = null;
    }

    public SuitorLinkNode(int position, SuitorLinkNode theNode)
    {
        this.position = position;
        this.nextnode = theNode;
    }




    /* Methods */











}
