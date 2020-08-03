public class Customer extends Person{	
private int level;	
private double amount1;	
private double amount2;	
private static double profit;
	public Customer(int id, String name, int age, char gender, int level){		
		super(id,name,age,gender);		
		this.level=level;	
	}	
	public void setLevel(int level){		
		this.level=level;	
	}	
	public int getLevel(){		
		return level;	
	}	
	public void setAmount1(double amount1){		
		this.amount1=amount1;	
	}	
	public double getAmount1(){		
		return amount1;	
	}	
	public void setAmount2(double amount2){		
		this.amount2=amount2;	
	}	
	public double getAmount2(){		
		return amount2;	
	}
	public void setProfit(double profit){		
		this.profit=profit;	
	}	
	public double getProfit(){		
		return profit;	
	}	
	public void calculateProfit(){		
		profit=amount2-amount1;	
	}	
	public void display(){		
		super.display();		
		System.out.println("Amount 1: " +amount1);		
		System.out.println("Amount 2: " +amount2);		
		System.out.println("Profit: " +profit);		
		System.out.println();	
	}	
	public void buyItems(double price1, double price2, int n){		
		amount1=(price1*n)+amount1;		
		amount2=(price2*n)+amount2;	
	}		
	public void reduceProfit(){		
		double t=0.0;		
		double reduceProfit=0.0;		
		if(level==1){			
			t=0.03;		
		}		
		else if(level==2){			
			t=0.05;		
		}		
		else if(level==3){			
			t=0.08;		
		}		
		else if(level==4){			
			t=0.12;		
		}
		reduceProfit=profit*t;		
		System.out.println("Reduction: " +reduceProfit);		
		profit=profit-reduceProfit;
	}





}
