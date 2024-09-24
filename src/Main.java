public class Main {
    public static void main(String[] args) {

        // example
        int a[] = {0,2,3,4,6,7,8};
        int index = binarySearch(4,a);
        System.out.println(index);
    }


    public static int binarySearch(int key,int[] a) {

        int lo = 0;
        int hi = a.length - 1;

        while(lo <= hi){

            int mid = (lo+hi)/2;

            if(a[mid] == key){
                return mid;
            }else if (a[mid] > key){
                hi = mid - 1;
            }else if (a[mid] < key){
                lo = mid + 1;
            }
        }
        return -1;
    }
}