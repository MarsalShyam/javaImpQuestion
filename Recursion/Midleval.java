
// import javax.sound.midi.SysexMessage;
import java.util.HashSet;

class Midleval{
    
    //Tower of Hanoi
    public static void TowerOfHanoi(int n,String source,String Helper, String Dest){
        if(n==1){
            System.out.println("Transfer disk "+n+" from "+source+" to "+Dest);
            return;
        }
        TowerOfHanoi(n-1, source, Dest, Helper);
        System.out.println("Transfer disk "+n+" form "+source+" to "+Dest);
        TowerOfHanoi(n-1, Helper, source, Dest);
    }

    //Print the String in reverse
    public static void PrintRev(String Str,int idx){
        if(idx==0){
            System.out.println(Str.charAt(idx));
            return;
        }
        System.out.print(Str.charAt(idx));
        PrintRev(Str, idx-1);
    }

    //Find the 1st and last occurance of an element 'a' => "abaacdaefaah"
    public static int First=-1;
    public static int Last=-1;
    public static void FindOccurance(String str,int idx, char element){
        if(idx==str.length()){
            System.out.println(First);
            System.out.println(Last);
            return;
        }
        char currChar=str.charAt(idx);
        if(currChar==element){
            if(First==-1){
                First=idx;
            }else{
                Last=idx;
            }
        }
        FindOccurance(str, idx+1, element);
    }

    //Move all 'x' to the end of the string 'axbcxxd'
    public static void moveAllx(String str,int idx, int count, String newStr){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newStr+='x';
            }
            System.out.println(newStr);
            return;
        }
        char currentChar=str.charAt(idx);
        if(currentChar=='x'){
            count++;
            moveAllx(str, idx+1, count, newStr);
        }else{
            newStr+=currentChar;
            moveAllx(str, idx+1, count, newStr);
        }
    }
    

    //Remove the duplication in the string
    public static boolean[] map=new boolean[26];
    public static void removeDuplicates(String str,int idx,String newStr){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currentChar=str.charAt(idx);
        if(map[currentChar-'a']==true){
            removeDuplicates(str, idx+1, newStr);
        }else{
            newStr+=currentChar;
            map[currentChar-'a']=true;
            removeDuplicates(str, idx+1, newStr);
        }
    }

    //Print all the subsequence of a string
    public static void subsequence(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currentChar=str.charAt(idx);
        //to be
        subsequence(str, idx+1, newString+currentChar);
        //not to be
        subsequence(str, idx+1, newString);
    }

    //print all the unique subsequence of a string
    public static void subsequence2(String str, int idx, String newString, HashSet<String> set){
        if(idx==str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar=str.charAt(idx);
        //to be
        subsequence2(str, idx+1, newString+currChar, set);
        //or not be
        subsequence2(str, idx+1, newString, set);
    }

    //Print the keypad combination
    public static String[] Keypad={",","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printComb(String str, int idx, String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }
        char currentChar=str.charAt(idx);
        String mapping=Keypad[currentChar-'0'];
        for(int i=0;i<mapping.length();i++){
            printComb(str, idx+1, combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        // System.out.println("mid level");
        int n=2;
        TowerOfHanoi(n, "S", "H", "D");
        String na="Ganesharama";
        PrintRev(na,na.length()-1);
        FindOccurance(na, 0, 'a');
        System.err.println("");
        moveAllx("raxxmeshrexxshlaaxx", n, n, na);

        subsequence("ramesh", 0, "");

        System.out.println("");
        printComb("24", 0, "");
    }
}