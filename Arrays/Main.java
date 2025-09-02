import java.util.Scanner;
class Main{

    public static void reverse(int start,int end,int arr[]){
        // start=0;
        // end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    // public static void reverse2(int arr[]){
    //     int start=0;
    //     int end=arr.length-1;
    //     while(start>end){
    //         int temp=arr[start];
    //         arr[start]=arr[end];
    //         arr[end]=temp;
    //         start++;
    //         end--;
    //     }
    // }

    public static void main(String[] args) {
        Scanner ram=new Scanner(System.in);

        //1. Find the Second largest element in an array. Hint:Track Two max Values
        int arr[]={2,3,4,1,4,8,28,25};
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            }
            if(arr[i]<max && arr[i]>secondMax){
                secondMax=arr[i];
            }
        }
        System.out.println("The largest number in the array is "+max);
        System.out.println("The secondLargest number in the array is "+secondMax);

        //2. Find the missing number in an array of 1 to N. Hint:Use sum formula
        //sum of n natual number is = n(n+1)/2
        int arr1[]={1,2,3,4,5,7,8};
        int n=arr1[arr1.length-1];
        int sum1=n*(n+1)/2;
        int sum2=0;
        for(int i=0;i<arr1.length;i++){
            sum2+=arr1[i];
        }
        int missingNumber=sum1-sum2;
        System.out.println("The missing number is "+missingNumber);

        //3. Find duplicate element in an array. Hint: use nested loops or boolean tracking
        int arr2[]={1,2,4,1,4,8,28,3,28};
        for(int i=0;i<arr2.length;i++){
            for(int j=i+1;j<arr2.length;j++){
                if(arr2[i]==arr2[j]){
                    System.err.print(arr2[i]+" ");
                }
            }
        }
        System.out.println();

        //Rotate an array by k positoins. hind: use reversal method or temp arry.
        //rotate from the left 
        int arr3[]={4,2,5,3,66,35,3,44};
        int arr3length=arr3.length;

        int k=3;
        k=k % arr3length;

        reverse(0, arr3length-1, arr3);
        reverse(0, k-1, arr3);
        reverse(k,arr3length-1,arr3);
        // reverse2(arr3);
        for(int i=0;i<arr3length;i++){
            System.out.print(arr3[i]+" ");
            // System.err.println("ram");
        }
        System.err.println("");

        //5. Merge two sorted arrays into one sorted array. HInt: Two pointer tchnique.
        int arrm1[]={24,27,29,32,45};
        int arrm2[]={2,56,79,82,95};
        int arrm1Length=arrm1.length;
        int arrm2Length=arrm2.length;

        int arm3[]=new int[arrm1Length+arrm2Length];
        int a=0,b=0,c=0;

        while(a<arrm1Length && b<arrm2Length){
            if(arrm1[a]<arrm2[b]){
                arm3[c++]=arrm1[a++];
            }else{
                arm3[c++]=arrm2[b++];
            }
        }
        while(a<arrm1Length){
            arm3[c++]=arrm1[a++];
        }
        while(b<arrm2Length){
            arm3[c++]=arrm2[b++];
        }
        for(int i=0;i<arm3.length;i++){
            System.err.print(arm3[i]+" ");
        }

        System.out.println("");
        //6. Find teh pair with a given sum: Hint: Use two-pointer technique

        int arrpair[]={1,4,7,-1,5,2};
        int pairsum=6;
        for(int i=0;i<arrpair.length;i++){
            for(int j=i+1;j<arrpair.length;j++){
                if(arrpair[i]+arrpair[j]==pairsum){
                    System.out.print(arrpair[i]+","+arrpair[j]+" ");
                }
            }
        }
        System.err.println("");
        //7. find the majority element in an array. Hint: Use counting aor boyer-moore algorithm
        // int arrpair[]={1,4,7,-1,5,2};
        int maxElement=Integer.MIN_VALUE;
        for(int i=0;i<arrpair.length;i++){
            if(arrpair[i]>maxElement){
                maxElement=arrpair[i];
            }
        }
        System.err.println("The maximum number is arrpair is "+maxElement);

        //8. Sort an array without using built-in sort. Hint:Use bubble, slection,or insertaion sort

        //9. Find the maximum product of two integers in an array. Hint Track two max & two min numbers
        //it takes O(Ologn);
        int arrpro[]={1,4,7,-1,5,2};
        int arproMax=Integer.MIN_VALUE;
        for(int i=0;i<arrpro.length;i++){
            for(int j=i+1;j<arrpro.length;j++){
                if(arrpro[i]*arrpro[j]>arproMax){
                    arproMax=arrpro[i]*arrpro[j];
                    // System.out.print(arrpair[i]+","+arrpair[j]+" ");
                }
            }
        }
        System.err.println("The maximum product of two intege in an array is "+arproMax);

        System.err.println("");
        
//         public class MaxProduct {
//     public static void main(String[] args) {
//         int arrpro[] = {1, 4, 7, -1, 5, 2};

//         int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
//         int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

//         for (int num : arrpro) {
//             // Track max1 and max2
//             if (num > max1) {
//                 max2 = max1;
//                 max1 = num;
//             } else if (num > max2) {
//                 max2 = num;
//             }

//             // Track min1 and min2
//             if (num < min1) {
//                 min2 = min1;
//                 min1 = num;
//             } else if (num < min2) {
//                 min2 = num;
//             }
//         }

//         int product1 = max1 * max2;
//         int product2 = min1 * min2;
//         int result = Math.max(product1, product2);

//         System.out.println("The maximum product of two integers is " + result);
//     }
// }


//finding the intersection of two arrays. Hind: use hashset or nested loop
        int arrInt1[]={24,27,29,32,45};
        int arrInt2[]={2,56,27,79,32,82,95};
        for(int i=0;i<arrInt1.length;i++){
            for(int j=0;j<arrInt2.length;j++){
                if(arrInt1[i]==arrInt2[j]){
                    System.err.print(arrInt1[i]+" ");
                }
            }
        }
        //for efficiant using {hashset}
    }
}