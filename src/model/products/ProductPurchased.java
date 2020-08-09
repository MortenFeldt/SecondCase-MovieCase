package model.products;

import java.util.List;

/**
 * Class to hold count of Product purchased. This class extends from Product class.
 * @author Morten Feldt
 */

public class ProductPurchased extends Product implements Comparable<ProductPurchased>{
    
    private int purchasedcount;

    public ProductPurchased(int id, String name, int year, double rating, double price, int purchasedcount) {
        super(id, name, year, rating, price);
        this.purchasedcount = purchasedcount;
    }

    public ProductPurchased(int id, String name, int year, List<String> genre, double rating, double price, int purchasedcount) {
        super(id, name, year, genre, rating, price);
        this.purchasedcount = purchasedcount;
    }

    public int getPurchasedcount() {
        return purchasedcount;
    }

    public void setPurchasedcount(int purchasedcount) {
        this.purchasedcount = purchasedcount;
    }
    
    public void countUpPurchasedCount(){
        this.purchasedcount += 1;
    }

    @Override
    public int compareTo(ProductPurchased o) {
        return o.getPurchasedcount() - purchasedcount;
    }

}
