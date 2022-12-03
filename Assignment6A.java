import java.util.Scanner;

public class Assignment6A
{    public static void create_random_array (int[] array, int array_size)
    {
        for(int a=0;a<array_size;a++)
            array[a]= (int) (Math.random()*1000 - 500);
    }
    public static boolean is_array_sorted (int[] array, int array_size)
    {
        for(int a=0;a<array_size-1;a++)
            if(array[a]>array[a+1])
                return false;
        return  true;
    }
    public static  void sort_array (int[] array, int array_size)
    {
        int i, j, min_idx;
        for (i = 0; i < array_size-1; i++)
        {
            min_idx = i;
            for (j = i+1; j < array_size; j++)
                if (array[j] < array[min_idx])
                    min_idx = j;
            if(min_idx!=i)
            {
                int temp=array[min_idx];
                array[min_idx]=array[i];
                array[i]=temp;
            }
        }
    }
    public static void printArray(int arr[],int size)
    {
        for(int a=0;a<size;a++)
            System.out.print(arr[a]+" ");
        System.out.println();
    }
    public static void main(String[] args)
    {
        int size=10;
        int arr[]=new int[size];
        create_random_array(arr,size);
        System.out.println("[Is It Sorted?]");
        System.out.print("Random Array: ");
        for(int a=0;a<size;a++)
            System.out.print(arr[a]+" ");
        System.out.println();
        while(true) {
            Scanner scan=new Scanner(System.in);
            System.out.println("\nWhat do you want to do?");
            System.out.println("1) Generate a new random array");
            System.out.println("2) Is the array sorted?");
            System.out.println("3) Sort the array");
            System.out.println("4) Quit");
            System.out.print("\nChoice: ");
            int choice=scan.nextInt();
            if (choice == 1)
            {
                create_random_array(arr, size);
                System.out.print("Random array is: ");
                printArray(arr,size);
            }
            else if (choice == 2)
            {
                if(is_array_sorted(arr,size))
                    System.out.println("\nArray is sorted");
                else
                    System.out.println("\nArray is not sorted");
            }
            else if (choice == 3)
            {
                sort_array(arr,size);
                System.out.print("Sorted array is: ");
                printArray(arr,size);
            }
            else if (choice == 4)
                break;
            else
                System.out.println("wrong choice");
        }

    }
}
