import java.util.Scanner;

public class Main {
   public Main() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      Bioskop var2 = new Bioskop();
      System.out.println("=== SELAMAT DATANG DI BIOSKOP X ===");
      var2.tampilkanFilm();
      System.out.print("\nPilih nomor film: ");
      int var3 = var1.nextInt();
      Film var4 = var2.pilihFilm(var3);
      if (var4 == null) {
         System.out.println("Pilihan tidak valid.");
      } else {
         var4.tampilkanJamTayang();
         System.out.print("Pilih jam tayang (nomor): ");
         int var5 = var1.nextInt();
         String var6 = var4.pilihJamTayang(var5);
         var1.nextLine();
         System.out.print("Masukkan nama pemesan: ");
         String var7 = var1.nextLine();
         System.out.print("Jumlah tiket: ");
         int var8 = var1.nextInt();
         Pemesanan var9 = new Pemesanan(var7, var4, var8, var6);
         var9.printData();
      }
   }
}
