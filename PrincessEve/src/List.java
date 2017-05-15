
import java.util.Scanner;

public class List<T>
{
    /* Initializations */

    private Node<T> first;
    private Node<T> current;
    private boolean isCircular;
    static Scanner keyboard;

    /* Accessor Methods */
    public Node<T> getFirst()
    {
        return this.first;
    }
    public Node<T> getCurrent()
    {
        return this.current;
    }
    public boolean getIsCircular()
    {
        return this.isCircular;
    }


    /* Mutator Methods */
    public void setFirst(Node<T> first)
    {
        this.first = first;
    }
    public void setCurrent(Node<T> current)
    {
        this.current = current;
    }
    public void setIsCircular(boolean isCircular)
    {
        this.isCircular = isCircular;
    }

    /* Constructors */
    public List()
    {
        first = null;
        current = null;
        isCircular = false;
    }

    public List(T value)
    {
        first = new Node<T>(value);
        this.setCurrent(first);
    }

    /* Methods */

    public Node<T> getLast()
    {
        Node<T> current = getFirst();

        while(current.getNode() != null)
        {
            current = current.getNode();
        }

        return current;
    }
    public void add(T value)
    {
        if(getIsCircular())
        {
            return;
        }

        this.getLast().setNode(new Node<T>(value));

    }
    public void makeCircular()
    {
        Node<T> lastNode = getLast();
        lastNode.setNode(getFirst());
        setIsCircular(true);
    }

    public boolean next()
    {
        Node<T> next = this.getCurrent().getNode();

        if (next != null)
        {
            this.setCurrent(this.getCurrent().getNode());
            return true;
        }
        else
        {
            return false;
        }

    }

    public int size()
    {
        Node<T> current = getFirst();
        int counter = 0;

        while(current.getNode() != null)
        {
            counter++;
            current.setNode(current.getNode());
        }
        return counter;
    }




}