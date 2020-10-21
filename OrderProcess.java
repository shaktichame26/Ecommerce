
public class OrderProcess {

         private int order_num;
         private int order_date;
         private String order_status;
         private int ship_date;
         private int total;
         
		public  void OrderProcess() 
		{
		    order_num = 23456;
			order_date = 25/6/2020;
		    order_status = order_status;
			ship_date = 25/6/2020;
			total=1000;
			
		}

		public int getOrder_num() {
			return order_num;
		}

		public void setOrder_num(int order_num) {
			this.order_num = order_num;
		}

		public int getOrder_date() {
			return order_date;
		}

		public void setOrder_date(int order_date) {
			this.order_date = order_date;
		}

		public String getOrder_status() {
			return order_status;
		}

		public void setOrder_status(String order_status) {
			this.order_status = order_status;
		}

		public int getShip_date() {
			return ship_date;
		}

		public void setShip_date(int ship_date) {
			this.ship_date = ship_date;
		}

		public int getTotal() {
			return total;
		}

		public void setTotal(int total) {
			this.total = total;
		}
         
         public void printDetails()
         {
        	 System.out.println("order_num:"+order_num+",order_date:"+order_date+",order_status:"+order_status+",ship_date:"+ship_date+",total:"+total+"");
         }
	}

