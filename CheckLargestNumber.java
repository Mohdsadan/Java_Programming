import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter Third Number : ");
        int num3 = sc.nextInt();
        
        if(num1>num2 && num1 > num3){
            System.out.println("Num1 is Lagest Number : "+ " "+ num1);
        }else if(num2 > num1 && num2 > num3){
            System.out.println("Num2 is Lagest Number : "+ " "+ num2);
        }else{
            System.out.println("Num3 is Lagest Number : "+ " "+ num3);
        }
    }
}
