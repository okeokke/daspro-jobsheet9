import java.util.Scanner;
public class T3Job9_08 {
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
    String menu[] = 
    {"Pancake", "French Toast", "Baguette",
    "Sandwich", "Garlic Bread", "Yogurt",
    "Espresso", "Milk Tea", "Milkshake", "Free Sauce"};
    
    String nama[]= new String[n];
    int harga[]= new int[n];
    boolean ketemu=false;

    for (int i = 0; i < n; i++) {
        ketemu=false;
        System.out.print("Nama pesanan ke-"+(i+1)+" : ");
        nama[i]=sc.nextLine();
        
        for (int j = 0; j < menu.length; j++) {
            if (menu[j].equalsIgnoreCase(nama[i])) {
                ketemu=true;
                break;
            } 
            // else {
            //     ketemu=false;
            //     continue;
            // }
                
        }
        if (ketemu) {
            System.out.println("Menu Tersedia!");
        } else {
            System.out.println("Menu Tidak Tersedia!");
            i=i-1;
            continue;
        }
        System.out.print("Harga : Rp");
        harga[i]=sc.nextInt();
        sc.nextLine();
        
        while (harga[i]<0) {
            System.out.print("Harga tidak boleh negatif!\nHarga : Rp");
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

// Masih  menggunakan  kasus  pada  pemesanan  makanan  di  kafe,  buatlah  program  yang 
// memungkinkan  pengguna  untuk  memesan  makanan  dari  menu  yang  tersedia  di  kafe. 
// Program harus menyimpan daftar nama makanan dalam sebuah array dan memberikan 
// opsi untuk mencari makanan yang diinginkan menggunakan metode linear search. 
// - Input: 
// o daftar  menu  makanan  yang  telah ditentukan  sebelumnya  dalam bentuk  array. 
// Nama-nama makanan telah di-inisialisasi saat deklarasi array. Misal:  
// String[]  menu  =  {"Nasi  Goreng",  "Mie  Goreng",  "Roti  Bakar", 
// "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"}; 
// o nama makanan yang ingin dicari (input dari pengguna). 
// - Proses: 
// o program  mencari  nama  makanan  yang  dimasukkan  pengguna  menggunakan 
// algoritma linear search. 
// o jika  makanan  ditemukan,  program  akan  menginformasikan  pengguna  bahwa 
// makanan tersebut  tersedia. Jika tidak ditemukan, program akan memberi tahu 
// pengguna bahwa makanan yang dicari tidak ada di menu. 
// - Output: 
// o Tampilkan hasil pencarian kepada pengguna. 