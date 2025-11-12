import java.util.Scanner;
public class T1Job9_08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n; 
    System.out.print("Masukkan jumlah nilai mahasiswa : ");
    n=sc.nextInt(); // n = jumlah nilai
    while (n<=0) {
        System.out.print("Jumlah nilai tidak bisa 0!\nMasukkan jumlah nilai mahasiswa : ");
        n=sc.nextInt(); 
    }

    int nilai[] = new int[n]; // variabel/array penyimpan nilai
    
    for (int i = 0; i < nilai.length; i++) {
        System.out.print("Masukkan nilai ke-"+(i+1)+" (0-100) : ");
        nilai[i]=sc.nextInt();
        while (nilai[i]<0 || nilai[i]>100) {
          System.out.print("Nilai tidak valid!\nMasukkan nilai ke-"+(i+1)+" (0-100) : ");
          nilai[i]=sc.nextInt();
        }
    }

    int sum=0, max=nilai[0], min=nilai[0];

    for (int i = 0; i < nilai.length; i++) {
      int v = nilai[i];
      sum+=v;
      if (v>max) { // nilai tertinggi
        max=v;
      }
      if (v<min) { // nilai terendah
        min=v;
      }
    }

    double avg=(double) sum/n;

    System.out.println("Semua nilai yang dimasukkan : ");
    for (int i = 0; i < nilai.length; i++) {
      System.out.println("Nilai ke-"+(i+1)+" : "+nilai[i]);
    }
    
    System.out.printf("Rata-rata : %.2f%n", avg);
    System.out.println("Nilai tertinggi : "+max);
    System.out.println("Nilai terendah : "+min);
    sc.close();
  }
}

// Anda  diminta  untuk  membuat  program  yang  dapat  menyimpan  dan  mengelola  nilai 
// mahasiswa. Nilai berupa bilangan bulat. Program harus menyediakan fitur untuk: 
// - memasukkan banyaknya nilai mahasiswa yang akan diinput,  
// - memasukkan setiap nilai mahasiswa,  
// - menghitung nilai rata-rata,  
// - menampilkan nilai tertinggi dan nilai terendah, serta  
// - menampilkan semua nilai yang telah dimasukkan
    