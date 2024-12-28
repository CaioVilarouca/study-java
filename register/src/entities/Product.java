package entities;

public class Product {
		private String nameProduct;
		private Double valueProduct;
		
		public Product(String nameProduct, Double valueProduct) {
			this.nameProduct = nameProduct;
			this.valueProduct = valueProduct;
		}

		@Override
		public String toString() {
			return " " + nameProduct + " " + valueProduct;
		}
}
		
