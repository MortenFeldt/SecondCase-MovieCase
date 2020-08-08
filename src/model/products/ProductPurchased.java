package model.products;

import java.util.List;

/**
 * Class to hold count of Product purchased. This class extends from Product class.
 * @author Morten Feldt
 */

public class ProductPurchased extends Product implements Comparable<ProductPurchased>{
    
    private int purchasedcount;

    public ProductPurchased(String name, int rating, double price, int purchasedcount) {
        super(name, rating, price);
        this.purchasedcount = purchasedcount;
    }

    public ProductPurchased(String name, List<String> genre, int rating, double price, int purchasedcount) {
        super(name, genre, rating, price);
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
        return o.getPurchasedcount() - this.purchasedcount;
    }

}
