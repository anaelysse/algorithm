public class student_entry implements Comparable<student_entry>{
   public int studentID;
   public String name;
   public int age;
   public float GPA;


   public student_entry(int studentID, String name, int age, float GPA){
      this.studentID = studentID;
      this.name = name;
      this.age = age;
      this.GPA = GPA;
   }
   
   public student_entry(String string_in){
      String[] myData = string_in.split(",");
   
      this.studentID = Integer.parseInt(myData[0]);
      this.name = myData[1];
      this.age = Integer.parseInt(myData[2]);
      this.GPA = Float.parseFloat(myData[3]);
   }

   public String toString(){
      return "StudentID:" + this.studentID + ", Name:" + this.name + ", Age:" + this.age + ", GPA:" + this.GPA;
   }

   @Override
   public int compareTo(student_entry s) {
      return Integer.compare(this.studentID, s.studentID); 
   }
}

