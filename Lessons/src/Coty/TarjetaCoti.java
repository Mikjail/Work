package Coty;

import java.util.ArrayList;

public class TarjetaCoti extends MetodoPago {
	@Override
	public void CalcularPago(ArrayList<Producto> listProductos, int cuotas) {
		// TODO Auto-generated method stub
		float precioTotal;
		for (Producto producto : listProductos) {
			
			if(producto instanceof Granos){
				precioTotal = CalcularPagoGranos(producto);
			}
		}
		
	}
	
	private float CalcularPagoGranos(Producto producto){
		int precioTotal;	
		if(producto.descripcion.equals(EGranos.Arvejas)){
				if(producto.cantidad % 2 == 0){
				
				}
			}
		
		return 1;
	}
	
}
