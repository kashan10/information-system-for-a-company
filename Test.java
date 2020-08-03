class Test{
	
	public static void main(String args[])
	{
		Person p = new Person();		
		Customer[] arr= new Customer[5];		
		arr[0]= new Customer(3251, "Kasun", 27,'M',3);		
		arr[1]= new Customer(4863,"Nimal",23,'M',2);		
		arr[2]= new Customer(5791,"Nayana",28,'F',4);		
		arr[3]= new Customer(2456,"Chathura",32,'M',1);		
		arr[4]= new Customer(7593,"Waruni",18,'F',2);
		display(arr);		
		arr[3].setLevel(arr[3].getLevel()+1);		
		arr[2].setGender('M');		
		arr[1].display();		
		arr[2].display();		
		p.getAverageAge(arr);				
		arr[0].buyItems(54,57,8);		
		arr[0].buyItems(32,39,5);		
		arr[0].buyItems(75,76,7);		
		arr[1].buyItems(45,48,9);		
		arr[1].buyItems(78,81,12);		
		arr[1].buyItems(12,14,17);		
		arr[1].buyItems(24,27,4);		
		arr[2].buyItems(92,96,8);		
		arr[2].buyItems(125,130,10);		
		arr[3].buyItems(82,89,7);		
		arr[3].buyItems(138,155,6);		
		arr[3].buyItems(52,60,2);		
		arr[3].buyItems(66,75,11);		
		arr[3].buyItems(105,120,21);		
		arr[4].buyItems(99,110,2);
		for(int i=0;i<arr.length;i++){			
			arr[i].calculateProfit();		
		}
		for(int i=0;i<arr.length;i++){			
			System.out.println("Id: "+arr[i].getId());			
			System.out.println("Profit: "+arr[i].getProfit());			
			System.out.println();		
		}				
		for(int i=0;i<arr.length;i++){			
			arr[i].reduceProfit();		
		}		
		FullTimeEmployee arr1[]=new FullTimeEmployee[7];
		arr1[0] = new FullTimeEmployee(68494,"Nuwan",52,'M',"Manager","0516859465",0.03);		
		arr1[1] = new FullTimeEmployee(98451,"Charaka",29,'M',"Assistant Manager","0919576348",0.02);		
		arr1[2] = new FullTimeEmployee(79563,"Wathsala",34,'F',"Clerk","0668567956",0.01);		
		arr1[3] = new FullTimeEmployee(36864,"Chathurika",35,'F',"Clerk","0219762354",0.02);		
		arr1[4] = new FullTimeEmployee(48952,"Sandun",27,'M',"Labourer","0319548231",0.01);		
		arr1[5] = new FullTimeEmployee(65825,"Janith",21,'M',"Labourer","0119652352",0.005);		
		arr1[6] = new FullTimeEmployee(56286,"Chamari",38,'F',"Clerk","0512648927",0.02);
		display(arr1);
		arr1[0].setSalary(65000);		
		arr1[1].setSalary(60000);		
		arr1[2].setSalary(35000);		
		arr1[3].setSalary(30000);		
		arr1[4].setSalary(20000);		
		arr1[5].setSalary(25000);		
		arr1[6].setSalary(40000);
		for(int i=0;i<arr1.length;i++){			
			arr1[i].addToFund();		
		}		
		PartTimeEmployee arr2[] = new PartTimeEmployee[2];
		arr2[0] = new PartTimeEmployee(68542,"Saman",56,'M',"Temporary Clerk","0215698542",300);		
		arr2[1] = new PartTimeEmployee(79546,"Nimal",57,'M',"Temporary Labourer","081684952",150);
		arr2[0].setHours(160);		
		arr2[1].setHours(172);
		for(int i=0;i<arr2.length;i++){			
			arr2[i].computeSalary();		
		}		
		Employee employee[] = new Employee[9];				
			for(int i=0; i<7;i++){			
				employee[i]=arr1[i];		
			}		
			for(int i=7;i<employee.length;i++){			
				employee[i]=arr2[i-7];		
			}		
			for(int i=0;i<9;i++){			
				employee[i].computeTax(0.03);		
			}		
			for(int i=0;i<9;i++){			
				employee[i].getNetSalary();		
			}		
			Employee x = new Employee();		
			display(employee);		
			x.getAverageSalary(employee);	
			}	
			public static void display(Person array[]){		
			for(int i=0;i<array.length;i++){			
				array[i].display();		
			}		
			System.out.println();	
			}
}
