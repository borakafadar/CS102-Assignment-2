import java.util.Scanner;

public class Menu {

    CS102_Task02 cs =new CS102_Task02();

    public void displayMenu(){
        boolean cont=true;
        Scanner sc= new Scanner(System.in);
        do
        {
            System.out.println("Welcome! Please select an action: ");
            System.out.println("1-Create the array");
            System.out.println("2-Find the minimum and the maximum of array");
            System.out.println("3-Find the average and the differences of the array");
            System.out.println("4-Find the sum of the odd and even numbered elements");
            System.out.println("5-Exit the program");

            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter the size of the array: ");
                    int size=sc.nextInt();
                    cs.currentArray=cs.createAnArray(size);
                    System.out.print("Array { ");
                    for(int i:cs.currentArray){
                        System.out.print(i+", ");
                    }
                    System.out.println("} has been created");
                    break;
                case 2:
                    int min=MinimumMaximum.findMinimum(cs.currentArray);
                    System.out.println("The minimum element of the array is "+min);
                    int max=MinimumMaximum.findMaximum(cs.currentArray);
                    System.out.println("The maximum element of the array is "+max); 
                    break;
                case 3:
                    Average.average(cs.currentArray);
                    break;
                case 4:
                    cs.findSums(cs.currentArray);
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    cont=false;
                    break;
                default:
                    System.out.println("Please enter a valid number!");
            }
        }while(cont);
        sc.close();
    }

    

    
}
