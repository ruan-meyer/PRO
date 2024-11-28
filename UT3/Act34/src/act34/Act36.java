package act34;

public class Act36 {
    public static void main(String[] args){
        int[] array = {1,54,7,3,0,5,2,15};
        int[] arraySorted = bubbleSort(array);
        for(int i = 0; i < arraySorted.length; i++){
            System.out.print(arraySorted[i] + " ");
        }
    }
    public static int[] bubbleSort(int[] array){
        boolean done = false;
        while(!done) {
            done = true;
            for(int i = 0; i < array.length - 1; i++){
                if(array[i] > array[i+1]){
                    int swap = array[i];
                    array[i] = array[i+1];
                    array[i+1] = swap;
                    done = false;
                }
            }
        }
        return array;
    }
}

