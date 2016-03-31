package Coty;

import java.text.DateFormat;
import java.util.ArrayList;

public class Compra {

	
	private ArrayList<Producto> listaProductos;
	private int cantidadTotalProductos;
	private Float precioTotal;
	private MetodoPago tipoDePago; 
	private Boolean pagoEfectuado;
	
	public Compra(){
		this.precioTotal= 0f;
		this.listaProductos = new ArrayList<Producto>();
	}
	
	public Compra(Producto producto, MetodoPago tipoPago){
		this();
		AgregarProducto(producto);
		this.tipoDePago = tipoPago;
		
	}
	
	public float getCantidadTotal(){
		return this.cantidadTotalProductos;
	}

	
	public float getPrecioTotal(){
		return this.precioTotal;
	}
	
	
	public void AgregarProducto(Producto producto){
		
		if(Stock.RemoverProducto(producto)){
			
			if(BuscarCantidadProducto(producto) < 1){
				this.listaProductos.add(producto);
				System.out.println("Se Agrego "+producto.cantidad+ " " + producto.descripcion+" al carrito de compras!");
				return;
			}
			
			if(BuscarCantidadProducto(producto) > 0){
				for (Producto item : listaProductos) {
					if(item.descripcion == producto.descripcion){
						item.cantidad+= producto.cantidad;
						System.out.println("Se Agrego "+item.descripcion+" al carrito de compras!");
						return;
					}
				}
			}
		}
		System.out.println("No se pueden agregar items que no se encuentran en stock!");
	}
	
	public void EliminarProducto(Producto producto){
		
		if(BuscarCantidadProducto(producto) > 1){
			for (Producto item : listaProductos) {
				if(item.descripcion == producto.descripcion){
					item.cantidad-=producto.cantidad;
					Stock.AgregarProducto(item);
					System.out.println("El producto fue eliminado y quedan "+ item.cantidad +"del mismo tipo en el Carrito!");
					return;
				}
			}
		}
		
		if(BuscarCantidadProducto(producto) == 1){
			this.listaProductos.remove(producto);
			this.precioTotal -= producto.precio;
			Stock.AgregarProducto(producto);
			System.out.println("El producto fue eliminado. No quedan productos del mismo tipo!");
			return;
		}
		
		System.out.println("El producto no se encuentra en el Carrito de compras.");
	}
	
	private int BuscarCantidadProducto(Producto producto){
		for(Producto item : this.listaProductos){
			if(item.descripcion == producto.descripcion && item.cantidad > 0 ){
				return item.cantidad;
			}
		}
		return -1;
	}
	
	public void CalcularCompra(MetodoPago metodo, int cuotas){
		metodo.CalcularPago(this.listaProductos, cuotas);
	}

	public void MostrarContenido(){
		StringBuilder mostrar = new StringBuilder(); 
		
		for (Producto producto : this.listaProductos) {	
			 mostrar.append("***********************\n")
			 		.append("Codigo: "+ producto.codigo+"\n")
					.append("Descripcion: "+ producto.descripcion+"\n")
					.append("Cantidad: "+ producto.cantidad+"\n")
					.append("Precio : "+ producto.precio + " * "+ producto.cantidad+"\n")
					.append("***********************\n");
		}
		System.out.println(mostrar.toString());
		System.out.println("Total: "+ this.precioTotal);
		System.out.println("************************");
		
		
	}
	
}
