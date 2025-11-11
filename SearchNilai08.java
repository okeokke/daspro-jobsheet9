import java.util.Scanner;
public class SearchNilai08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, key, hasil;

    System.out.print("Masukkan jumlah indeks nilai yang akan diinput: ");
    n = sc.nextInt();

    int[] arrNilai = new int[n];

    for (int i=0; i<n; i++) {
      System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
      arrNilai[i] = sc.nextInt();
    }

    System.out.print("Masukkan nilai yang ingin dicari : ");
    key = sc.nextInt();
    hasil = -1;
    for (int i = 0; i < arrNilai.length; i++) {
      if (key == arrNilai[i]) {
        hasil = i;
        break;
      }
    }

    if (hasil != -1) {
      System.out.println("\nNilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
    } else {
      System.out.println("\nNilai yang dicari tidak ditemukan");
    }
    sc.close();
  }
}
