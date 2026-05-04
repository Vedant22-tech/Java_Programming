import java.util.Scanner;

class ArrayIndexException
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = {11,21,51,101,111};

        System.out.println("enter the index of array : ");
        int Index = sobj.nextInt();

        try
        {
            System.out.println("Inside try block");
            System.out.println("Element at that index :"+Arr[Index]);
        }
        catch(ArrayIndexOutOfBoundsException aobj)
        {
            System.out.println("Exception occured :"+aobj);
        }

        System.out.println("End of application");
    }
}
