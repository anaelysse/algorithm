import java.util.Arrays;

public class sorter{
    public static void BinaryInsertionSort(student_entry[] info){
        // Input: any array
        // Output: the sorted array
        int n = info.length; // n is length of the array
        for (int i=1; i<n; i++){
                student_entry key = info[i];    // element to insert
                // Slice from index 0 (inclusive) to index i (exclusive), stops  at i-1
                int insertion_index = BinarySearch(Arrays.copyOfRange(info, 0, i), key); // finds position to insert key
                for (int j=i-1; j>=insertion_index; j--){ // goes backwards 
                    info[j+1] = info[j]; // shifts elements to right 
                }
            info[insertion_index] = key; // inserts key at correct position
        }
    }
    
    public static int BinarySearch(student_entry[] info, student_entry key){
    // Input: a sub array from BinaryInsertionSort and insertion element 
    // Output: Index where to insert key
        int left_index = 0; // start index
        int right_index = info.length-1; // end index
        while (left_index <= right_index){ 
            int mid_point = (left_index + right_index)/2; // finds middle index
            if (info[mid_point].studentID == key.studentID) { // check if key = mid
                return mid_point;
            } 
            else if (info[mid_point].studentID < key.studentID) { // when key > mid, search right half
                left_index = mid_point + 1;
            } 
            else { // when key < mid, search left half
                right_index = mid_point - 1;	
            } 
        }
        return left_index; // when loop breaks we return left
    }
        
}