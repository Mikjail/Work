package Coty;

import java.util.ArrayList;

public class Stock {

		public static ArrayList<Producto> stockProductos = new ArrayList<Producto>();

		
		public static Boolean RemoverProducto(Producto producto){
			
			if(BuscarCantidadProducto(producto) > 0 || BuscarCantidadProducto(producto) < 1 ){
				stockProductos.remove(producto);
				System.out.println("El producto fue eliminado. No quedan productos del mismo tipo!");
				return true;
			}
			
		
			if(BuscarCantidadProducto(producto) > 1){
				for (Producto item : stockProductos) {
					if(item.descripcion == producto.descripcion){
						item.cantidad-=producto.cantidad;
						System.out.println("Se saco "+producto.cantidad + " "+  producto.descripcion+" del Stock y quedan "+ item.cantidad +" del mismo tipo!");
						return true;
					}
				}
			}

			System.out.println("El producto que busca no se encuentra en el Stock");
			return false;
		}
		
		public static void AgregarProducto(Producto producto){
		
			if(BuscarCantidadProducto(producto) < 1){
				stockProductos.add(producto);
				System.out.println("El producto se agrego al stock");
				return;
			}
			if(BuscarCantidadProducto(producto) > 1){
				for (Producto item : stockProductos) {
					if(item.descripcion == producto.descripcion){
						item.cantidad += producto.cantidad;
						System.out.println("El producto se agrego al stock");
						return;
					}
				}
			}
		}
		

		private static int BuscarCantidadProducto(Producto producto){
			for(Producto item : stockProductos){
					if(item.descripcion == producto.descripcion && item.cantidad > 0 ){
						return item.cantidad;
					}
				
			}
			return -1;
		}
}
