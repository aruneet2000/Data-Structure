import java.util.*;

public class MinJumps {
	static void minjumps(int arr[], int n) {
		int jumps[] = new int[n];
		int i,j;
		jumps[0] = 0;
		for(i=1;i<n;i++) {
			jumps[i] = Integer.MAX_VALUE;
			for(j=0;j<i;j++) {
				if(i<=j+ arr[j] && jumps[j] != Integer.MAX_VALUE) {
					jumps[i] = Math.min(jumps[i], jumps[j]+1);
					break;
				}
			}
		}
		 if(arr[0]==0 || jumps[n-1] == Integer.MAX_VALUE ) 
			    System.out.println("-1");
			    
			    else System.out.println(jumps[n-1]);
	}

	public static void main(String[] args) {
		int arr[] = {1, 4, 3, 2, 6, 7}; 
		  
       minjumps(arr,arr.length);
	}

}
