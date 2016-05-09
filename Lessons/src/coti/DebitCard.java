package coti;

import java.util.ArrayList;

public class DebitCard extends PayMethod{

	public DebitCard(){}
	
	
	@Override
	public float calculatePayment(ArrayList<Product> listProductos) {
		// TODO Auto-generated method stub
		float total = 0;
		
		for (Product producto : listProductos) {
			total+= producto.getCantidad() * producto.getPrice();
		}
		
		return total;
	}

}
