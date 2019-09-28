package b6070236_b6070212_b6074425;

public class Threds2 {
	private double inter,inter2,inter3,inter4;

	public void calInteryear12(double finance,double interyear){
		inter = (finance * interyear) * (12 / 12) ;	
	}
	public double getInterest(){
		return inter;
	}
	
	public void calInteryear24(double finance,double interyear){
		inter2 = (finance * interyear) * (24 / 12) ;
	}
	public double getInterest24(){
		return inter2;
	}	
	
	public void calInteryear36(double finance,double interyear){
		inter3 = (finance * interyear) * (36 / 12) ;
	}
	public double getInterest36(){
		return inter3;
	}
	
	public void calInteryear48(double finance,double interyear){
		inter4 = (finance * interyear) * (48 / 12) ;
	}	
	public double getInterest48(){
		return inter4;
	}
}
