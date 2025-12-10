package Mamatha;

public class PersonalInfo {
	String name="Harshi";
	int age=23;
	float percentage=94.41f;
	
	void getStudent(String Name,int Age,float Percentage)
	{
		boolean IsStudent;
		if(name==Name)
		{
			IsStudent=true;
			System.out.println(IsStudent);
			System.out.println(Name+","+age+","+percentage);
		}
		else {
			IsStudent=false;
			System.out.println("Student is not present");
		}
		
	}
	public static void main(String[] args) {
		PersonalInfo personalinfo=new PersonalInfo();
		personalinfo.getStudent("Harshi",23,94.41f);
		PersonalInfo personalinfo1=new PersonalInfo();
		personalinfo1.getStudent("Monii",23,94.41f);
	}

}
