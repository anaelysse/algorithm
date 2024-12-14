import java.io.*;
import java.util.Scanner;
public class file_handler {
    public static student_entry[] read_file(String filepath){ // read from file
        student_entry[] return_array = new student_entry[20]; // storing student entries
        try {
            File myObj = new File(filepath); // object to use file path
            Scanner myReader = new Scanner(myObj); // scanner to read our file path
            
            for (int i=0; i<20; i++){
                String student_information_string = myReader.nextLine();
                student_entry student_info = new student_entry(student_information_string); // creates student entry object
                return_array[i] = student_info;
            }
           
            myReader.close();
            } 
        
        catch (FileNotFoundException exception) { // handles case file not found
            System.out.println("error");
            exception.printStackTrace();
        }
        return return_array;

    }

    public static void write_file(student_entry[] array_in, String filepath){ // creates file writer
        try {
            FileWriter myWriter = new FileWriter(filepath);
            for (student_entry student: array_in){
                myWriter.write(student.toString() + "\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
          } 

        catch (IOException exception) {
            System.out.println("An error occurred.");
            exception.printStackTrace();
          }
      
    }

}