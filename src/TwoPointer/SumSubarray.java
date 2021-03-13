package TwoPointer;

public class SumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1, 1000000000};
		subArraySum(arr,4,4);
		

	}
	public static int[] subArraySum(int A[], int n, int B) 
    { 
		int currSum=A[0];
        int start=0;int starting=0;int ending=0;
       // ArrayList<Integer> tmp = new ArrayList(); 
        for(int i=1; i<=A.length; i++)
        {
        	while(currSum>B && start<i-1)
            {
                currSum=currSum-A[start];//to remove values before it starting from the start. Also increement start so as to not to again remove
                start++;
            }
            if(currSum==B)
            {
                 starting=start;
                 ending = i - 1; //as here currSum contains just previous value
                 break;
                
            }
            if(i<A.length)
            {
                currSum = currSum+A[i];
            }
            
        }
        int len=ending-starting;
        if(len>0){
        int tmp[]= new int[len+1];
        int k=0;
        for(int j=starting; j<=ending ; j++)
        {
            tmp[k]=A[j];
            k++;
        }
        return tmp;
        }
        else{
            int tmp[]= new int[1];
            tmp[0]=-1;
            return tmp;
        }
    }

}
