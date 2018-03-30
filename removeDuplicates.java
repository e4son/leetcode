import java.lang.*;
import java.util.Arrays;
import java.util.*;
public class removeDuplicates {
    public static void main(String[] args) {
    	 int[] nums = {0,1,2,2,2,2,3,3,3,5,5,5,6,6,7,7,7,9};//sorted array
        // boolean ans = removeDuplicates(x);//判斷迴文 123321 
         //System.out.printf("%b\n",ans);       
         System.out.printf("%d\n",removeDuplicates(nums));     
         


    }
    public static int removeDuplicates(int[] nums) {
       if(nums.length==0)return 0;
       int ans = 0 ;
       for (int i=0;i<nums.length-1;i++){
       int j = i+1;
       		if(nums[i]!=nums[j]){
       			ans++;
       		}
       	}
       return ans+1;
    }

}
 
