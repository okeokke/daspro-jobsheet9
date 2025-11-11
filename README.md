<!-- # TUGAS
### TUGAS 1
[Tugas1 / T1Job9_08.java](/T1Job9_08.java)
### TUGAS 2
[Tugas2 / T2Job9_08.java](/T2Job9_08.java)
### TUGAS 3
[Tugas3 / T3Job9_08.java](/T3Job9_08.java) -->

# Percobaan
1. [Percobaan 1](#percobaan-1)
- [Pertanyaan](#pertanyaan)
    * [Jawaban](#jawaban)
2. [Percobaan 2](#percobaan-2)
- [Pertanyaan](#pertanyaan-1)
    * [Jawaban](#jawaban-1)
3. [Percobaan 3](#percobaan-3)
- [Pertanyaan](#pertanyaan-2)
    * [Jawaban](#jawaban-2)
4. [Percobaan 4](#percobaan-4)
- [Pertanyaan](#pertanyaan-3)
    * [Jawaban](#jawaban-3)


## Percobaan 1
[ArrayBilangan08.java](/ArrayBilangan08.java)\
(Pastikan periksa commit history dan deskripsi commit)
### Pertanyaan
1. Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian? 
2. Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus pada saat deklarasi array.
3. Ubah statement pada langkah No 4 menjadi seperti berikut 
```java
for (int i = 0; i < 4; i++) {
    System.out.println(bil[i]);
}
```
Apa keluaran dari program? Jelaskan maksud dari statement tersebut.\
4. Jika kondisi pada statement for-loop di atas diubah menjadi:  i <= 4, apa keluaran dari program? Mengapa demikian? 

### Jawaban
1. untuk entry 1 dan 3 masih bisa diterima program, tetapi untuk entri 0 dan 2 tidak bisa karena value 5.0 dan 7.5 merupakan tipe data double yang tidak bisa digunakan pada array yang menggunakan tipe data integer kecuali dilakukan narrowing casting.
2. 
```java
int[] bil = {5, 13, -7, 17};
```
3. output :
```
5
13
-7
17
```
fungsi `for (int i = 0; i < 4; i++)` adalah untuk mengulang indeks 0-3 dan mengeksekusi setiap i yang diupdate selama masih sesuai kondisi dengan mencetak setiap elemen array.\
4. loop mencoba mengakses indeks array bil[4]. dimana inndeks ke-4 tidak ada (ukuran array 4, indeks valid 0-3) yang menyebabkan error ArrayIndexOutOfBoundsException


## Percobaan 2
[ArrayNilai08.java](/ArrayNilai08.java)\
(Pastikan periksa commit history dan deskripsi commit)\
[Kondisi Initial ArrayNilai08.java Sebelum Pertanyaan Percobaan.](https://github.com/okeokke/daspro-jobsheet9/commit/2ff79138b73749aa772974acf2118310636c35c1)
### Pertanyaan
1. Ubah statement pada langkah nomor 5 menjadi seperti berikut ini: 
```java
for (int i = 0 ; i < nilaiAkhir.length; i++) {
  System.out.print("Masukkan nilai akhir ke-"+i+" : ");
  nilaiAkhir[i] = sc.nextInt();
}
```
Jalankan program. Apakah terjadi perubahan? Mengapa demikian?

2. Apa yang dimaksud dengan kondisi: i < nilaiAkhir.length ?
3. Ubah  statement  pada  langkah  nomor  6  menjadi  seperti  berikut  ini,  sehingga  program hanya menampilkan nilai Mahasiswa yang lulus saja (yaitu mahasiswa yang memiliki nilai > 70):
```java
for (int i = 0; i < nilaiAkhir.length; i++) {
    if (nilaiAkhir [i] > 70) {
      System.out.println("Mahasiswa ke-"+i+" lulus!");
    }
}
```
Jalankan program dan jelaskan alur program!

4. Modifikasi program agar menampilkan status kelulusan semua mahasiswa berdasarkan nilai,  yaitu  dengan  menampilkan  status  mana  mahasiswa  yang  lulus dan  tidak  lulus, seperti ilustrasi output berikut: 
```
Masukkan nilai akhir ke-0 87
Masukkan nilai akhir ke-1 65
Masukkan nilai akhir ke-2 78
...
Mahasiswa ke-0 lulus!
Mahasiswa ke-1 tidak lulus!
Mahasiswa ke-2 lulus!
...
```

### Jawaban
1. Tidak ada yang berubah, hal ini dikarenakan nama array yang diikuti dengan `.length` akan mendapatkan value panjang sebuah array, di kasus ini, nilai 10 yang ada sebelumnya sama dengan panjang array `nilaiAkhir`.
2. kondisi `i < nilaiAkhir.length` adalah kondisi yang mengecek perbandingan antara nilai `i` dan panjang dari array `nilaiAkhir`, kondisi yang di-cek adalah apakah nilai `i` memiliki nilai yang lebih kecil dari nilai `nilaiAkhir.length` berupa nilai panjang array.
3. Program meminta 10 nilai akhir lalu menyimpannya berurutan ke dalam array melalui loop pertama. Setelah loop input selesai, loop ke-2 mengecek setiap nilai indeks, indeks dengan nilai lebih dari 70 dicetak sebagai lulus. Nilai kurang dari atau sama dengan 70 dilewati.
4. [ArrayNilai08.java](/ArrayNilai08.java)\
[(Cek Commit ke-9 / Commit 093f154)](https://github.com/okeokke/daspro-jobsheet9/commit/093f1549280a45d097572a3baf28017c7333314d)\
![Screenshot hasil pengerjaan pertanyaan No.4](/SS_N4P2.png)



## Percobaan 3
[ArrayRataNilai08.java](/ArrayRataNilai08.java)\
(Pastikan periksa commit history dan deskripsi commit)\
[Kondisi Initial ArrayRataNilai08.java Sebelum Pertanyaan Percobaan.](https://github.com/okeokke/daspro-jobsheet9/commit/94e90f2ae7f644a48ad6785c64d55f0002243921)

### Pertanyaan
1. Modifikasi  kode  program  pada  praktikum  percobaan  3  di  atas  (ArrayRataNilaiXX.java) agar  program  dapat  menampilkan  banyaknya  mahasiswa  yang  lulus,  yaitu  mahasiswa yang memiliki lebih besar dari 70 (>70). 
2. Modifikasi program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java) sehingga program menerima jumlah elemen berdasarkan input dari pengguna dan mengeluarkan output seperti berikut ini: 
```
Masukkan jumlah mahasiswa : 5
Masukkan nilai mahasiswa ke-1 : 80
Masukkan nilai mahasiswa ke-2 : 90
Masukkan nilai mahasiswa ke-3 : 75
Masukkan nilai mahasiswa ke-4 : 83
Masukkan nilai mahasiswa ke-5 : 78
Rata-rata nilai lulus = 85.0
Rata-rata nilai tidak lulus = 62.5
```

### Jawaban
1. [ArrayRataNilai08.java.](/ArrayRataNilai08.java)\
[(Commit 11/d50b003)](https://github.com/okeokke/daspro-jobsheet9/commit/d50b00315ab0770cad1099fc8ee366a4fd2090d0)\
![Screenshot hasil pengerjaan No.1](/SS_N1P3.png)

2. [ArrayRataNilai08.java](/ArrayRataNilai08.java)\
[(Commit 12 / c6cddd7)](https://github.com/okeokke/daspro-jobsheet9/commit/c6cddd7bc4d46860572c137f2c81227ee99bd2f5)\
![Screenshot hasil pengerjaan No.2](/SS_N2P3.png)


## Percobaan 4
[SearchNilai08.java](/SearchNilai08.java)
(Pastikan periksa commit history dan deskripsi commit)\
[Kondisi Initial SearchNilai08.java Sebelum Pertanyaan Percobaan.](https://github.com/okeokke/daspro-jobsheet9/commit/3ef3e5402bed3066be175302e858e9782c000861)

### Pertanyaan
1. Jelaskan maksud dari statement break; pada baris ke-10 kode program percobaan 4 di atas.
2. Modifikasi  kode program  pada  percobaan  4 di  atas  sehingga  program dapat  menerima input  berupa  banyaknya  elemen  array  nilai,  isi  array,  dan  sebuah  nilai  (key)  yang  ingin dicari.  Lalu  cetak  ke layar  indeks  posisi  elemen dari  nilai  (key)  yang  dicari.  Contoh hasil program: 
```
Masukkan banyaknya nilai yang akan diinput: 6
Masukkan nilai mahasiswa ke-1: 80
Masukkan nilai mahasiswa ke-2: 90
Masukkan nilai mahasiswa ke-3: 75
Masukkan nilai mahasiswa ke-4: 83
Masukkan nilai mahasiswa ke-5: 78
Masukkan nilai mahasiswa ke-6: 92
Masukkan nilai yang ingin dicari: 78

Nilai 78 ketemu, merupakan nilai mahasiswa ke-5
```
 

3. Modifikasi program pada percobaan 4 di atas, sehingga program akan memberikan pesan 
"Nilai  yang  dicari  tidak  ditemukan"  jika  nilai  yang  dicari  (key)  tidak  ada  di  dalam  array. 
Contoh tampilan program sebagai berikut:
```
Masukkan banyaknya nilai yang akan diinput: 6
Masukkan nilai mahasiswa ke-1: 80
Masukkan nilai mahasiswa ke-2: 90
Masukkan nilai mahasiswa ke-3: 75
Masukkan nilai mahasiswa ke-4: 82
Masukkan nilai mahasiswa ke-5: 95
Masukkan nilai mahasiswa ke-6: 70
Masukkan nilai yang ingin dicari: 85

Nilai yang dicari tidak ditemukan
```

### Jawaban
1. `break` menghentikan loop secara langsung tanpa loop memeriksa kondisi dan meneruskan program setelah break pada loop.
2. 
3. 
