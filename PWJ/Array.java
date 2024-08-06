public class Array {

    int[] data;
    Array(){

        data = new int[10];

    }

    Array(int size){

        int[] array = new int[size];
    }

    Array (int[] data){};

    void Reverse_an_array(int[] array){

        System.out.println("Reverse of array is : ");
        for (int i = array.length - 1; i >=0 ; i--) {
            System.out.print(array[i] + " ");
        }

    }

    int Maximum_of_array(int[] arr){
        sorting(arr);
        return arr[arr.length - 1];
    }

    void sorting(int[] arr){
//        Cyclic sort
        int i = 0;
        while(i < arr.length){

            int start = arr[i] - 1;
            if(arr[i] != arr[start]){
                int temp = arr[i];
                arr[i] = arr[start];
                arr[start] = temp;
            }else{
                i++;
            }

        }
        display(arr);
    }

    void display(int[] arr){
        for(int n : arr){
            System.out.print(n + " ");
        }
    }

    int search(int[] arr,int no){

        sorting(arr);
        int start = 0;
        int last =  arr.length - 1;

        while(start <= last){

            int mid = start + (last - start) /2;
            if(arr[mid] == no){
                return mid;
            }

            if(arr[mid] > no){
                last = mid - 1;
            }else{
                start = mid  + 1;
            }
        }
        return -1;
    }

    int size(int[] arr){

        return arr.length;
    }


}
