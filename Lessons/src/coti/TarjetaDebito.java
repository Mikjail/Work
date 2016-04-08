package coti;

import java.util.ArrayList;

import coti.domain.Producto;

public class TarjetaDebito extends MetodoPago{

	public TarjetaDebito(){}
	
	
	@Override
	public float CalcularPago(ArrayList<Producto> listProductos) {
		// TODO Auto-generated method stub
		float total = 0;
		
		for (Producto producto : listProductos) {
			total+= producto.getCantidad() * producto.getPrecio();
		}
		
		return total;
	}

}
