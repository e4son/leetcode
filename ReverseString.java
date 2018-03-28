

class Solution {
    public int reverse(int x) {
        
        String originalStr = Integer.toString(x);
        String resultStr = "";
        String reversedStr = "";
        if(-2147483648>x||x>2147483647)
        return 0;
        if(x==0)
        return 0;
        if(x<0)
        reversedStr = reverseNegtive( originalStr );
        if(x>0)
        reversedStr = reverse( originalStr );
        long check = 0; 
        check = Long.parseLong(reversedStr);
        if(-2147483648>check||check>2147483647){
	    return 0;}
        else{
        int ans = Integer.valueOf(reversedStr);
        return ans;
        }
        
    }
    
public static String reverse(String originalStr){
String resultStr = "";
for(int i = originalStr.length() - 1 ; i >= 0 ; i--){
resultStr = resultStr + originalStr.charAt(i);}
resultStr = resultStr.replaceFirst("^0+(?!$)", "");
return resultStr; }
    
public static String reverseNegtive(String originalStr){
String resultStr = "";
for(int i = originalStr.length() - 1 ; i > 0 ; i--){
resultStr = resultStr + originalStr.charAt(i);}
resultStr = resultStr.replaceFirst("^0+(?!$)", "");
resultStr = '-'+resultStr;
return resultStr; }
    
    
}

