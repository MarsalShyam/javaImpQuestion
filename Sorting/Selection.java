//Insertion Sort
class Selection{
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
    // System.err.println("    ");
    int arr[]={32,3,2,6,7,3,39};
    for(int i=0;i<arr.length;i++){
        int smallest=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[smallest]>arr[j]){
                smallest=j;
            }
        }
        int temp=arr[smallest];
        arr[smallest]=arr[i];
        arr[i]=temp;
    }
    printArr(arr);
    }
}