import java.util.Scanner;

// Driver Class
public class GuruTester {
    public static void main(String[] args) {
        // String-->int
        Scanner in = new Scanner(System.in);
        System.out.println("Nama : ");
        String nama = in.nextLine();
        System.out.println("Mapel : ");
        String mapel = in.nextLine();
        System.out.println("Status : ");
        String status = in.nextLine();
        System.out.println("NIP : ");
        int nip =in.nextInt();
        in.close();

        // membuat object
        // namaClass namaObject = new constructor();
        Guru pakMayis = new Guru(1122, "Mayis", "Agama", "Tetap");
        Guru buPasha = new Guru(2232, "Pasha", "Produktif", "Tetap");
        Guru pakIlham = new Guru(3329, "Ilham", "Produktif", "Full-Time");
        Guru pakFirdausa = new Guru(4427, "Firdausa", "Produktif", "Full-Time");
        Guru pakThoriq = new Guru(5813, "Thoriq", "Olahraga", "Full-Time");

        pakMayis.print();
        System.out.println("--------");
        buPasha.print();
        System.out.println("--------");
        pakIlham.print();
        System.out.println("--------");
        pakFirdausa.print();
        System.out.println("--------");
        pakThoriq.print();







        
    }
}
