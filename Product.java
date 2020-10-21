
public class Product {
	
		private int productId;
		private String productName;
		private double price;
		private String desc;
		public int getProductId() {
			return productId;
		}
		public Product()
		{
			productId=10;
			productName="Mobile";
			price=9000;
			desc="Good";
			
		}
		public void setProductId(int productId) {
			this.productId = productId;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public String getDesc() {
			return desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
		public void printDetails()
		{
			System.out.println("productId:"+productId+", productName:"+productName+",desc:"+desc+",price"+price+" ");
		}
		

	}

