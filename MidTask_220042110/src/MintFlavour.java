public class MintFlavour extends Flavour{

    @Override
    public double calculateFlavourPrice(int scoop) {
        double pricePerScoop=2.80;
        return scoop*pricePerScoop;
    }
}
