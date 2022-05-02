package HackerRankPreparation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountDifferentPrices_HackerRank {

public static int priceDifference(List<String> products,List<Double> productsPrices,List<String> productsSold,List<Double> soldPrice) {

    HashMap<String, Double> productmap = new HashMap<>();
    int count = 0;

    for (int i = 0; i < products.size(); i++) {
        productmap.put(products.get(i), productsPrices.get(i));
    }

    for (int i = 0; i < productsSold.size(); i++) {

        if (productmap.containsKey(productsSold.get(i))) {
            if (productmap.get(productsSold.get(i)) != soldPrice.get(i)) {
                //System.out.println(productmap.get(i));
                count++;
            }
        }

    }
return count;
}





public static void main(String[] args)
{
    List<String> products =new ArrayList<>();
    products.add("eggs");
    products.add("milk");
    products.add("cheese");

    List<Double> productsPrice =new ArrayList<>();
    productsPrice.add(2.89);
    productsPrice.add(3.29);
    productsPrice.add(5.79);

    List<String> productsSold =new ArrayList<>();
    products.add("eggs");
    products.add("eggs");
    products.add("milk");
    products.add("cheese");

    List<Double> soldPrice =new ArrayList<>();
    productsPrice.add(2.89);
    productsPrice.add(2.99);
    productsPrice.add(5.97);
    productsPrice.add(2.39);

    System.out.println(priceDifference(products,productsPrice,productsSold,soldPrice));

   // products = ["eggs", "milk", "cheese"];
  //  productsPrices = {2.89, 3.29, 5.79};

  //  productsSold =    ["eggs", "eggs", "cheese", "milk"];
  //  soldPrice =        [2.89,   2.99,   5.97,     2.39];
}

}
