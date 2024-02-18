// package java.oops.introduction;

 public class Student {
   int rollNo = 10;
   String studentName;
  
   public static void main(String[] args) {
     Student obj = new Student();
     obj.studentName = "John Doe"; // Assign a value to studentName
     System.out.println(obj.rollNo);
     System.out.println(obj.studentName);
   }
 }
