


import java.util.ArrayList;
public class Player
{
    /* Declarations */
    private String player_name;
    private ArrayList<Pokemon> pokemonList= new ArrayList<>();
    private ArrayList<Item> itemList = new ArrayList<>();

    /* Accessor Methods */
    public String getPlayer_name()
    {
        return this.player_name;
    }
    public ArrayList getPokemonList()
    {
        return this.pokemonList;
    }
    public ArrayList getItemList()
    {
        return this.itemList;
    }

    /* Setter Methods */
    public void setPlayer_name(String name)
    {
        this.player_name = name;
    }

    /* Constructors */
    public Player()
    {
        //default constructor
        this.player_name = null;
        this.pokemonList = new ArrayList<Pokemon>();
        this.itemList = new ArrayList<Item>();

    }

    public Player(String name, ArrayList<Pokemon> pokelist, ArrayList<Item> itemlist)
    {
        //main constructor
        this.player_name = name;
        this.pokemonList = pokelist;
        this.itemList = itemlist;
    }

    /* Methods */
    public static Player initializePlayerRed()
    {



        Player red = new Player(); //not complete
        return red ;
    }


    public boolean atLeastOnePokeAlive()
    {
        ArrayList<Pokemon> list = this.getPokemonList();

        for(Pokemon mon : list)
        {
            if(mon.getHP() > 0)
                return true;
        }

        return false;
    }




}
