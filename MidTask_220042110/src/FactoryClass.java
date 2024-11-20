import java.util.ArrayList;
import java.util.Scanner;

public class FactoryClass {

    Scanner scanner = new Scanner(System.in);
    public void FlavourSelect(Scanner scanner) {
        Order order = new Order();
        while (scanner.next() != "End") {

            System.out.println("Enter Flavours");
            String flavour =scanner.next();
            System.out.println("Enter scoop");
            int scoop = 0;
            if (flavour.equalsIgnoreCase("ChocolateFudge")) {
                Flavour flavour1 = new ChocolateFudgeFlavour();
                flavour1.calculateFlavourPrice(scoop);
                order.addFlavour(flavour1);
            } else if (flavour.equalsIgnoreCase("PistachioDelight")) {
                Flavour flavour1 = new PistachioDelightFlavour();
                flavour1.calculateFlavourPrice(scoop);
                order.addFlavour(flavour1);
            } else if (flavour.equalsIgnoreCase("StrawberryDelight")) {
                Flavour flavour1 = new StrawberryFlavour();
                flavour1.calculateFlavourPrice(scoop);
                order.addFlavour(flavour1);
            } else if (flavour.equalsIgnoreCase("Mint")) {
                Flavour flavour1 = new MintFlavour();
                flavour1.calculateFlavourPrice(scoop);
                order.addFlavour(flavour1);
            }
        }
    }

    public void ToppingSelect(Scanner scanner) {
        Order order = new Order();
        while (scanner.next() != "End") {

            System.out.println("Enter topping");
            String toppings = scanner.next();

            if (toppings.equalsIgnoreCase("ChocolateChip")) {
                Toppings toppings1 = new ChocolateChip();
                toppings1.calculateToppingPrice();
                order.addTopping(toppings1);
            } else if (toppings.equalsIgnoreCase("CrushedOreo")) {
                Toppings toppings1 = new CrushedOreo();
                toppings1.calculateToppingPrice();
                order.addTopping(toppings1);
            } else if (toppings.equalsIgnoreCase("FreshStrawberry")) {
                Toppings toppings1 = new FreshStrawberry();
                toppings1.calculateToppingPrice();
                order.addTopping(toppings1);
            } else if (toppings.equalsIgnoreCase("Sprinkles")) {
                Toppings toppings1 = new Sprinkles();
                toppings1.calculateToppingPrice();
                order.addTopping(toppings1);
            }
        }

    }
    public void cupType(Scanner scanner){
        Order order = new Order();
        System.out.println("Enter Cup");
            String cup = scanner.next();
        if (cup.equalsIgnoreCase("Paper")) {
            Cup cup1= new PaperCup();
        }
       else if (cup.equalsIgnoreCase("WaffleCone")) {
            Cup cup1= new PaperCup();
        }




    }





        public  double orderCreate(ArrayList<Flavour>flavours,ArrayList<Toppings>toppings,Scanner scanner){


        }


    }



