public class ChocolateFudgeFlavour extends Flavour{

    @Override
    public double calculateFlavourPrice(int scoop) {
        double pricePerScoop=3.00;
        return scoop*pricePerScoop;
    }
}
