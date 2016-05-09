package coti.Testing;

import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

import coti.Shelf;
import coti.CotiCard;
import coti.DebitCard;
import coti.Order;
import coti.Product;
import coti.ProductWithDiscount;
import coti.ProductWithoutDiscount;

public class CotiTesting {
	
	String testingString;
	Integer testingInterg;
	CotiCard cotiCard;
	DebitCard newDebitCard;
	Shelf stockDeCoti;
	ProductWithDiscount testingProductDisc;
	ProductWithoutDiscount testingProductWithoutDisc;
	ArrayList<Product> productList = new ArrayList<Product>();
	Order newOrderWithCotiPayment;
	Order newOrderWithDebitCard;
	

	@Before
	public void intializer(){
		
		testingInterg = 23;
		testingString= "Producto De Prueba";
		cotiCard = new CotiCard();
		stockDeCoti = new Shelf();
		testingProductDisc = new ProductWithDiscount(testingString, 20, testingInterg);
		testingProductWithoutDisc = new ProductWithoutDiscount(testingString, 50, 100);
		productList.add(testingProductDisc);
		productList.add(testingProductWithoutDisc);
	
	}
	
	
/************************************Shelf***************************/	
	public void shouldAddItemToStock(){
		assertTrue(Shelf.addProduct(stockDeCoti, testingProductDisc));
	}

	public void shouldReturnHowMany(){
		//Given a shelf(stockDeCoti)  with 1 product added (testingProductDisc)
		Shelf.addProduct(stockDeCoti, testingProductDisc);
		
		//It should return true or false whether the product was added.
		assertEquals(23,Shelf.HowMany(stockDeCoti, testingProductDisc));
	}
	

	public void shouldRemoveItemFromStock(){
		
		//Given a shelf with 1 product added
		Shelf.addProduct(stockDeCoti, testingProductDisc);
		
		//It should  return true or false whether the product was removed.
		assertTrue(Shelf.removeProduct(stockDeCoti, testingProductDisc));
	}
	
	@Test
	public void shouldDoAddHowManyAndRemoveInStock(){
		
		//Given a shelf(stockDeCoti) with 1 product added (testingProductDisc)	
		assertTrue(Shelf.addProduct(stockDeCoti, testingProductDisc));
		
		//It should return how many products are inside the Shelf.
		assertEquals(23,Shelf.HowMany(stockDeCoti, testingProductDisc));
		
		//It should  return true or false whether the product was removed.
		assertTrue(Shelf.removeProduct(stockDeCoti, testingProductDisc));	
	}

/********************Pay Method && Product with And without discount*******************/

	@Test
	public void shouldCalculatePayment(){
		
	 //given
		//ProductWithDiscount = 20,00(price) * 23(cant)
		//ProductWithoutDiscount = 50,00(price) * 100(cant)
		
	//Should Calculate
		/*
		 *
		 * ProductWithDiscount = every 2 products * 0.70(discount);
		 * 			+
		 * ProductWithoutDiscount = 5000
		 * 	Total = 394 + 5000= 5394;	
		*/
		assertEquals(5394,cotiCard.calculatePayment(productList),10);
	}
	
	
/**********************************Order**************************************/
	@Test
	public void shouldAddProductToNewOrder(){
		
	//Given a new order specifying COTI CARD pay method.
		newOrderWithCotiPayment = new Order(cotiCard);
		assertEquals(cotiCard,newOrderWithCotiPayment.getPayMethod());
		
	//Given a new order specifying DEBTI CARD pay method.
		newOrderWithDebitCard = new Order(newDebitCard);
		assertEquals(newDebitCard, newOrderWithDebitCard.getPayMethod());

	//Given Shelf with a new product (testingProductDisc)
		Shelf.addProduct(stockDeCoti, testingProductDisc);
		
		
	/*Should add a new product to the order. 
	 * To do this we must specify the stock where it is going be taken.
	 * It will return true if it is successfully added to the Order.
	 * it will return false: There is no item in Shelf.
	 */ 
		
		assertTrue(newOrderWithCotiPayment.addProduct(stockDeCoti, testingProductDisc));
	}
	
	
	

	
}