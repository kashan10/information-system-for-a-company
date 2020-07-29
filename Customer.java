public class Customer extends Person {
private int level;
private static double amount1;
private static double amount2;
private static double profit;

	public Customer(int id,String name,int age,char gender,level){
		
		super(id,name,age,gender);
		this.level = level
	}

	public int getLevel(){
		return level;
	}
	public double getAmount1() {
    		return amount1;
  	}
	
	public double getAmount2(){
		return amount2;
	}
	public double getProfit(){
		return profit;
	}

  	public void setLevel(int level){
    		this.level = level;
  	}
  	public void setAmount1(double amount1){
    		this.amount1 = amount1;
  	}
	public void setAmount2(double amount2){
    		this.amount2 = amount2;
  	}
	public void setProfit(double profit){
		this.profit= profit;
	}

	public display (Customer c[]){
		
		for(i=0; i < c.length; i++){
			System.out.println(c[i].level);
			System.out.println(c[i].amount1);
			System.out.println(c[i].amount2);
			System.out.println(c[i].profit);
		}
	}

	public static void calculateProfit (){
		
		profit = amount1 - amount2 ; 
	}

	public static void buyItems (double price1,double price2,int n){
		amount1 = price1*n + amount1;
		amount2 = price2*n + amount2;

	}

	public reduceProfit (){
		
	}





}
