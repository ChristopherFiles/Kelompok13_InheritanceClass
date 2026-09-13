# Praktikum OOP - Inheritance (Person, Mahasiswa, Dosen)

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

Program sederhana yang dibuat menggunakan Java untuk menerapkan konsep **inheritance (pewarisan)** pada Object-Oriented Programming (OOP), melalui studi kasus data akademik: `Person`, `Mahasiswa`, dan `Dosen`.

Mahasiswa dan Dosen sama-sama memiliki identitas dasar (nama, email, alamat), sehingga kesamaan atribut tersebut diletakkan pada superclass `Person`, sedangkan atribut serta perilaku khususnya masing-masing diletakkan pada subclass `Mahasiswa` dan `Dosen`.

## Informasi Project

| Keterangan         | Detail                      |
| ------------------ | ---------------------------- |
| Nama Project       | Praktikum OOP - Inheritance |
| Bahasa Pemrograman | Java                        |
| Konsep             | Object-Oriented Programming (Inheritance) |
| Jenis Program      | Console Application         |
| IDE                | Visual Studio Code          |

## Class yang Digunakan

| Class       | Keterangan                                                  |
| ----------- | ------------------------------------------------------------ |
| `Person`    | Superclass; menyimpan identitas umum (nama, email, alamat)  |
| `Mahasiswa` | Subclass `Person`; menyimpan data akademik mahasiswa         |
| `Dosen`     | Subclass `Person`; menyimpan data dan perilaku dosen          |
| `Main`      | Menjalankan program dan menguji object                        |

## Class Person (Superclass)

Class `Person` menyimpan atribut identitas umum yang dimiliki bersama oleh `Mahasiswa` dan `Dosen`.

### Atribut

| Atribut  | Tipe Data | Keterangan |
| -------- | --------- | ----------- |
| `nama`   | `String`  | Nama        |
| `email`  | `String`  | Email       |
| `alamat` | `String`  | Alamat      |

### Method

| Method                  | Keterangan                            |
| ------------------------ | --------------------------------------- |
| `getNama()`              | Mengambil nama                        |
| `getEmail()`             | Mengambil email                       |
| `getAlamat()`            | Mengambil alamat                      |
| `setNama(String)`        | Mengubah nama                         |
| `setEmail(String)`       | Mengubah email                        |
| `tampilkanIdentitas()`   | Menampilkan nama, email, dan alamat   |

## Class Mahasiswa (extends Person)

Class `Mahasiswa` mewarisi `Person` dan menambahkan atribut serta perilaku akademik.

### Atribut

| Atribut        | Tipe Data | Keterangan             |
| -------------- | --------- | ------------------------ |
| `nim`          | `String`  | Nomor Induk Mahasiswa   |
| `programStudi` | `String`  | Program studi           |
| `semester`     | `int`     | Semester berjalan       |
| `ipk`          | `double`  | Indeks Prestasi Kumulatif |

### Method

| Method              | Keterangan                                               |
| -------------------- | ----------------------------------------------------------- |
| `getNim()`           | Mengambil NIM                                              |
| `getIpk()`           | Mengambil IPK                                              |
| `getProgramStudi()`  | Mengambil program studi                                    |
| `getSemester()`      | Mengambil semester                                         |
| `setIpk(double)`     | Mengubah IPK dengan validasi rentang 0.0 - 4.0             |
| `naikSemester()`     | Menambah nilai semester sebanyak satu                      |
| `cekPredikat()`      | Menentukan predikat kelulusan berdasarkan nilai IPK        |

## Class Dosen (extends Person)

Class `Dosen` mewarisi `Person` dan menambahkan atribut serta perilaku khusus dosen.

### Atribut

| Atribut | Tipe Data | Keterangan               |
| ------- | --------- | -------------------------- |
| `nidn`  | `String`  | Nomor Induk Dosen Nasional |

### Method

| Method       | Keterangan                                              |
| ------------- | ---------------------------------------------------------- |
| `mengajar()` | Menampilkan pesan bahwa dosen sedang mengajar, memanfaatkan `getNama()` dari `Person` |

## Relasi Antar Class

| Relasi                  | Jenis       | Keterangan                                   |
| ------------------------ | ----------- | ----------------------------------------------- |
| `Mahasiswa` → `Person`  | Inheritance | Mahasiswa merupakan turunan dari Person (extends) |
| `Dosen` → `Person`      | Inheritance | Dosen merupakan turunan dari Person (extends)     |

Relasi sederhana:

```text
Person
 ├── Mahasiswa
 └── Dosen
```

## Konsep OOP yang Diterapkan

| Konsep         | Penerapan                                                        |
| --------------- | -------------------------------------------------------------------- |
| Class & Object  | `Person`, `Mahasiswa`, `Dosen`                                        |
| Constructor     | Mengisi nilai awal object, termasuk pemanggilan `super()`             |
| Encapsulation   | Atribut menggunakan `private`, diakses melalui getter/setter         |
| Inheritance     | `Mahasiswa` dan `Dosen` merupakan turunan dari `Person`               |
| Method Overriding pattern | `Mahasiswa` menambahkan method sendiri di atas method warisan Person |

## Struktur Project

```text
mahasiswa/
│
├── README.md
│
└── src/
    ├── Main.java
    ├── Person.java
    ├── Mahasiswa.java
    └── Dosen.java
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

Class `Person`, `Mahasiswa`, dan `Dosen` digunakan sebagai class pendukung dan tidak dijalankan secara langsung.

## Contoh Output

```text
NIM: J0403251048
Nama: Diaz R.H.
Program Studi: TPL
Semester: 3
IPK: 3.75
Predikat: Cumlaude
----- Setelah Update -----
Semester: 4
NIM: J0403251048
Predikat: Cumlaude
----- Dosen -----
Budi sedang mengajar
```

## Kesimpulan

Program ini menerapkan konsep **inheritance** dengan menjadikan `Person` sebagai superclass yang menyimpan atribut dan method umum, sementara `Mahasiswa` dan `Dosen` sebagai subclass yang mewarisi `Person` sekaligus menambahkan atribut dan perilaku khususnya masing-masing. Penggunaan `super()` pada constructor subclass memastikan atribut yang diwariskan terisi dengan benar tanpa duplikasi kode.

Program masih dapat dikembangkan lebih lanjut, misalnya dengan menambahkan validasi input pada setter `Person`, atau menambahkan subclass `Person` lain seperti `Staff` atau `Alumni`.