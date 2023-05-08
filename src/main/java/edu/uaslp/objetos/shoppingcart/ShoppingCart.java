package edu.uaslp.objetos.shoppingcart;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {



    LinkedList<ShoppingItem> shoppingCart;

    ShoppingCart(){
        shoppingCart = new LinkedList<>();
    }

    public void add(String param){

    }

    public int getTotalCostInCents(){
        return 0;
    }

    public int getDistinctItemsCount(){
        return 0;
    }

    public int getTotalItemsCount(){
        return 0;
    }

    public List getItems(){
        LinkedList<ShoppingItem> item = new LinkedList<>();
        Iterator<ShoppingItem> it = shoppingCart.iterator();

        return item;
    }


}
