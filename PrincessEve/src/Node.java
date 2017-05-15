/**
 * Created by Josie on 5/14/2017.
 */
public class Node<T>
{
    /* Declarations */
    private T value;
    private Node<T> node;

    /* Accessor Methods */
    public T getValue()
    {
        return this.value;
    }
    public Node<T> getNode()
    {
        return this.node;
    }

    /* Mutator Methods */
    public void setValue(T value)
    {
        this.value = value;
    }
    public void setNode(Node<T> node)
    {
        this.node = node;
    }

    /* Constructors */
    public Node()
    {
        this.value = null;
        this.node = null;
    }
    public Node(T value)
    {
        this.value  = value;
    }

    //toString
    public String toString()
    {
        return "Value: " + getValue();
    }
    //equals
    public boolean equals(Node<T> other)
    {
        if(other == null || other.getClass() != this.getClass())
        {
            return false;
        }

        Node<T> someNode = (Node<T>) other;

        return someNode.getValue() == this.getValue() &&
                someNode.getNode() == this.getNode();
    }

}
