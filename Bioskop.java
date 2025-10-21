public class Bioskop {
    private Film[] daftarFilm;

    public Bioskop() {
        daftarFilm = new Film[] {
            new Film("F001", "The Autopsy of Jane Doe ", "Horor", 50000),
            new Film3D("F002", "Spider-Man: Across the Spider-Verse 3D", "Action", 70000),
            new Film("F003", "Titanic", "Romance", 60000)
        };
    }

    public void tampilkanFilm() {
        System.out.println("Daftar Film:");
        for (int i = 0; i < daftarFilm.length; i++) {
            System.out.print((i + 1) + ". ");
            daftarFilm[i].tampilkanInfo();
        }
    }

    public Film pilihFilm(int index) {
        if (index > 0 && index <= daftarFilm.length) {
            return daftarFilm[index - 1];
        }
        return null;
    }
}
