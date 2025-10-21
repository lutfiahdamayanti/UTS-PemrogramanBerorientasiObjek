public class Film3D extends Film {
    public boolean bonusKacamata = true;

    public Film3D(String idFilm, String judul, String genre, double hargaTiket) {
        super(idFilm, judul, genre, hargaTiket);
    }

    @Override
    public void tampilkanInfo() {
        System.out.printf("%s (Genre: %s) - Rp %,d (3D)\n", judul, genre, (int)hargaTiket);
    }
}