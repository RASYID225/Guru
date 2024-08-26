
// Object Class
public class Guru {

    // variabel
    String nama;
    int nip;
    String mapel;
    String status;

    // Constructor Default (yang membuat object)
    public Guru() {
        nip = 0;
        nama = "Kosong";
        mapel = "Kosong";
        status = "Kosong";

    }

    // Constructor parameter
    public Guru(int p, String n, String m, String s) {
        nip = p;
        nama = n;
        mapel = m;
        status = s;
    }

    // Getter
    // Setter
    // Method
    public void print() {
        System.out.println("NIP : " + nip);
        System.out.println("Nama : " + nama);
        System.out.println("Mapel : " + mapel);
        System.out.println("Status : " + status);

    }

}
