package b6070236_b6070212_b6074425;

public class calculate{
	
	private double inter  ;

	public void calInteryear(double finance,double month,double interyear){
		inter = (finance * interyear) * (month / 12) ;
		System.out.println(interyear + "      MMM");
		System.out.println(month + "      MMM");
	}
	
	public double getInterest(){
		return inter;
	}
}
