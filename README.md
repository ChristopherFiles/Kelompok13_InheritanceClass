# Perpustakaan OOP Java

# Kelompok 13

## Anggota Kelompok

| No | Nama                 | NIM         |
| -: | -------------------- | ----------- |
|  1 | MISAEL CHRISTOPHER H | J0403251052 |
|  2 | INTAN SAHARA NURAFNI | J0403251005 |
|  3 | FAIZA AGHNAITA ZAHRA | J0403251122 |
|  4 | ZAHRA CANTIKYA P     | J0403251106 |
|  5 | FAHRIZAL AZIZ        | J0403251151 |

## Tentang Project

Program sederhana aplikasi perpustakaan yang dibuat menggunakan Java dengan konsep Object-Oriented Programming (OOP).

Program ini dibuat untuk menerapkan penggunaan class, object, constructor, method, encapsulation, inheritance, polymorphism, serta relasi antar class pada sebuah sistem perpustakaan sederhana.

## Informasi Project

| Keterangan         | Detail                      |
| ------------------ | ---------------------------- |
| Nama Project       | Perpustakaan OOP Java       |
| Bahasa Pemrograman | Java                        |
| Konsep             | Object-Oriented Programming |
| Jenis Program      | Console Application         |
| IDE                | Visual Studio Code          |
| JDK                | JDK 21                      |

## Riwayat Update

| Pertemuan | Update                                                                 |
| --------- | ----------------------------------------------------------------------- |
| Pertemuan 1 | Pembuatan class diagram dan implementasi awal (`Member`, `Buku`, `GenreBuku`) tanpa inheritance |
| Pertemuan 2 | Penambahan konsep **inheritance**: superclass `Orang` (abstract) serta subclass `Member` dan `Petugas` (baru), dengan demonstrasi polymorphism pada `Main.java` |

## Class yang Digunakan

| Class       | Keterangan                                              |
| ----------- | -------------------------------------------------------- |
| `Orang`     | Superclass abstrak, menyimpan identitas umum (id, nama, alamat) |
| `Member`    | Subclass `Orang`; menyimpan data anggota dan buku yang sedang dipinjam |
| `Petugas`   | Subclass `Orang`; menyimpan data staf perpustakaan dan mengelola katalog buku |
| `Buku`      | Menyimpan data buku, genre, dan status peminjaman        |
| `GenreBuku` | Menyimpan data genre buku                                 |
| `Main`      | Menjalankan program dan membuat object                    |

## Class Orang (Superclass)

Class `Orang` merupakan superclass abstrak yang menyimpan atribut identitas umum yang dimiliki bersama oleh `Member` dan `Petugas`.

### Atribut

| Atribut  | Tipe Data | Keterangan     |
| -------- | --------- | -------------- |
| `id`     | `int`     | ID orang       |
| `nama`   | `String`  | Nama           |
| `alamat` | `String`  | Alamat         |

### Method

| Method               | Keterangan                                    |
| --------------------- | ---------------------------------------------- |
| `getId()`             | Mengambil id                                   |
| `getNama()`           | Mengambil nama                                 |
| `getAlamat()`         | Mengambil alamat                               |
| `tampilkanData()`     | Method abstrak, wajib di-override oleh subclass |

## Class Member (extends Orang)

Class `Member` digunakan untuk menyimpan data anggota perpustakaan dan mengatur proses peminjaman serta pengembalian buku. Member mewarisi atribut identitas dari `Orang`.

### Atribut

| Atribut        | Tipe Data         | Keterangan                       |
| -------------- | ----------------- | --------------------------------- |
| `bukuDipinjam` | `ArrayList<Buku>` | Daftar buku yang sedang dipinjam |

### Method

| Method             | Keterangan                                          |
| ------------------- | ---------------------------------------------------- |
| `getIdMember()`     | Mengambil ID member (memanfaatkan `getId()` dari Orang) |
| `pinjamBuku()`      | Melakukan proses peminjaman buku                     |
| `kembalikanBuku()`  | Melakukan proses pengembalian buku                   |
| `tampilkanData()`   | Override dari Orang; menampilkan data member dan buku yang dipinjam |

## Class Petugas (extends Orang)

Class `Petugas` merupakan subclass baru dari `Orang` yang merepresentasikan staf perpustakaan, bertugas mengelola katalog buku.

### Atribut

| Atribut   | Tipe Data | Keterangan          |
| --------- | --------- | -------------------- |
| `jabatan` | `String`  | Jabatan petugas      |

### Method

| Method              | Keterangan                                  |
| -------------------- | --------------------------------------------- |
| `getJabatan()`       | Mengambil jabatan petugas                     |
| `tambahBuku()`       | Menambahkan buku baru ke dalam katalog        |
| `tampilkanData()`    | Override dari Orang; menampilkan data petugas |

## Class Buku

Class `Buku` digunakan untuk menyimpan informasi buku yang ada di perpustakaan.

### Atribut

| Atribut       | Tipe Data   | Keterangan   |
| ------------- | ----------- | ------------ |
| `idBuku`      | `int`       | ID buku      |
| `judul`       | `String`    | Judul buku   |
| `penulis`     | `String`    | Nama penulis |
| `tahunTerbit` | `int`       | Tahun terbit |
| `status`      | `String`    | Status buku  |
| `genre`       | `GenreBuku` | Genre buku   |

### Method

| Method            | Keterangan                            |
| ----------------- | -------------------------------------- |
| `getIdBuku()`     | Mengambil ID buku                     |
| `getJudul()`      | Mengambil judul buku                  |
| `getPenulis()`    | Mengambil nama penulis                |
| `getStatus()`     | Mengambil status buku                 |
| `getGenre()`      | Mengambil genre buku                  |
| `pinjam()`        | Mengubah status buku menjadi Dipinjam |
| `kembalikan()`    | Mengubah status buku menjadi Tersedia |
| `tampilkanInfo()` | Menampilkan informasi buku            |

## Class GenreBuku

Class `GenreBuku` digunakan untuk menyimpan informasi mengenai genre buku.

### Atribut

| Atribut     | Tipe Data | Keterangan      |
| ----------- | --------- | ---------------- |
| `idGenre`   | `int`     | ID genre         |
| `namaGenre` | `String`  | Nama genre       |
| `deskripsi` | `String`  | Deskripsi genre |

### Method

| Method             | Keterangan                  |
| ------------------- | ----------------------------- |
| `getIdGenre()`      | Mengambil ID genre           |
| `getNamaGenre()`    | Mengambil nama genre         |
| `getDeskripsi()`    | Mengambil deskripsi genre    |
| `tampilkanGenre()`  | Menampilkan informasi genre  |

## Relasi Antar Class

| Relasi                       | Jenis         | Keterangan                                     |
| ----------------------------- | -------------- | ------------------------------------------------ |
| `Member` → `Orang`           | Inheritance    | Member merupakan turunan dari Orang (extends)   |
| `Petugas` → `Orang`          | Inheritance    | Petugas merupakan turunan dari Orang (extends)  |
| `GenreBuku` — `Buku`         | Association    | Satu genre dapat digunakan oleh beberapa buku   |
| `Member` — `Buku`            | Association    | Member dapat meminjam buku                      |
| `Petugas` — `Buku`           | Association    | Petugas mengelola (menambahkan) data buku ke katalog |

Relasi sederhana:

```text
Orang (abstract)
 ├── Member
 └── Petugas

GenreBuku 1 -------- * Buku
Member    * -------- * Buku
```

## Konsep OOP yang Diterapkan

| Konsep         | Penerapan                                                          |
| --------------- | -------------------------------------------------------------------- |
| Class & Object  | `Orang`, `Member`, `Petugas`, `Buku`, `GenreBuku`                   |
| Constructor     | Mengisi nilai awal object, termasuk pemanggilan `super()`           |
| Encapsulation   | Atribut menggunakan `private`/`protected`                            |
| Inheritance     | `Member` dan `Petugas` merupakan turunan dari `Orang`                |
| Polymorphism    | Method `tampilkanData()` dipanggil melalui referensi `Orang[]`, hasil berbeda tergantung object aslinya |
| Method Overriding | `tampilkanData()` di-override pada `Member` dan `Petugas`          |
| ArrayList       | Menyimpan daftar buku yang dipinjam maupun katalog buku              |

## Struktur Project

```text
PerpustakaanOOP/
│
├── README.md
│
└── src/
    ├── Main.java
    ├── Orang.java
    ├── Member.java
    ├── Petugas.java
    ├── Buku.java
    └── GenreBuku.java
```

## Cara Menjalankan

Pastikan Java/JDK sudah terinstall.

Cek Java:

```bash
java -version
```

Cek compiler:

```bash
javac -version
```

Masuk ke folder `src`:

```bash
cd src
```

Compile seluruh file:

```bash
javac *.java
```

Jalankan program:

```bash
java Main
```

Class yang dijalankan adalah `Main` karena memiliki method `main()`.

```java
public static void main(String[] args)
```

Class `Orang`, `Member`, `Petugas`, `Buku`, dan `GenreBuku` digunakan sebagai class pendukung.

## Contoh Output

```text
=== DAFTAR BUKU ===
ID Buku     : 101
Judul       : Belajar Java OOP
Penulis     : Andi
Tahun       : 2025
Genre       : Pemrograman
Status      : Tersedia
-------------------
...

=== PENAMBAHAN BUKU OLEH PETUGAS ===
Pak Andi menambahkan buku baru ke katalog: Filosofi Teras

=== PEMINJAMAN ===
Misael berhasil meminjam buku: Belajar Java OOP
Misael berhasil meminjam buku: Senja di Kota

=== MEMBER LAIN ===
Buku sedang dipinjam.

=== PENGEMBALIAN ===
Misael mengembalikan buku: Belajar Java OOP
Azis berhasil meminjam buku: Belajar Java OOP

=== DEMONSTRASI POLYMORPHISM (Orang) ===

=== DATA MEMBER ===
ID Member : 1
Nama      : Misael
Alamat    : Karawang
...

=== DATA PETUGAS ===
ID Petugas : 1
Nama       : Pak Andi
Alamat     : Bogor
Jabatan    : Staff Perpustakaan
```

## Kesimpulan

Program ini merupakan penerapan konsep OOP pada sistem perpustakaan sederhana, mencakup class dan object, constructor, encapsulation, **inheritance**, dan **polymorphism**. Class `Orang` sebagai superclass abstrak menyederhanakan struktur `Member` dan `Petugas` yang memiliki identitas serupa, sementara `Buku` dan `GenreBuku` tetap berdiri sendiri dengan relasi association.

Program masih berbasis console dan dapat dikembangkan lagi dengan database, menu interaktif, pencarian buku, riwayat peminjaman, class `Peminjaman` tersendiri, serta fitur lainnya.