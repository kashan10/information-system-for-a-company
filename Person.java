public class Person{
	private int id;	
	private String name;	
	private int age;	
	private char gender;	
	private double averageage;

	public Person(){}
	public Person(int id, String name, int age, char gender){
		this.id=id;		
		this.name=name;		
		this.age=age;		
		this.gender=gender;	
	}


	public void setId(int id){		
		this.id=id;	
	}

	public int getId(){		
		return id;	
	}

	public void setName(String name){		
		this.name=name;	
	}	
	public String getName(){		
		return name;		
	}	
	public void setAge(int age){		
		this.age=age;	
	}	
	public int getAge(){		
		return age;	
	}	
	public void setGender(char gender){		
		this.gender=gender;	
	}	
	public char getGender(){		
		return gender;	
	}	
	public void display(){		
		System.out.println(id);		
		System.out.println(name);		
		System.out.println(age);		
		System.out.println(gender);	
	}		
	public void getAverageAge(Person array[]){	
	}
}
