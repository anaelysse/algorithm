public class main{
    public static void main(String[] args) {
        student_entry[] saver;
        saver = file_handler.read_file("students.txt"); // reads the txt file
        
        System.out.println("This is the unsorted list: ");
        // before sorting, print students
        for (student_entry unsorted_student: saver){
            System.out.println(unsorted_student.toString());
        }
        
        sorter.BinaryInsertionSort(saver);
        
        System.out.println("This is the sorted list: ");
        // after sorting, print students
        for (student_entry sorted_student: saver){
            System.out.println(sorted_student.toString());
        }
        file_handler.write_file(saver, "./sorted_file.txt");
    }

}