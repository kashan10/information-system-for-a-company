public class FullTimeEmployee extends Employee{	
private double fund;	
private double fundRate;
	public FullTimeEmployee(int id, String name, int age, char gender, String designation, String mobile, double fundRate){		
		super(id,name,age,gender,designation,mobile);		
		this.fundRate=fundRate;		
		fund=0.0;	
	}	
	public void setFund(double fund){		
		this.fund=fund;
	}	
	public double getFund(){		
		return fund;	
	}	
	public void setFundRate(double funddRate){		
		this.fundRate=fundRate;	
	}	
	public double getFundRate(){		
		return fundRate;	
	}	
	public void display(){		
		super.display();		
		System.out.println("Fund: "+fund);		
		System.out.println("FundRate: "+fundRate);		
		System.out.println();	
	}	
	public void addToFund(){		
		fund=salary*fundRate;		
		salary=salary-fund;	
	}
}
PartTimeEmployee class
public class PartTimeEmployee extends Employee{	
private double hours;	
private double rate;
	
	public PartTimeEmployee(int id,String name,int age,char gender,String designation,String mobile,double rate){		
		super(id,name,age,gender,designation,mobile);		
		this.rate=rate;	
	}	
	public void setHours(double hours){		
		this.hours=hours;	
	}	
	public double getHours(){		
		return hours;	
	}	
	public void setRate(double rate){		
		this.rate=rate;	
	}	
	public double getRate(){		
		return rate;		
	}	
	public void display(){		
		super.display();		
		System.out.println("Hours: "+hours);		
		System.out.println("Rate: "+rate);		
		System.out.println();	
	}	
	public void computeSalary(){		
		salary=hours*rate;	
	}
}
