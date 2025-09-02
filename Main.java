

class Main{
    public static void main(String[]args){
        int num=13;
        int n=++num - num++ + num--;
        n++;
        ++n;
        System.out.println(++num - num++ + num--);

    }
}