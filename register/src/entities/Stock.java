package entities;

public class Stock {
	private Product product;
	private HubStock hubStock;
	
	public Stock(Product product, HubStock hubStock) {
		this.product = product;
		this.hubStock = hubStock;
	}

	@Override
	public String toString() {
		return "Stock [product=" + product + ", hubStock=" + hubStock + "]";
	}
	
	
}

/*
	public class Stock {
	    // Votores
	    private String[] nameStock = new String[3];
	    private Integer[] amountStock = new Integer[3];
	    private Double[] valueStock = new Double[3];
	    private double valueEnd = 0;
	    
	    // vetores 
	    public void vectorStock (String name, int amount, double value, int i) {
	    		 nameStock[i] = name;
	    	     amountStock[i] = amount;
	    	     valueEnd += valueStock[i] = value;
	    }
	    
	    // Print dos registros
	    public void printRegister() {
	    	System.out.println("\nRegistros de Produtos:");
	        for (int i = 0; i < 3; i++) {
	            System.out.println("Nome do produto: " + nameStock[i]);
	            System.out.println("Quantidade: " + amountStock[i]);
	            System.out.printf("Valor do estoque: R$%.2f \n", valueStock[i]);
	        }
	        System.out.printf("\nValor do estoque todo R$ %.2f", valueEnd);
	    }
	}
*/