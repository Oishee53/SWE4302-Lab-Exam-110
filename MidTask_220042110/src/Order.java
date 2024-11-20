import java.util.ArrayList;

public class Order {
   private ArrayList<Flavour> flavours=new ArrayList<>();
    private ArrayList<Toppings> toppings=new ArrayList<>();
    Cup cup;

   public void addFlavour(Flavour flavour){
       flavours.add(flavour);
   }
    public void addTopping(Toppings toppings){
       toppings.add(toppings);
    }

    public ArrayList<Toppings> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<Toppings> toppings) {
        this.toppings = toppings;
    }

    public ArrayList<Flavour> getFlavours() {
        return flavours;
    }

    public void setFlavours(ArrayList<Flavour> flavours) {
        this.flavours = flavours;
    }

}
