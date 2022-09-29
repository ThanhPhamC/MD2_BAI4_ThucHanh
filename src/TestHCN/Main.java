package TestHCN;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        double width= Double.parseDouble(sc.nextLine());
        System.out.println("Nhap chieu rong");
        double height= Double.parseDouble(sc.nextLine());
        Rectangle HCN=new Rectangle(width,height);
        System.out.println("Thong so HCN:\n"+HCN.display());
        System.out.println("Area= " +HCN.getArea());
        System.out.println("Perimeter= "+HCN.getPerimeter());
    }
}