package Coty;

import java.util.ArrayList;

public abstract class MetodoPago {

		private int cuotas;
		private float descuento;
		
		public abstract void CalcularPago(ArrayList<Producto> listProductos, int cuotas);
		
}
