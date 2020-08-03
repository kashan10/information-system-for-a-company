public class Employee extends Person{	
	private String designation,mobile;	
	double salary;	
	private double tax;		
	public Employee(){}	
	public Employee(int id, String name, int age, char gender, String designation, String mobile){		
		super(id,name,age,gender);		
		this.designation=designation;		
		this.mobile=mobile;	
	}
	public void setDesignation(String designation){		
			this.designation=designation;	
	}	
	public String getDesignation(){		
		return designation;	
	}	
	public void setMobile(String mobile){		
		this.mobile=mobile;	
	}	
	public String getMobile(){		
		return mobile;	
	}	
	public void setSalary(double salary){		
		this.salary=salary;	
	}	
	public double getSalary(){		
		return salary;	
	}	
	public void setTax(double tax){		
		this.tax= tax;	
	}	
	public double getTax(){		
		return tax;	
	}	
	public void display(){		
		super.display();		
		System.out.println("Designation: "+designation);		
		System.out.println("Mobile: " +mobile);		
		System.out.println("Salary: " +salary);		
		System.out.println("Tax: " +tax);		
		System.out.println();	
	}	
	public void getAverageSalary(Employee array[]){		
		double avg, total=0.0;		
		for(int i=0;i<array.length;i++){			
			total=total+array[i].getSalary();			
			avg=total/array.length;			
			System.out.println("Average Salary: "+avg);		
		}
	}	
	public void computeTax(double taxRate){		
		tax=salary*taxRate;	
	}	
	public double getNetSalary(){		
		salary=salary-tax;		
		return salary;	
	}
}
