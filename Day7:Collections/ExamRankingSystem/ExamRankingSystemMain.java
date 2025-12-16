package Day7Excercise;

import java.util.TreeSet;

public class ExamRankingSystemMain {
	
	public static void main(String[] args)
	{
		TreeSet<ExamRankingSystem> ranks=new TreeSet<ExamRankingSystem>();
		
		ExamRankingSystem student1=new ExamRankingSystem("Harshitha",90);
		ExamRankingSystem student2=new ExamRankingSystem("Rajesh",95);
		ExamRankingSystem student3=new ExamRankingSystem("Kumar",40);
		ExamRankingSystem student4=new ExamRankingSystem("Shivaraj",67);
		ExamRankingSystem student5=new ExamRankingSystem("Darshan",39);
		ExamRankingSystem student6=new ExamRankingSystem("Akash",34);
		
		ranks.add(student1);
		ranks.add(student2);
		ranks.add(student3);
		ranks.add(student4);
		ranks.add(student5);
		ranks.add(student6);

	    int rank = 1;
	    
	    System.out.println("Exam Ranking List");
		System.out.println("-------------------------");
		
		for (ExamRankingSystem student : ranks)
		{
			System.out.println(getRankSuffix(rank) + " Rank : " + student);
		    rank++;
		}
	}
	
	private static String getRankSuffix(int rank)
	{
		if (rank % 100 >= 11 && rank % 100 <= 13) 
		{
		            return rank + "th";
		}
		switch (rank % 10)
		{
		case 1: return rank + "st";
		case 2: return rank + "nd";
		case 3: return rank + "rd";
	    default: return rank + "th";
		        }
		    }
		}
	