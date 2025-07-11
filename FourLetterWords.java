import java.util.*;
class Student{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String arr[]=str.split(" ");
        int len=arr.length;

        for(int i=0;i<len;i++){
            String k=arr[i];
            if(k.length()==4){
                System.out.println(k);
            }}
    }
}
