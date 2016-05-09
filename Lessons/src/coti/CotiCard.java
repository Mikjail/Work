package coti;

import java.util.ArrayList;

public class CotiCard extends PayMethod {
	float desc= 0.70f;
	String respuesta="n";
	
	public CotiCard(){}
	
	
	@Override
	public float calculatePayment(ArrayList<Product> productList) {
		// TODO Auto-generated method stub
		float total=0;
		int cantidadConDesc=0, cantidadSinDesc=0;
	
		for (Product product : productList) {
			cantidadConDesc = ( product.getCantidad() - ( product.getCantidad() % 2 ) ) / 2;
			cantidadSinDesc = product.getCantidad() - cantidadConDesc;
			total += product.calculatePrice(desc) * cantidadConDesc;
			total += product.getPrice() * cantidadSinDesc;
		}
	
			System.out.println("el total es "+total);

		return total;
	}
	
	
}
