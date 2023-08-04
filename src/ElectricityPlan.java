

public abstract class ElectricityPlan 
	{
		int rate;
		
		public abstract void setRate();
		
		
		public void calculteBill(int unit)
		{
			System.out.println(rate*unit);
		}
		
		
		public static ElectricityPlan getPlan(String plan)
		{
			if(plan.equals("commercial"))
				return new CommercialPlan();
			else if(plan.equals("domestic"))
				return new DomesticPlan();
			else
				return null;
						
		}
		
		
		public static void main(String[] args) {
			
			ElectricityPlan plan=ElectricityPlan.getPlan("commercials");
			plan.setRate();
			plan.calculteBill(5);
			
			plan=ElectricityPlan.getPlan("domestic");
			plan.setRate();
			plan.calculteBill(5);
			
			
			
		}
	}
