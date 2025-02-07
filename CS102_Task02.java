import java.util.Random;
import java.util.Scanner;

public class CS102_Task02{
    public Random random = new Random();
    public Scanner scanner = new Scanner(System.in);
    public final int LOWER_BOUNDRY = 0;
    public final int UPPER_BOUNDRY = 100;

    // this method creates an array with given size which consists of random numbers up to 100
    public int[] createAnArray(int size)
    {
        
        int [] newArray = new int[size];
        for(int i = 0; i< size; i++)
        {
            newArray[i] = random.nextInt(UPPER_BOUNDRY-LOWER_BOUNDRY+1) + LOWER_BOUNDRY;
        }
        return newArray;
    }

   /* public void displayMenu()
    {
        int choice;
       if (scanner.hasNextInt()) 
       {
            do{
                choice = scanner.nextInt();
                

            }while(choice!=4);
            
       }
    } */

    public void findSums(){
        int countOdd=0;
        int countEven=0;
        for(int i=0;i<array;i+=2){
            countEven+=array[i];
        }
        for(int i=1;i<array;i+=2){
            countOdd+=array[i];
        }
        System.out.println(countEven);
        System.out.println(countOdd);

    }
    
    
    public static void main(String[] args) {
        
    }
}