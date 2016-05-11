package coti;

import java.util.ArrayList;

public class Order {

	
	private ArrayList<Product> productList;
	private int totalItems;
	private Float total;
	private PayMethod payMethod;

	
		
	public Order(PayMethod tipoPago){
		this.total= 0f;
		this.productList = new ArrayList<Product>();
		this.payMethod = tipoPago;
		
	}
		
	public float getCantidadTotal(){
		return this.totalItems;
	}

	
	public float getTotal(){
		return this.total;
	}
	
	public PayMethod getPayMethod(){
		return this.payMethod;
	}

	
	public Boolean addProduct(Shelf existingProducts, Product productToAdd){
		
	if(Shelf.HowMany(existingProducts, productToAdd)>0){
		if(this.productList.contains(productToAdd)){	
			if(this.productList.get(productIndex(productToAdd)).getCantidad() > 0){	
				this.productList.get(productIndex(productToAdd)).addProduct(productToAdd.getCantidad());
				System.out.println("Se Agrego "+this.productList.get(productIndex(productToAdd)).getDescripcion()+" al carrito de compras!");				
			}
				else{
					this.productList.add(productToAdd);
					System.out.println("Se Agrego "+productToAdd.getCantidad()+ " " + productToAdd.getDescripcion()+" al carrito de compras!");
				}
			return true;
		}	
	
	}
		
		System.out.println("No se pueden agregar items que no se encuentran en stock!");
		
			return false;
	}
	
	public void removeProduct(Shelf existingProducts, Product productToRemove){
		
		if(this.productList.get(productIndex(productToRemove)).getCantidad() > 1){
			this.productList.get(productIndex(productToRemove)).removeProduct(productToRemove.getCantidad());
			Shelf.addProduct(existingProducts, productToRemove);
			System.out.println("El producto fue eliminado y quedan "+ this.productList.get(productIndex(productToRemove)).getCantidad() +"del mismo tipo en el Carrito!");
			return;
				
			}
		else
		{
			this.productList.remove(productToRemove);
			this.total -= productToRemove.getPrice();
			Shelf.addProduct(existingProducts, productToRemove);
			System.out.println("No quedan productos del mismo tipo!");
			return;
		}
		
	}
	
	private int productIndex(Product product){
		for(int i= 0 ; i<this.productList.size(); i++){
			if(this.productList.get(i).getDescripcion() == product.getDescripcion()){
				return i;
			}
		}
		return 0;
	}
	
	public void Pagar(){
		this.payMethod.calculatePayment(this.productList);
	}	

	public void MostrarContenido(){
		StringBuilder mostrar = new StringBuilder(); 
		
		for (Product producto : this.productList) {	
			 mostrar.append("***********************\n")
			 		.append("Codigo: "+ producto.getCodigo()+"\n")
					.append("Descripcion: "+ producto.getDescripcion()+"\n")
					.append("Cantidad: "+ producto.getCantidad()+"\n")
					.append("Precio : "+ producto.getPrice() + " * "+ producto.getCantidad()+"\n")
					.append("***********************\n");
		}
		System.out.println(mostrar.toString());
		System.out.println("Total: "+ this.total);
		System.out.println("************************");
		
		
	}
	
}
