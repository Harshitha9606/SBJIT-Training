package Day7Excercise;

import java.util.LinkedHashSet;

public class AttendanceStudentMain {

	public static void main(String[] args) {
		
		LinkedHashSet<AttendanceStudent> names=new LinkedHashSet<AttendanceStudent>();
		
		AttendanceStudent name1=new AttendanceStudent("Mamatha.S");
		AttendanceStudent name2=new AttendanceStudent("Monisha.K");
		AttendanceStudent name3=new AttendanceStudent("Rajesh.S");
		AttendanceStudent name4=new AttendanceStudent("Savitha");
		AttendanceStudent name5=new AttendanceStudent("Ankush");
		AttendanceStudent name6=new AttendanceStudent("Shubhiksha");
		AttendanceStudent name7=new AttendanceStudent("Saanvi");
		AttendanceStudent name8=new AttendanceStudent("Shubhiksha");

		
		names.add(name1);
		names.add(name3);
		names.add(name6);
		names.add(name4);
		names.add(name5);
		names.add(name2);
		names.add(name7);
		names.add(name8);
		
		for(AttendanceStudent name:names) {
			System.out.println(name);
		}
		
	}

}
