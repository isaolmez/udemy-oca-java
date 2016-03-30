package oca.section1.lecture9;

public class EnumAdvancedTest {
	enum ShirtColor { 
		RED(5, "Company1"), GREEN(6, "Company1"), BLUE(7, "Company1"), BLACK(5, "Company1");
	
		private int dryingPeriod;
		
		private String supplier;
		
		private ShirtColor(int period, String supplier) {
			this.dryingPeriod = period;
			this.supplier = supplier;
		}

		// Getter/Setter methods for instance variables
		public int getDryingPeriod() {
			return dryingPeriod;
		}
		public void setDryingPeriod(int dryingPeriod) {
			this.dryingPeriod = dryingPeriod;
		}
		public String getSupplier() {
			return supplier;
		}
		public void setSupplier(String supplier) {
			this.supplier = supplier;
		}
		
		@Override
		public String toString() {
			return "color is: " + this.name();
		}
	}
	
	public static void main(String[] args) {
		ShirtColor color = ShirtColor.RED;
		System.out.println(color.toString());
		System.out.println(color.getDryingPeriod());
		System.out.println(color.getSupplier());
	}
}
