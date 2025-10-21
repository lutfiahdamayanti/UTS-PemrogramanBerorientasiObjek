import java.util.ArrayList;

public class Film {
    protected String idFilm;
    public String judul;
    public String genre;
    protected double hargaTiket;
    protected ArrayList<String> jamTayang = new ArrayList<>();

    public Film(String idFilm, String judul, String genre, double hargaTiket) {
        this.idFilm = idFilm;
        this.judul = judul;
        this.genre = genre;
        this.hargaTiket = hargaTiket;
        jamTayang.add("12:00");
        jamTayang.add("15:00");
        jamTayang.add("18:00");
    }

    public void tampilkanInfo() {
        System.out.printf("%s (%s) - Rp %,d\n", judul, genre, (int)hargaTiket);
    }

    public void tampilkanJamTayang() {
        System.out.println("Jam Tayang Tersedia:");
        for (int i = 0; i < jamTayang.size(); i++) {
            System.out.println((i + 1) + ". " + jamTayang.get(i));
        }
    }

    public String pilihJamTayang(int index) {
        if (index > 0 && index <= jamTayang.size()) {
            return jamTayang.get(index - 1);
        }
        return "Tidak Diketahui";
    }
}
