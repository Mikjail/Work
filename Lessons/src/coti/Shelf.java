package coti;

import java.util.HashMap;

public class Shelf {
		Product nuevo;
		
		//Properties
		private  HashMap<String, Product> productList = new HashMap<>();
	
	
		
	//Construct	
		public Shelf(){}
		
		public static Boolean addProduct(Shelf newShelf, Product product){
			
			if(newShelf.productList.containsKey(product.getDescripcion())){
				newShelf.productList.get(product.getDescripcion()).addProduct(product.getCantidad());
				System.out.println("Se Agrego "+product.getDescripcion()+" al carrito de compras!");
			}
			else {
				newShelf.productList.put(product.getDescripcion(),product);
				System.out.println("Se Agrego " + newShelf.productList.get(product.getDescripcion()).getCantidad() + " " + product.getDescripcion()+" al carrito de compras!");
			}
			return true;
		}
		
		public static boolean removeProduct(Shelf newShelf,Product product){
			
			if(newShelf.productList.containsKey(product.getDescripcion())){
				newShelf.productList.remove(product);
				System.out.println("El producto fue eliminado y quedan "+ product.getDescripcion()+"del mismo tipo en el Carrito!");
			}
			else
			{
				System.out.println("No quedan" + product.getDescripcion());
			}
			return true;
		}
		
		
		public static int HowMany(Shelf newShelf, Product product){
			if(newShelf.productList.containsKey(product.getDescripcion())){
				return newShelf.productList.get(product.getDescripcion()).getCantidad();
			}
			else{
				System.out.println("There is no "+ newShelf.productList.get(product.getDescripcion())+"in stock");
				return 0;
			}
		}
		
}
