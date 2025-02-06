public class CS102_Task02 {
    
    //the method below finds the minimum element of an array
    public static int findMinimum (int[] array){ 
        int minimum = array[0]; //assuming that the first element of the array is the smallest for comparison
        for(int i = 1; i < array.length; i++){
            if (array[i] < minimum){
                minimum = array[i];
            }
        }
        return minimum;
    }

    //the method below finds the maximum element of an array
    public static int findMaximum (int[] array){ 
        int maximum = array[0]; //assuming that the first element of the array is the largest for comparison
        for(int i = 1; i < array.length; i++){
            if (array[i] > maximum){
                maximum = array[i];
            }
        }
        return maximum;
    }  
}
