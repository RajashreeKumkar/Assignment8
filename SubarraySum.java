package TaskEight;

public class SubarraySum {
public static int subarraySum(int[] nums, int k) {
        
        int count=0;
            for(int i=0;i<nums.length;i++){
                int sum=0;
                for(int j=i;j<nums.length;j++){
                    sum+=nums[j];
                    if(sum==k){
                        count++;
                    }
                }
            }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 }; 
	        int n = arr.length; 
	        int sum = 15; 
	        System.out.println(subarraySum(arr,  sum)); 
	}

}
