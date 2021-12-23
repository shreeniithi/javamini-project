import java.util.*;
public class Marksheet
{
public static void main(String args[])
{  
int ios,fds,java,dm,daa,sum,roll;
String name;
double div;
Scanner in=new Scanner(System.in);
System.out.println(" ENTER YOUR NAME==>");
name=in.nextLine();
System.out.println(" ENTER YOUR ROLL_NUMBER==>");
roll=in.nextInt();
System.out.println(" ENTER YOUR IOS_MARK==>");
ios=in.nextInt();
System.out.println(" ENTER YOUR FDS_MARK==>");
fds=in.nextInt();
System.out.println(" ENTER YOUR JAVA_MARK==>");
java=in.nextInt();
System.out.println(" ENTER YOUR DM_MARK==>");
dm=in.nextInt();
System.out.println(" ENTER YOUR DAA_MARK==>");
daa=in.nextInt();
sum=ios+fds+java+dm+daa;
div=sum/5;
System.out.println("......................................................");
System.out.println("Subject"+"                          Marks");
System.out.println("......................................................");
System.out.println("IOS"+"                               "+ios);
System.out.println("FDS"+"                              "+fds);
System.out.println("JAVA"+"                             "+java);
System.out.println("DM"+"                               "+dm);
System.out.println("DAA"+"                             "+daa);
System.out.println("......................................................");
System.out.println("PERCENTANGE"+"            "+div);
  

}}
