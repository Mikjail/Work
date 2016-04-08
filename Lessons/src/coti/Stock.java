package coti;

import java.util.ArrayList;

import coti.domain.Producto;

public class Stock {

		public static ArrayList<Producto> listaProductos = new ArrayList<Producto>();

		
		public static void AgregarProducto(Producto producto){
			
			
			if(listaProductos.get(IndiceProducto(producto)).getCantidad() > 0){
				listaProductos.get(IndiceProducto(producto)).AgregarProducto(producto.getCantidad());
				System.out.println("Se Agrego "+listaProductos.get(IndiceProducto(producto)).getDescripcion()+" al carrito de compras!");
				return;
			}
			else {
				listaProductos.add(producto);
				System.out.println("Se Agrego "+producto.getCantidad()+ " " + producto.getDescripcion()+" al carrito de compras!");
				return;
			}
					
			
		}
		
		public static boolean EliminarProducto(Producto producto){
			
			if(listaProductos.get(IndiceProducto(producto)).getCantidad() > 1){
				listaProductos.get(IndiceProducto(producto)).RemoverProducto(producto.getCantidad());
				System.out.println("El producto fue eliminado y quedan "+ listaProductos.get(IndiceProducto(producto)).getCantidad() +"del mismo tipo en el Carrito!");
				return  true;
					
				}
			else
			{
				listaProductos.remove(producto);
				System.out.println("No quedan productos del mismo tipo!");
				return false;
			}
			
		}
		
		public static int IndiceProducto(Producto producto){
			for(int i= 0 ; i<listaProductos.size(); i++){
				if(listaProductos.get(i).getDescripcion() == producto.getDescripcion()){
					return i;
				}
			}
			return -1;
		}
}
