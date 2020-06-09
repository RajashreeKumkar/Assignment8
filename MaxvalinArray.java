package TaskEight;

public class MaxvalinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {1,4,2,5,8,2,12,8,10};
		int maxval=0;
		for(int i:arr) {
			maxval=Math.max(maxval, i);
		}
		System.out.println(maxval);
	}

}
