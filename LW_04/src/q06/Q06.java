package q06;

public class Q06 {
    static void main(String[] args) {
        int num =10;
        while (num<50){
            System.out.print(" "+num);

            if(num%10==9)
                System.out.println();
            num+=1;
        }
    }
}
