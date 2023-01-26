import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        double mat,fizik,kimya,turkce,tarih,muzik;
        Scanner input=new Scanner(System.in);
        System.out.print("Matematik Notu: ");
        mat=input.nextDouble();
        System.out.print("Fizik Notu: ");
        fizik=input.nextDouble();
        System.out.print("Kimya Notu: ");
        kimya=input.nextDouble();
        System.out.print("Türkçe Notu: ");
        turkce=input.nextDouble();
        System.out.print("Tarih Notu: ");
        tarih=input.nextDouble();
        System.out.print("Muzik Notu: ");
        muzik=input.nextDouble();
        double ort=(mat+fizik+kimya+turkce+tarih+muzik)/6;
        String kosul=ort>=60? "Sınıfı Geçti":"Kaldı";
        System.out.println(kosul);
    }
}
