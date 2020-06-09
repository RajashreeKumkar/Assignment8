package TaskOneBasicExercise;

public class Pascaltriangle {

	public static void printPascal(int n) 
	{ 
	int[][] dp = new int[n][n];  
	  
	for (int line = 0; line < n; line++) 
	{ 
	    for (int i = 0; i <= line; i++) 
	    { 
	    if (line == i || i == 0) 
	    	dp[line][i] = 1; 
	    else
	    	dp[line][i] = dp[line-1][i-1] + dp[line-1][i]; 
	    System.out.print(dp[line][i]); 
	    } 
	    System.out.println(""); 
	} 
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pascaltriangle.printPascal(5);
	}

}
