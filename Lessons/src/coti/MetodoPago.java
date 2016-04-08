package coti;

import java.util.ArrayList;

import coti.domain.Producto;

public abstract class MetodoPago {

		protected int cuotas;
		protected float descuento;
		

		public int getCuotas() {
			return cuotas;
		}

		public void setCuotas(int cuotas) {
			this.cuotas = cuotas;
		}
		
		public float getDescuento() {
			return descuento;
		}

		public void setDescuento(float descuento) {
			this.descuento = descuento;
		}
		
		public MetodoPago(){
			
		}
		
		public abstract float CalcularPago(ArrayList<Producto> listProductos);


	
		
}
