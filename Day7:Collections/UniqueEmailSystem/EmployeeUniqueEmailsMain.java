package Day7Excercise;

import java.util.HashSet;

public class EmployeeUniqueEmailsMain {
	
	public static void main(String[] args)
	{
		HashSet<EmployeeEmails> emails=new HashSet<EmployeeEmails>();
		
		EmployeeEmails email1=new EmployeeEmails(27,"mamathas@gmail.com");
		EmployeeEmails email2=new EmployeeEmails(37,"monishak@gmail.com");
		EmployeeEmails email3=new EmployeeEmails(36,"monikaj@gmail.com");
		EmployeeEmails email4=new EmployeeEmails(25,"madhushree@gmail.com");
		EmployeeEmails email5=new EmployeeEmails(27,"mamathas@gmail.com");
		
		emails.add(email1);
		emails.add(email2);
		emails.add(email3);
		emails.add(email4);
		emails.add(email5);
		
		for(EmployeeEmails eMail:emails)
		{
			System.out.println(eMail);
		}
	}

}
