class thiskeyword
{
  public static void main(String[] args) 
  {
    exp obj1=new exp("Abhishek",100);
    System.out.println(obj1.name);
    System.out.println(obj1.sal);
    exp obj2=new exp("srijana",1000);
    System.out.println(obj2.name);
    System.out.println(obj2.sal);

  }
}
class exp{
  int sal;
  String name;
  exp(String name, int sal)
  {
    this.name=name;//to differentiate instance variable and paramaters
    this.sal=sal;
  }
}