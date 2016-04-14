package coti;

import java.util.ArrayList;

public class Cliente {

		private String nombre;
		private Integer edad;
		private ArrayList<Compra> listaCompras;
		
		
		
	public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public Integer getEdad() {
			return edad;
		}

		public void setEdad(Integer edad) {
			this.edad = edad;
		}

		public ArrayList<Compra> getListaCompras() {
			return listaCompras;
		}

		public void setListaCompras(ArrayList<Compra> listaCompras) {
			this.listaCompras = listaCompras;
		}

	public Cliente(){
		this.listaCompras = new ArrayList<Compra>();
	}
		
	public Cliente(String nombre, Integer edad){
		this();
		this.nombre = nombre;
		this.edad = edad;
	}
		
	public void AgregarAListaCompras(Compra a){
		this.listaCompras.add(a);
		System.out.println(this.nombre+ " ha agregado una compra a su carrito.");
	}
	
		
	public void Mostrar(){
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Edad: "+ this.edad);
		for (Compra compras : listaCompras) {
			compras.MostrarContenido();
		}
	}
		
}
