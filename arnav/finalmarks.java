import CIE.*;
import SEE.*;
import java.util.*;
class finalmarks{
 
public static void main(String args[])
{

 int i,j,n;
 int semester,USN;
 String name;
 Scanner s = new Scanner(System.in);
 int total[] = new int[5];
 System.out.println("\n ENTER THE NUMBER OF THE STUDENTS");
  n = s.nextInt();
 CIE.student st[] = new CIE.student[n];
 CIE.internal cie[] = new CIE.internal[n];
 SEE.external see[] = new SEE.external[n];
 for( i=0; i<n;i++)
{
   System.out.println("\n ENTER THE STUDENT DETAILS:");
   st[i] = new CIE.student();
   System.out.println("\n enter student name :");
   name = s.next();
   USN = s.nextInt();
   semester = s.nextInt();
   st[i] = new student(USN, semester, name);
   cie[i] = new CIE.internal();
    cie[i].accept_internal_marks();
    see[i] = new SEE.external();
    see[i].accept_see_marks();
 }
for( j =0;j<n;j++)
{ 
 System.out.println(" DETAILS OF THE STUDENT IS :");
 see[j].display();
 cie[j].display();

 for(i=0;i<5;i++)
{
  total[i] = cie[i].cie_marks_arr[j]+see[i].see_marks_arr[j];
  System.out.println(" TOTAL MARKS IN THE SUBJECT"+(j+1)+":"+ total[j]);
}
}
}
}
