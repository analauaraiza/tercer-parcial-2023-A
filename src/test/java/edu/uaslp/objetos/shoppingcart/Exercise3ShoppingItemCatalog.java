package edu.uaslp.objetos.shoppingcart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class Exercise3ShoppingItemCatalog {


    @Test
    public void givenAValidCode_whenGetItem_thenShoppingItemIsReturned(){
        //given
        ShoppingItemCatalog shoppingItemCatalog = new ShoppingItemCatalog();

        //when
        ShoppingItem item = shoppingItemCatalog.getItem("ABC2000");

        //then
        Assertions.assertNotNull(item);

    }

    @Test
    public void givenANotValidCode_whenGetItem_thenNullIsReturned(){
        //given
        ShoppingItemCatalog shoppingItemCatalog = new ShoppingItemCatalog();

        //when
        ShoppingItem item = shoppingItemCatalog.getItem("Inexistente");

        //then
        Assertions.assertNull(item);
    }
}
