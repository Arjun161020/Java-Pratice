public class Main
{
    public static void main(String[] args) {
        System.out.println("Linear seaching");
        // Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value you want to search : ");
        int key = 40;
        int[] number = {10,20,30,40,50,60,70,80};
        int result = linearSearch(number,key);
        if(result != -1){
            System.out.println("Element Present in the array : " + result);
        }else {
            System.out.println("Element is not Present in array");
        }
        reverse(number);
    }
    
    //linearSearch
    public static int linearSearch(int[] array , int key) {
        for (int i =0 ; i < array.length ; i++ ) {
            if(array[i] ==  key){
                return 1;
            }
        }
        return -1;
    }
    
    //Reverse the Array
    public static void reverse(int[] array){
        int start = 0;
        int end =  array.length - 1;
        
        while(start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            
            start ++;
            end --;
        }
        
        System.out.print("Reverse an array: ");
        for (int i =0 ; i < array.length ; i++ ) {
            System.out.print( array[i] + " " );
        }
    }
}
