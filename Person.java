public class Person{
private int id;
private String name;
private int age;
private char gender;

double avg;

	public Person(id,name,age,gender){
		this.id  = id;
		this.name = name;
		this.age = age;
		this.gender = gender;


	}

	public int getId(){
		return id;
	}
	public String getName() {
    		return name;
  	}
	
	public int getAge(){
		return age;
	}
	public char getGender(){
		return gender;
	}

  	public void setId(int id){
    		this.id = id;
  	}
  	public void setName(String name){
    		this.name = name;
  	}
	public void setAge(int age){
    		this.age = age;
  	}
	public void setGender(char gender){
		this.gender= gender;
	}
	public display (Person p[]){
		
		for(i=0; i < p.length; i++){
			System.out.println(p[i].id);
			System.out.println(p[i].name);
			System.out.println(p[i].age);
			System.out.println(p[i].gender);
		}
	}

	public getAverageAge(Person p[]){
		int total = 0;
		avg = 0;
		
		for(i=0; i < p.length; i++)
			total += p[i].age;

			avg = total/p.length;
		
	}
}
