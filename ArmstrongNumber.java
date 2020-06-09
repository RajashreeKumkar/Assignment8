package TaskEight;

public class ArmstrongNumber {

	public static boolean isArmstrong(int num) {
		int n = 0; 
        while (num != 0) 
        { 
            n++; 
            num = num/10; 
        } 
        int temp=num, sum=0; 
        while (temp!=0) 
        { 
            int r = temp%10; 
            sum = (int) (sum + Math.pow(r,n)); 
            temp = temp/10; 
        } 
        
		return sum==num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ArmstrongNumber.isArmstrong(153));
		
	}

}
