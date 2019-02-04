package tests;

import org.junit.Test;
import static org.junit.Assert.*;


public class TJTests {
    @Test
    public void itemConstructorAndToStringTest() {
        Item item = new Item("USB drive",5,1234,9.99 );
        assertTrue(
                item.getName().equals("USB drive")
                        && item.getQuantity() == 5
                        && item.getCatalogNumber() == 1234
                        && item.getPrice() == 9.99);
        System.out.println(item.toString());
        assertEquals("Regular Item{name='USB drive', catalogNumber=1234, quantity=5, price=9.99}",
                item.toString());
    }

    @Test
    public void onSaleItemConstructorAndToStringTest() {
        OnSaleItem item = new OnSaleItem("USB drive",5,1234,9.99, 20 );
        System.out.println(item.toString());

        assertTrue(
                item.getName().equals("USB drive")
                        && item.getQuantity() == 5
                        && item.getCatalogNumber() == 1234
                        && item.getPrice() == 7.992
                        && item.getDiscount() == 20);

        assertEquals("OnSaleItem{discount=20.0%, name=USB drive, price=7.992}",
                item.toString());
    }

    @Test
    public void onSaleItemConstructorAndToStringTest2() {
        OnSaleItem item = new OnSaleItem("USB drive",5,1234,9.99, 0.0 );
        assertTrue(
                item.getName().equals("USB drive")
                        && item.getQuantity() == 5
                        && item.getCatalogNumber() == 1234
                        && item.getPrice() == 9.99
                        && item.getDiscount() == 0.0);

        assertEquals("OnSaleItem{discount=0.0%, name=USB drive, price=9.99}",
                item.toString());
    }

    @Test
    public void itemAddTest() {
        TJMaxx tj = new TJMaxx();
        Item item = new Item("USB drive",5,1234,9.99 );
        tj.addRegularItem(item);
        assertEquals(1,tj.regularItemsCount());
        Item rItem = tj.getRegularItems().get(0);
        assertTrue(
                rItem.getName().equals("USB drive")
                        && rItem.getQuantity() == 5
                        && rItem.getCatalogNumber() == 1234
                        && rItem.getPrice() == 9.99);
        System.out.println(rItem.toString());
        assertEquals("Regular Item{name='USB drive', catalogNumber=1234, quantity=5, price=9.99}",
                rItem.toString());
    }

    @Test
    public void onSaleItemAddTest() {
        TJMaxx tj = new TJMaxx();
        OnSaleItem item = new OnSaleItem("USB drive",5,1234,9.99, 20.0 );
        tj.addOnSaleItem(item);
        assertEquals(1,tj.onSaleItemsCount());

        OnSaleItem rItem = tj.getOnSaleItems().get(0);
        assertTrue(
                rItem.getName().equals("USB drive")
                        && rItem.getQuantity() == 5
                        && rItem.getCatalogNumber() == 1234
                        && rItem.getPrice() == 7.992
                        && rItem.getDiscount() == 20.0);

        assertEquals("OnSaleItem{discount=20.0%, name=USB drive, price=7.992}",
                rItem.toString());
    }

    @Test
    public void getAllItemNamesTest() {
        TJMaxx tj = new TJMaxx();
        OnSaleItem item = new OnSaleItem("USB drive",5,1234,9.99, 0.2 );
        tj.addRegularItem(new Item("pool stick",9,14356,9.99));
        tj.addRegularItem(new Item("chair",200,37356, 45.3));
        tj.addRegularItem(new Item("outlet",30,22356,234.5));
        tj.addRegularItem(new Item("white out",2,73356,43.23));
        tj.addRegularItem(new Item("shawl",700,13356,54.23));
        tj.addRegularItem(new Item("hair tie",2000,25356,12.0));
        tj.addRegularItem(new Item("television",1,19356, 1234.55));
        tj.addOnSaleItem(item);

        assertEquals(8,tj.getAllItemNames().size());
        assertEquals("[pool stick, chair, outlet, white out, shawl, hair tie, television, USB drive]",
                tj.getAllItemNames().toString());


    }

    @Test
    public void getItemPriceTest() {
        TJMaxx tj = new TJMaxx();
        OnSaleItem item = new OnSaleItem("USB drive",5,1234,9.99, 20 );
        tj.addRegularItem(new Item("pool stick",9,14356,9.99));
        tj.addRegularItem(new Item("chair",200,37356, 45.3));
        tj.addRegularItem(new Item("outlet",30,22356,234.5));
        tj.addRegularItem(new Item("white out",2,73356,43.23));
        tj.addRegularItem(new Item("shawl",700,13356,54.23));
        tj.addRegularItem(new Item("hair tie",2000,25356,12.0));
        tj.addRegularItem(new Item("television",1,19356, 1234.55));
        tj.addOnSaleItem(item);

        assertEquals(7.992, tj.getItemPrice(1234),0);
        assertEquals(9.99, tj.getItemPrice(14356),0);
        assertEquals(1234.55, tj.getItemPrice(19356),0);
        assertEquals(0.0, tj.getItemPrice(10),0);


    }

    @Test
    public void getOnSaleItemTest() {
        TJMaxx tj = new TJMaxx();
        OnSaleItem item = new OnSaleItem("USB drive",5,1234,9.99, 20 );
        tj.addOnSaleItem(new OnSaleItem("pool stick",9,14356,9.99, 30));
        tj.addOnSaleItem(new OnSaleItem("chair",200,37356, 45.0,30));
        tj.addOnSaleItem(new OnSaleItem("outlet",30,22356,234.5,30));
        tj.addOnSaleItem(new OnSaleItem("white out",2,73356,43.23,30));
        tj.addOnSaleItem(item);

        assertEquals("OnSaleItem{discount=20.0%, name=USB drive, price=7.992}" , tj.getOnSaleItem("USB drive").toString());
        assertEquals("OnSaleItem{discount=30.0%, name=chair, price=31.5}",tj.getOnSaleItem("chair").toString());
        assertEquals("OnSaleItem{discount=30.0%, name=outlet, price=164.15}",tj.getOnSaleItem("outlet").toString());




    }

    @Test
    public void removeItemTest() {
        TJMaxx tj = new TJMaxx();
        OnSaleItem item = new OnSaleItem("USB drive",5,1234,9.99, 0.2 );

        tj.addOnSaleItem(item);
        tj.addOnSaleItem(new OnSaleItem("pool stick",9,14356,9.99, 0.3));
        tj.addOnSaleItem(new OnSaleItem("chair",200,37356, 45.3,0.3));

        tj.addRegularItem(new Item("outlet",30,223566,234.5));
        tj.addRegularItem(new Item("white out",2,73356,43.23));
        tj.addRegularItem(new Item("shawl",700,13356,54.23));
        tj.addRegularItem(new Item("hair tie",2000,25356,12.0));
        tj.addRegularItem(new Item("television",1,19356, 1234.55));

        assertEquals(5 , tj.regularItemsCount());
        assertEquals(3, tj.onSaleItemsCount());

        tj.removeItem(1234);
        tj.removeItem(19356);
        tj.removeItem(25356);
        tj.removeItem(253563345);
        assertEquals(3 , tj.regularItemsCount());
        assertEquals(2, tj.onSaleItemsCount());

        assertNull(tj.getOnSaleItem("USB drive"));


    }

    @Test
    public void buyItemTest() {
        TJMaxx tj = new TJMaxx();
        OnSaleItem item = new OnSaleItem("USB drive",5,1234,9.99, 0.2 );

        tj.addOnSaleItem(item);
        tj.addOnSaleItem(new OnSaleItem("pool stick",9,14356,9.99, 0.3));
        tj.addOnSaleItem(new OnSaleItem("chair",200,37356, 45.3,0.3));

        tj.addRegularItem(new Item("outlet",30,223566,234.5));
        tj.addRegularItem(new Item("white out",2,73356,43.23));
        tj.addRegularItem(new Item("shawl",700,13356,54.23));
        tj.addRegularItem(new Item("hair tie",2000,25356,12.0));
        tj.addRegularItem(new Item("television",1,19356, 1234.55));

        assertEquals(5 , tj.regularItemsCount());
        assertEquals(3, tj.onSaleItemsCount());

        tj.buyItem(1234);
        tj.buyItem(19356);
        tj.buyItem(25356);

        assertEquals(4 , tj.getOnSaleItems().get(0).getQuantity());
        assertEquals(1999 , tj.getRegularItems().get(3).getQuantity());


        assertNull(tj.getOnSaleItem("television"));


    }


}