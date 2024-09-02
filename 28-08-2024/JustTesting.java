public class JustTesting {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        int temp = arr[0];
        arr[0]  =arr[2];
        arr[2] =temp;

        System.out.println(arr[0]+"  " +arr[2]);

        int[] arr1 = arr;
        arr1[1] =  200;
        int[] a = new int[3];
        a = arr;
        a[1] = 900;

        System.out.println(arr1[1]+" -->arr1[1]  arr[1]-----> "+arr[1] +"a[1]---> "+a[1]);
    }
}
