public class Customer extends Person {
private int level;
private double amount1;
private double amount2;
private double profit;

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
			System.out.println(c[i].id);
			System.out.println(c[i].name);
			System.out.println(c[i].age);
			System.out.println(p[i].gender);
		}
	}

}
