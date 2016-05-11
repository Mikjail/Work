package coti;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		Customer cliente1 = new Customer("Juan",25);
		Customer cliente2 = new Customer("Pedro", 10);
		Shelf shelfProducts = new Shelf();
		//SE AGREGA STOCK A COTI
		Shelf.addProduct(shelfProducts, new ProductWithDiscount(1, "Trigo",20, 100));
		Shelf.addProduct(shelfProducts, new ProductWithoutDiscount(2, "Maiz",30, 100));
		Shelf.addProduct(shelfProducts, new ProductWithDiscount(3, "Oreo",15, 100));
		
		
		//SE REALIZA UNA NUEVA COMPRA
		Order compraNueva = new Order(new CotiCard());		
		compraNueva.addProduct(shelfProducts, new ProductWithDiscount(1, "Trigo", 15, 1));
		compraNueva.addProduct(shelfProducts, new ProductWithDiscount(2, "Maiz", 15, 3));
		compraNueva.addProduct(shelfProducts, new ProductWithoutDiscount(3, "Arvejas",20, 3));
		compraNueva.addProduct(shelfProducts, new ProductWithoutDiscount(3, "Oreo",26, 4));
		 
		compraNueva.Pagar();
		
		
		//SE LE AGREGA COMPRA AL CLIENTE1.
		cliente1.AgregarAListaCompras(compraNueva);
		
		
		
		
		//SE REALIZA OTRA COMPRA
		Order otraCompra = new Order(new DebitCard());
		
		otraCompra.addProduct(shelfProducts, new ProductWithDiscount(5, "Porotos",36, 5));
		otraCompra.addProduct(shelfProducts, new ProductWithoutDiscount(6, "Toddy",19, 10));
		otraCompra.addProduct(shelfProducts, new ProductWithoutDiscount(7, "Trigo",16, 36));
		
		
		otraCompra.Pagar();
		
		//SE LE AGREGA COMPRA AL CLIENTE2
		cliente2.AgregarAListaCompras(otraCompra);
		
	

		System.out.println("PASAMOS A MOSTRAR LAS COMPRAS DE CADA CLIENTE");
	
		cliente1.Mostrar();
		
		cliente2.Mostrar();
	}

}
