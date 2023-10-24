import java.util.*;
class Student{
      String first_name = " ";
      String middle_name = " ";
      String last_name = " ";
      String name_suffix = " ";
      int student_age = 19;
   
   public Student(){
   
   }
   public String getFirstName(){
      return first_name;
   }
   public String getMiddleName(){
      return middle_name;
   }
   public String getLastName(){
      return last_name;
   }
   public String getSuffix(){
      return name_suffix;
   }
   public int getAge(){
      return student_age;
   }
   
   
   public void setFirstName(String fName){
      first_name = fName;
   }
   public void setMiddleName(String mName){
      middle_name = mName;
   }
   public void setLastName(String lName){
      last_name = lName;
   }
   public void setSuffix(String nSuffix){
      name_suffix = nSuffix;
   }
   public void setAge(int age){
      student_age = age;
   }
   
   public String getFullName(){
      return getFirstName() + " " + getMiddleName() + " " + getLastName() + " " + getSuffix();
    }
   public static void main (String args[]){
      Scanner sc = new Scanner(System.in);
      Student s1 = new Student();
      System.out.println("Enter your first name: ");
      s1.setFirstName(sc.nextLine());
      
      System.out.println("Enter your middle name: ");
      s1.setMiddleName(sc.nextLine());
      
      System.out.println("Enter your last name: ");
      s1.setLastName(sc.nextLine());
      
      System.out.println("Enter your suffix: ");
      s1.setSuffix(sc.nextLine());
      
      System.out.println("Student First Name: " + s1.getFirstName());
      System.out.println("Student Middle Name: " + s1.getMiddleName());
      System.out.println("Student Last Name: " + s1.getLastName());
      System.out.println("Student Suffix: " + s1.getSuffix());
      System.out.println("Student Full Name: " + s1.getFullName());

   }
}
