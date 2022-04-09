package day36_Inheritance.cryptoTokenTask;

public class XRP extends CryptoToken{

    public XRP(double price, double quantity, double marketCap, double volume, double circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, volume, circulatingSupply, isMineable);
    }
}
