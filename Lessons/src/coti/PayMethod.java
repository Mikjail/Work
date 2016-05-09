package coti;

import java.util.ArrayList;

public abstract class PayMethod {

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
		
		public PayMethod(){
			
		}
		
		public abstract float calculatePayment(ArrayList<Product> listProductos);


	
		
}
