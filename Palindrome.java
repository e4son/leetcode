import java.lang.*;
public class Palindrome {
    public static void main(String[] args) {
         int x = 999;
         boolean ans = isPalindrome(x);
         System.out.printf("%b\n",ans);         
         


    }
    public static boolean isPalindrome( int x) {
    	if(x<0)return false;
    	//判斷x幾位數
    	int count = 0;
    	int x2 = x;
    	while(x2>0){
    		x2=x2/10;count++;
    	}
    	int comparecount = count/2;
    	for(int i=0;i<comparecount;i++){
    		double left = x/Math.pow(10,count-(i+1));  
    		int left2 = (int)left%10;
    		//left
    		double right = x%Math.pow(10,(i+1));  
    		int right2 =  (int)(right /Math.pow(10,i) );
    		//right
    		if(right2!=left2)
    		{
    			return false;}
    	}
    	return true;
    }

}
 
