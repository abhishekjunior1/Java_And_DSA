
// package java.oops.introduction;
public class intro0 {

  public static class student{
    int rollno;
    String name;
    double percent;
  }
   public static void fun(student y)//similar to int a but our data type is student
  {
    System.out.println(y.name);
    y.name="srijan";
  }
  public static void main(String[] args) {
    student x = new student();//aak student x similar to int a;
    x.rollno=10;            //assigning value to it a=10;
    x.name="Abhishek";
    x.percent=22.4;
    System.out.println(x.rollno + " "+x.name);
     fun(x);
     System.out.println(x.name);

  }
}
