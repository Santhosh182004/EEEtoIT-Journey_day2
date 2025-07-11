import java.util.*;
class Student{
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        ev_od(arr,n);
    }
    public static  void ev_od(int arr[], int k){
        System.out.println("Even: ");
        for(int j=0;j<k;j++){
        if(arr[j]%2==0){
        System.out.print(arr[j]+" ");
        }} System.out.println();
        System.out.println("Odd: ");
        for(int l=0;l<k;l++){
        if(arr[l]%2!=0){
            System.out.print(arr[l]+" ");
        }}
    }
}
