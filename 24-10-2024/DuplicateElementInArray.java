import java.util.*;
class DuplicateElementInArray{
    public static void main(String arg[]){
        int a[]={10,20,30,10,80,20,45,30};
       
        System.out.println("original array");
        for(int i=0;i<a.length;i++){
                System.out.print(a[i]+" ");
            }
           System.out.println();
           /*//approach 1:
           System.out.println("duplicate element");

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){

            if(a[i]==a[j]){
                System.out.println(a[j]+" ");
            }
        }

        }*/
        //approach 2 using hashset
        HashSet<Integer> s=new HashSet<>();
        for(int l:a){
            if(s.add(l)==false){
                System.out.println(l);
            }
        }

       
    }
}
    
