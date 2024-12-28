package entities;

public class Product {
		private String nameProduct;
		protected Double valueProduct;
		
		public Product(String nameProduct, Double valueProduct) {
			this.nameProduct = nameProduct;
			this.valueProduct = valueProduct;
		}
		
		public Double getValueProduct() {
			return valueProduct;
		}

		@Override
		public String toString() {
			return " " + nameProduct + " R$:" + valueProduct;
		}
}
		
