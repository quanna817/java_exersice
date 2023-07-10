import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.*;  

class Main {
    public static void main (String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap number:");
        int number = myObj.nextInt();
        if (number > 0) {
            System.out.println("Day la so duong");
        }
        else {
            System.out.println("day la so am");
        }
    }
}

class Diction {
    public static void main(String[] args){
        Dictionary dict = new Hashtable();
        dict.put(1, "Một");
        dict.put(2, "hai");
        dict.put(3, "ba");
        dict.put(4, "bốn");
        dict.put(5, "năm");
        dict.put(6, "sáu");
        dict.put(7, "bảy");
        dict.put(8, "tám");
        dict.put(9, "chín");
        System.out.println(dict);
        Scanner number_ip = new Scanner(System.in);
        System.out.println("check value:");
        int number = number_ip.nextInt();
        System.out.println("this value is:" + dict.get(number));
    }
}
class Check_triangle{
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input value a: ");
        int a = input.nextInt();
        System.out.println("Input value b: ");
        int b = input.nextInt();
        System.out.println("Input value c: ");
        int c = input.nextInt();
        System.out.println(a);
        if (a + b > c && b+c > a && c+a >b) {
            System.out.println("day la tam giac");
            
        }
        else {
            System.out.print("day khong phai la tam giac");
        }

    }
}


class Equilateral_triangle {
    public static void main (String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Input value a: ");
        int a = ip.nextInt();
        System.out.println("Input value b: ");
        int b = ip.nextInt();
        System.out.println("Input value c: ");
        int c = ip.nextInt();
        System.out.println(a);
        if (a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a) {
            System.out.println("this equilateral triangle!");
        }
        else {
            System.out.println("this not equilateral triangle!");
        }
    }
}

class Bai6 {
    public static void main (String[] args) {
        int sum =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap gia tri cua n:");
        int n = input.nextInt();
        if (n > 0) {
            for (int i =0; i < n; i++){
                if (i %2 ==0){
                    sum = sum + i;
                    System.out.println(sum);
                }
            }
        }
        else {
            System.out.println("do la so am");
        }
    }
}

class Bai7 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap gia tri cua N:");
        int n = input.nextInt();
        int m = n;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m; j++){
                if (i * j == n ){
                    String message = String.format("phep tinh %d * %d = %d%n", i , j , n);
                    System.out.println(message);
                }
            }
        }
    }
}