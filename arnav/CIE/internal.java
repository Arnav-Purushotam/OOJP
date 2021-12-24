package CIE;

class internal extends student{

int[] cie_marks_arr;

void accept_internal_marks(){

this.cie_marks_arr = new int[6];

Scanner scanx = new Scanner(System.in);
System.out.println("enter COA marks : ");
cie_marks_arr[0] = scanx.nextInt();
System.out.println("enter JAVA marks : ");
cie_marks_arr[1] = scanx.nextInt();
System.out.println("enter DS marks : ");
cie_marks_arr[2] = scanx.nextInt();
System.out.println("enter MP MC marks : ");
cie_marks_arr[3] = scanx.nextInt();
System.out.println("enter LD marks : ");
cie_marks_arr[4] = scanx.nextInt();
System.out.println("enter MATHS marks : ");
cie_marks_arr[5] = scanx.nextInt();

}


void display(){

System.out.println("name of the student : " + this.name);
System.out.println("semester of the student : " + this.semester);
System.out.println("USN of the student : " + this.USN);
System.out.println("MARKS of the student : ");
System.out.println("CIE COA marks of the student : " + this.cie_marks_arr[0]);
System.out.println("CIE JAVA marks of the student : " + this.cie_marks_arr[1]);
System.out.println("CIE DS marks of the student : " + this.cie_marks_arr[2]);
System.out.println("CIE MP MC marks of the student : " + this.cie_marks_arr[3]);
System.out.println("CIE LD marks of the student : " + this.cie_marks_arr[4]);
System.out.println("CIE MATHS marks of the student : " + this.cie_marks_arr[5]);

}




};