import java.util.Scanner;
public class T2Job9_08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.print("Masukkan jumlah pesanan : ");
    n=sc.nextInt();
    sc.nextLine();

    while (n<=0) {
        System.out.print("Input angka di atas 0!\nMasukkan jumlah pesanan : ");
        n=sc.nextInt();
        sc.nextLine();
    }
    
    String nama[]= new String[n];
    int harga[]= new int[n];

    for (int i = 0; i < n; i++) {
        System.out.print("Nama pesanan ke-"+(i+1)+" : ");
        nama[i]=sc.nextLine();

        System.out.print("Harga : Rp");
        harga[i]=sc.nextInt();
        sc.nextLine();
        
        while (harga[i]<0) {
            System.out.print("Harga tidak boleh negatif!\nHarga : ");
            harga[i]=sc.nextInt();
            sc.nextLine();
        }
    }

    int total = 0;
    for (int i = 0; i < harga.length; i++) {
        total+=harga[i];
    }

    System.out.println("Semua Pesanan : ");
    for (int i = 0; i < harga.length; i++) {
        System.out.println((i+1)+". "+nama[i]+"\t -\t Rp"+harga[i]);
    }
    System.out.println("Harga total pesanan : Rp"+total);
    sc.close();
  }
}

// Buat program yang dapat mengelola pemesanan makanan dan minuman di sebuah kafe. 
// Program akan memungkinkan pengguna untuk memasukkan pesanan, menghitung total 
// biaya pesanan, dan menampilkan daftar pesanan yang telah dibuat.  
// - Input:  
// o jumlah pesanan (input dari pengguna). 
// o nama makanan/minuman dan harga untuk masing-masing pesanan (input dari pengguna) 
// - Proses: 
// o simpan data pesanan dalam array satu dimensi untuk nama pesanan; dan array 
// satu dimensi terpisah untuk harga. 
// o hitung total biaya dari semua pesanan yang dimasukkan. 
// o tampilkan daftar pesanan yang telah dimasukkan bersama dengan total biaya. 
// - Output: 
// o daftar pesanan dan total biaya dari semua pesanan. 