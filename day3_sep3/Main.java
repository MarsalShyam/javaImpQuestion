class Main{
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);

        // //Print the even number between the a and b
        // System.err.print("Enter start number: ");
        // int a=sc.nextInt();
        // System.err.print("Enter last number: ");
        // int b=sc.nextInt();
        // int count=0;
        // for(int i=a+1;i<b;i++){
        //     if((i%2)==0){
        //         System.out.print(i+" ");
        //         count+=1;
        //     }
        // }
        // System.err.println("");
        // System.err.println("The Number of even number between is "+count);
        // System.err.println("printing the number that is divisble by 5 but not with 10");
        // for(int i=a+1;i<b;i++){
        //     if((i%5)==0&&(i%10)!=0){
        //         System.out.print(i+" ");
                
        //     }
        // }
        // System.err.println("");
        // // System.err.println("The  "+count);
        
        // //print the alphabet using ascii value for both capital or small
        // int val=65;
        // for(int i=0;i<26;i++){
        //     char letter=(char)val;
        //     System.out.print(letter+" ");
        //     val++;
        // }
        // System.out.println();
        // int val2=97;
        // for(int i=0;i<26;i++){
        //     char letter=(char)val2;
        //     System.out.print(letter+" ");
        //     val2++;
        // }

        //print the all occurance of letter in the word "hello"
        String str="Hello Praphu";
        String result="";
        int letterCount=0;
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    letterCount++;
                }
                result+=str.charAt(i);
                for(int k=0;k<result.length();k++){
                     
                }
                if(j==str.length()-1){
                    System.out.println(str.charAt(i)+" - "+letterCount);
                    letterCount=0;  
                }
                
            }
        }
    }
}