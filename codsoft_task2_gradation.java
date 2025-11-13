import java.util.*;
public class codsoft_task2_gradation 
{
    static void gradation(int marks[])
    {
       int n=marks.length;
       int sum=0,avg=0;
       for(int i=0;i<n;i++)
       {
        sum+=marks[i];
       }
       avg=sum/n;
       System.out.println("The total sum is :"+sum);
       System.out.println("The average percentage is: "+avg);
       if(avg>=90)
       System.out.println("Grade A");
       else if(avg<90 && avg>=80)
       System.out.println("Grade B");
       else if(avg<80 && avg>=70)
       System.out.println("Grade C");
       else if(avg<70 && avg>=55)
       System.out.println("Grade D");
       else if(avg<55 && avg>=45)
       System.out.println("Grade E");
       else
       System.out.println("Failed");
    }
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of subjects:");
    int n=sc.nextInt();
    System.out.println("Enter the marks(out of 100) in each subject");
    int marks[]=new int[n];
    for(int i=0;i<n;i++)
    {
        marks[i]=sc.nextInt();
    }
    gradation(marks);
    sc.close();
}
    
}
