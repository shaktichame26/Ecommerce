
public class ShoppingCart {
	
	
	private int ship_id;
	private String ship_name;
	private String desc;
	private int ship_Date;
	

		public  void ShoppingCart() 
		{
		ship_id = 100;
		ship_name = "Mobile";
		desc = "quality";
		ship_Date = 26/8/2020;
	}


		public int getShip_id() {
			return ship_id;
		}


		public void setShip_id(int ship_id) {
			this.ship_id = ship_id;
		}


		public String getShip_name() {
			return ship_name;
		}


		public void setShip_name(String ship_name) {
			this.ship_name = ship_name;
		}


		public String getDesc() {
			return desc;
		}


		public void setDesc(String desc) {
			this.desc = desc;
		}


		public int getShip_Date() {
			return ship_Date;
		}


		public void setShip_Date(int ship_Date) {
			this.ship_Date = ship_Date;
		}
		
		public void printDetails()
		{
			System.out.println("ship_id:"+ship_id+",ship_name:"+ship_name+",desc="+desc+",ship_date:"+ship_Date+" ");
		}

	}


