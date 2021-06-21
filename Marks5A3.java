import java.util.*;  
class Marks5A3  
{  
public static void main(String[] args)  
{  
Scanner sc= new Scanner(System.in);    
System.out.print("Enter first number- ");  
double a= sc.nextDouble();  
System.out.print("Enter second number- ");  
double b= sc.nextDouble();  
System.out.print("Enter third number- ");  
double c= sc.nextDouble();  
double sum=a+b+c; 
double average=sum/3;
System.out.println("sum= " +sum); 
System.out.println("Average= "+average); 
}  
}