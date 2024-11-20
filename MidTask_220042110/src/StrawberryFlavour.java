public class StrawberryFlavour extends Flavour{

    @Override
    public double calculateFlavourPrice(int scoop) {
        double pricePerScoop=2.75;
        return scoop*pricePerScoop;
    }
}
