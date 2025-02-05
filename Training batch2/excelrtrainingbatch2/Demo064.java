public class Demo064{
    public static void main(String[] args) {
      
        int[] array = {10, 20, 30, 40, 50};

       
        if (array.length > 1) {
            
            System.out.println("Original Array:");
            printArray(array);

            
            int temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;

            
            System.out.println("\nArray after swapping first and last elements:");
            printArray(array);
        } else {
            System.out.println("Array needs to have more than one element to swap.");
        }
    }

   
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); 
    }
}