import java.util.Scanner;
public class Yeniiiiii {
    public static void main(String[] args) {
     int mat,fizik,kimya,turkce,tarih,muzik;
     Scanner inp = new Scanner(System.in);
     System.out.print("Matematik Notunuz : ");
     mat = inp.nextInt();
     System.out.print("Fizik Notunuz : ");
     fizik = inp.nextInt();
     System.out.print("Kimya Notunuz : ");
     kimya = inp.nextInt();
     System.out.print("Türkçe Notunuz : ");
     turkce = inp.nextInt();
     System.out.print("Tarih Notunuz : ");
     tarih = inp.nextInt();
     System.out.print("Müzik Notunuz : ");
     muzik = inp.nextInt();
     int toplam = mat+fizik+kimya+turkce+tarih+muzik;
     double ort = toplam/6.0;
     boolean sonuc = ort>=60;
     String str = sonuc ? "Sınıftan Geçti" : "Sınıfta Kaldı";
     System.out.println(str);
     System.out.println("Ortalamanız : "+ort);
    }

}
