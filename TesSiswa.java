
//Driver Class
import java.util.Scanner;

public class TesSiswa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nama : ");
        String nama = in.nextLine();
        System.out.println("ID : ");
        int id = in.nextInt();
        System.out.println("IPK : ");
        double ipk = in.nextDouble();
        //membuat obyek
        Siswa adi = new Siswa();
        Siswa lia = new Siswa();

        Siswa ria = new Siswa(10, "Ria", 50);
        Siswa cahya = new Siswa(id,nama,ipk);
        adi.setId(100);
        adi.setNama("Adi");
        adi.setIpk(4);
        System.out.println("Ini Data Adi");
        adi.print();
        System.out.println("Ini Data Lia");
        lia.print();

        ria.print();
        cahya.print();
        System.out.println(ria.print2());
    }
}
