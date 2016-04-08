package coti;

import java.util.ArrayList;

import coti.domain.Producto;

public class TarjetaCoti extends MetodoPago {
	float desc= 0.70f;
	String respuesta="n";
	
	public TarjetaCoti(){}
	
	
	@Override
	public float CalcularPago(ArrayList<Producto> listProductos) {
		// TODO Auto-generated method stub
		float total=0;
		int cantidadConDesc=0, cantidadSinDesc=0;
	
		for (Producto producto : listProductos) {
			cantidadConDesc = ( producto.getCantidad() - ( producto.getCantidad() % 2 ) ) / 2;
			cantidadSinDesc = producto.getCantidad() - cantidadConDesc;
			total += producto.CalcularPrecio(desc) * cantidadConDesc;
			total += producto.getPrecio() * cantidadSinDesc;
		}
	
			System.out.println("el total es "+total+ " y puede pagar en las siguientes cuotas:"+ 
					"\n1 = "+ total+
					"\n2 = "+ total/2 +
					"\n3 = "+ total/3 +
					"\n6 = "+ total/6 +
					"\n12 = "+ total/12);

		return total;
	}
	
	
}
