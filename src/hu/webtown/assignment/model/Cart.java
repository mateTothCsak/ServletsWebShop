package hu.webtown.assignment.model;
import hu.webtown.assignment.model.products.*;
import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Product> products = new ArrayList<>();
    private List <Product> threeForTwos = new ArrayList<>();
    private List <Product> megapacks = new ArrayList<>();

    private Integer highestDiscount = 0;
    private String discountType = "Nincs kedvezmény";

    private Integer fullPrice;
    private Integer discountedPrice;



    public void addToProducts(String amount, Product product){
        for (int i = 0; i < Integer.parseInt(amount); i++) {
            products.add(product);
        }
    }

    public void addToThreeForTwos(Product product){
        threeForTwos.add(product);
    }

    public void addToMegapacks(Product product){
        megapacks.add(product);
    }


    public void calculateDiscounts(){
        calculateThreeforTwos();
        calculateMegapacks();
    }

    public void calculateThreeforTwos() {
        for (Product category : threeForTwos){
            int currentDiscount = 0;
            int categoryCounter = 0;
            for(int i = 0; i<products.size(); i++){
                if(category.getClass() == products.get(i).getClass()){
                    categoryCounter += 1;
                }
            }
            currentDiscount = categoryCounter/3 * category.getPrice();
            if(currentDiscount > highestDiscount){
                highestDiscount = currentDiscount;
                discountType = "2=3";
            }
        }
    }


    public void calculateMegapacks() {
        for (Product category : megapacks){
            int currentDiscount = 0;
            int categoryCounter = 0;
            for(int i = 0; i<products.size(); i++){
                if(category.getClass() == products.get(i).getClass()){
                    categoryCounter += 1;
                }
            }
            currentDiscount = categoryCounter/12 * 6000;
            if(currentDiscount > highestDiscount){
                highestDiscount = currentDiscount;
                discountType = "Megapack";
            }
        }

    }

    public void updateDiscountedPrice(){
        discountedPrice = fullPrice - highestDiscount;
    }


    public void calculateFullPrice(){
        Integer price = 0;
        for (Product product : products){
            price += product.getPrice();
        }
        fullPrice = price;
    }


    public void fillUpCart(String toothpaste, String pomelo, String salmon, String cheese, String napkin,
                           String giftpack, String milk, String joghurt, String pasta){

        addToProducts(toothpaste, new Toothpaste());
        addToProducts(pomelo, new Pomelo());
        addToProducts(salmon, new Salmon());
        addToProducts(cheese, new Cheese());
        addToProducts(napkin, new Napkin());
        addToProducts(giftpack, new Giftpack());
        addToProducts(milk, new Milk());
        addToProducts(joghurt, new Joghurt());
        addToProducts(pasta, new Pasta());
    }

    public Integer getFullPrice() {
        return fullPrice;
    }

    public Integer getHighestDiscount() {
        return highestDiscount;
    }

    public String getDiscountType() {
        return discountType;
    }

    public Integer getDiscountedPrice() {
        return discountedPrice;
    }
}
