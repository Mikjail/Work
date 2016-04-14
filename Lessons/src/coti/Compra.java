package coti;

import java.util.ArrayList;

import coti.domain.Producto;

public class Compra {

	
	private ArrayList<Producto> listaProductos;
	private int cantidadTotalProductos;
	private Float precioTotal;
	private MetodoPago tipoDePago; 
	
		
	public Compra(MetodoPago tipoPago){
		this.precioTotal= 0f;
		this.listaProductos = new ArrayList<Producto>();
		this.tipoDePago = tipoPago;
		
	}
		
	public float getCantidadTotal(){
		return this.cantidadTotalProductos;
	}

	
	public float getPrecioTotal(){
		return this.precioTotal;
	}
	
	
	public void AgregarProducto(Producto producto){
		
		if(Stock.IndiceProducto(producto)!= -1){
			
			if(this.listaProductos.get(IndiceProducto(producto)).getCantidad() > 0){	
				this.listaProductos.get(IndiceProducto(producto)).AgregarProducto(producto.getCantidad());
				System.out.println("Se Agrego "+this.listaProductos.get(IndiceProducto(producto)).getDescripcion()+" al carrito de compras!");
				return;
					
				
			}
				else{
					this.listaProductos.add(producto);
					System.out.println("Se Agrego "+producto.getCantidad()+ " " + producto.getDescripcion()+" al carrito de compras!");
					return;
				}
			
			
		}
		System.out.println("No se pueden agregar items que no se encuentran en stock!");
	}
	
	public void EliminarProducto(Producto producto){
		
		if(this.listaProductos.get(IndiceProducto(producto)).getCantidad() > 1){
			this.listaProductos.get(IndiceProducto(producto)).RemoverProducto(producto.getCantidad());
			Stock.AgregarProducto(producto);
			System.out.println("El producto fue eliminado y quedan "+ this.listaProductos.get(IndiceProducto(producto)).getCantidad() +"del mismo tipo en el Carrito!");
			return;
				
			}
		else
		{
			this.listaProductos.remove(producto);
			this.precioTotal -= producto.getPrecio();
			Stock.AgregarProducto(producto);
			System.out.println("No quedan productos del mismo tipo!");
			return;
		}
		
	}
	
	private int IndiceProducto(Producto producto){
		for(int i= 0 ; i<this.listaProductos.size(); i++){
			if(this.listaProductos.get(i).getDescripcion() == producto.getDescripcion()){
				return i;
			}
		}
		return -1;
	}
	
	public void Pagar(){
		this.tipoDePago.CalcularPago(this.listaProductos);
	}	

	public void MostrarContenido(){
		StringBuilder mostrar = new StringBuilder(); 
		
		for (Producto producto : this.listaProductos) {	
			 mostrar.append("***********************\n")
			 		.append("Codigo: "+ producto.getCodigo()+"\n")
					.append("Descripcion: "+ producto.getDescripcion()+"\n")
					.append("Cantidad: "+ producto.getCantidad()+"\n")
					.append("Precio : "+ producto.getPrecio() + " * "+ producto.getCantidad()+"\n")
					.append("***********************\n");
		}
		System.out.println(mostrar.toString());
		System.out.println("Total: "+ this.precioTotal);
		System.out.println("************************");
		
		
	}
	
}
