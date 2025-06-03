import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number  : ");
        int Num = sc.nextInt();
        
        if(Num%2==0){
            System.out.println("This is a Even Number : " +" " + Num);
        }
        else{
            System.out.println("This is a Odd Number : " + " "+ Num);
        }
    }
}
