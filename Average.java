public class Average {
    
    public static void average(int[] nums){

        double sum = 0;
        double [] differences = new double[nums.length];

        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
        }
        
        double average = sum/nums.length;

        for(int i = 0; i < nums.length; i++){
            differences[i] = average - nums[i];
        }

        System.out.println("Average: " + average);
        System.out.print("Differences: [");

        for(double element : differences){
            System.out.print(element + ", ");
        }

        System.out.println("]");
    } 
}