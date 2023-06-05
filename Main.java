import java.util.*;
import java.util.Arrays;
public class Main {
public static void main(String[] args) 
{
  Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
System.out.print("Enter a string: ");  
String str= sc.nextLine(); 
  //String str="i am gaurav";
char[] arr=str.toCharArray();
  //System.out.println(arr.length);
  //String str2="";
  for(int i=arr.length-1;i>=0;i--)
    { //System.out.println(i);
      System.out.print(arr[i]);
      //str2=str2+arr[i];
    }
  //System.out.println(arr[0]);
//System.out.println(arr[1]);
//System.out.println(str2);
  
  
  
  
 }
}