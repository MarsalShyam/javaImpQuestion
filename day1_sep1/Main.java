import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        // System.out.println("Please enter the number: ");

        // int n=sc.nextInt();

        // if(n>18){
        //     System.out.println("You can able to vote");
        // }else{
        //     System.out.println("You can bot able to vote");
        // }

        // if(n%2==0){
        //     System.out.println("Even");
        // }else{
        //     System.out.println("Odd");
        // }

        // System.out.println("Pleae Enter the size of array: ");
        // int size=sc.nextInt();
        // int arr[]=new int[size];
        // for(int i=0;i<arr.length;i++){
        //     System.out.println("Enter the"+i);
        //     arr[i]=sc.nextInt();
        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }

        int arr1[]={5,10,15,17,10};
        int arr2[]={1,13,1,10,17};
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                
                if(arr2[i]==arr1[j]){
                    break;
                }else{
                    if(j==arr1.length-1){
                        System.out.print(arr2[i]+" ");
                    }
                }

                // if(arr2[i]!=arr1[j]){
                //     if(j==arr1.length-1){
                //         System.out.print(arr2[i]+" ");
                //     }
                    
                // }
                
            }
        }
    }
}