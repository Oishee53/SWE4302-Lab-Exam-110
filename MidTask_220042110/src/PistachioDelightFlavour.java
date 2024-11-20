public class PistachioDelightFlavour extends Flavour{

    @Override
    public double calculateFlavourPrice(int scoop) {
        double pricePerScoop=3.25;
        return scoop*pricePerScoop;
    }
}
