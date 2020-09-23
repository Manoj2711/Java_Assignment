class Person{
	private int age;
	private String name;
	
	Person(){
		
		age=18;
	}
	
	Person(String name){
		this();
		this.name=name;
	}
	
	void show(){
		System.out.println("name= "+name+" "+"age= "+age);
	}
}

class Demo{
	
	public static void main(String args[]){
		Person p=new Person("Manoj");
		p.show();
		Person p1=new Person("Mehul");
		p1.show();
	}
}