package Day2;

public class PairSum {
	public static void main(String[] args) {
		int[] arr = {2, 4, 3, 5, 7, 8, 9};
	    int givenNum = 10;

	    System.out.println("Pairs with sum " + givenNum + ":");

	    for (int i = 0; i < arr.length; i++) {
	    	for (int j = i + 1; j < arr.length; j++) {
	    		if (arr[i] + arr[j] == givenNum) {
	    			System.out.println(arr[i] + " + " + arr[j] + " = " + givenNum);
	                }
	            }
	        }
	    }
	}
