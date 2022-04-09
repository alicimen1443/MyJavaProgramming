package day36_Inheritance.cryptoTokenTask;

public class Ethereum extends CryptoToken {

    public Ethereum(double price, double quantity, double marketCap, double volume, double circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, volume, circulatingSupply, isMineable);
    }
}
