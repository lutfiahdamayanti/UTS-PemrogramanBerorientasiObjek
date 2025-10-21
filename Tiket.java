import java.text.SimpleDateFormat;
import java.util.Date;

public class Tiket {
    private String kodeTiket;
    public Film film;
    private int jumlah;
    private double total;
    private String jamTayang;

    public Tiket(Film film, int jumlah, String jamTayang) {
        this.film = film;
        this.jumlah = jumlah;
        this.jamTayang = jamTayang;
        this.total = film.hargaTiket * jumlah;
        this.kodeTiket = generateKode();
    }

    private String generateKode() {
        String tanggal = new SimpleDateFormat("yyyyMMdd").format(new Date());
        int nomor = (int)(Math.random() * 9000) + 1000;
        return "BDX-" + tanggal + "-" + nomor;
    }

    public void tampilkanTiket() {
        System.out.println("Kode Tiket : " + kodeTiket);
        System.out.println("Film : " + film.judul);
        System.out.println("Jam Tayang : " + jamTayang);
        System.out.println("Jumlah : " + jumlah);
        System.out.printf("Total Harga : Rp %,d\n", (int)total);

        //Tambahan bagian ini untuk film 3D
        if (film instanceof Film3D) {
            System.out.println("Bonus: Kacamata 3D");
        }
    }
}
