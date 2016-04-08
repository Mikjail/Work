package coti;

import java.util.ArrayList;

public class Cliente {

		private String nombre;
		private Integer edad;
		private ArrayList<Compra> listaCompras;
		
	public Cliente(){
		this.listaCompras = new ArrayList<Compra>();
	}
		
	public void AgregarAListaCompras(Compra a){
		this.listaCompras.add(a);
		System.out.println(this.nombre+ " ha agregado una compra a su carrito.");
	}
	
	public Cliente(String nombre, Integer edad){
		this();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
		
	public void Mostrar(){
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Edad: "+ this.edad);
		for (Compra compras : listaCompras) {
			compras.MostrarContenido();
		}
	}
		
}
