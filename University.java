
public class University {
	String id,name,address,gender,DOB;
	University(String id, String name, String address,String gender,String DOB){
		this.name=name;
		this.id=id;
		this.address=address;
		this.gender=gender;
		this.DOB=DOB;
	}
void display() {
	System.out.println("Name:  "+name);
	System.out.println("id:  "+id);
	System.out.println("Address:  "+address);
	System.out.println("Gender:  "+gender);
	System.out.println("DOB:  "+DOB);
}

}
class Employee extends University{
	String DH; double salary;

	Employee(String id, String name, String address, String gender, String DOB,String DH, Double salary) {
		super(id, name, address, gender, DOB);
		// TODO Auto-generated constructor stub
		this.DH=DH;
		this.salary=salary;
	}
	void display() {
		super.display();
		System.out.println("DH:  "+DH);
		System.out.println("salary:  "+salary);

	}
	
}
class Student extends University{
	String Deptartemnt;

	Student(String id, String name, String address, String gender, String DOB,String Departemnt) {
		super(id, name, address, gender, DOB);
		// TODO Auto-generated constructor stub
		this.Deptartemnt=Departemnt;
	}
	void display() {
		super.display();
		System.out.println("Deptartemnt:  "+Deptartemnt);
		

	}
	
}
class ALUMNUS extends University{
String Dep;
	ALUMNUS(String id, String name, String address, String gender, String DOB,String Dep) {
		super(id, name, address, gender, DOB);
		// TODO Auto-generated constructor stub
		this.Dep=Dep;
	}
	void display() {
		super.display();
		System.out.println("Dep:  "+Dep);
		

	}
	
}
