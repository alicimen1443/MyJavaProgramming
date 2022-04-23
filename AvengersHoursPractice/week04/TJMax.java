package week04;

import java.util.ArrayList;

public class TJMax{

    private ArrayList<Item> listRegular;
    private ArrayList<OnSaleItem> listOnSale;

    public TJMax(){
        listRegular=new ArrayList<>();
        listOnSale=new ArrayList<>();
    }

    public void addRegularItem(Item item){
        listRegular.add(item);
    }

    public void addOnSaleItem(OnSaleItem item){
        listOnSale.add(item);
    }

    public ArrayList<Item> getListRegular() {
        return listRegular;
    }

    public ArrayList<OnSaleItem> getListOnSale() {
        return listOnSale;
    }

    public int getCountItems(){
        return listRegular.size();
    }

    public int getCountItemsOnSale(){
        return listOnSale.size();
    }

    public ArrayList<String> getAllItemNames(){

        ArrayList<String> names = new ArrayList<>();

        for (int i = 0; i < getCountItems(); i++) {
            names.add(listRegular.get(i).getName());
        }
        for (int i = 0; i < getCountItemsOnSale(); i++) {
            names.add(listOnSale.get(i).getName());
        }


     /*   listRegular.addAll(listOnSale);

        for (Item item : listRegular) {
            names.add(item.getName());
        }

      */

        return names;

    }


    public double getPriceOfItem(int catalogNumber){
        for (Item item : listRegular) {
           if(item.getCatalogNumber()==catalogNumber) { // item found
               return item.getPrice();
           }
        }
        for (Item item : listOnSale) { // Since onSaleItem objects are also object of Item class as well I can pass Item as data Type
            if(item.getCatalogNumber()==catalogNumber){
                return item.getPrice();
            }
        }
        return 0.0;
    }

    public OnSaleItem getItemName(String name){

        for (OnSaleItem item : listOnSale) {
            if(item.getName().equals(name)){
                return item;
            }
        }
        return null;
    }

















}
