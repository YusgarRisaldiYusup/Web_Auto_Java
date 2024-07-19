# Web_Automation

# Proyek Pengujian UI Web menggunakan Cucumber, Java, Gradle, Selenium dengan konsep Page Objek Model
-web automation ini berfokus pada pengujian feature web  dari web "https://www.saucedemo.com/"

Proyek ini mengimplementasikan pengujian otomatis untuk aplikasi web menggunakan Cucumber sebagai framework pengujian berbasis behavior-driven development (BDD), Java untuk bahasa pemrograman, Gradle untuk manajemen dependensi dan build, serta Selenium untuk otomatisasi browser.

## Persiapan
- Seluruh dependensi yang ada di proyek ini semuanya diambil dari https://mvnrepository.com/

## Tujuan Proyek
- Mengelola dan menjalankan pengujian otomatis untuk fitur-fitur kunci aplikasi web.
- Memastikan bahwa aplikasi berperilaku sesuai dengan spesifikasi dalam berbagai skenario.

## Cara Menjalankan Pengujian
1. Pastikan JDK dan Gradle sudah terinstal di komputer Anda.
2. Clone repositori ini ke komputer Anda.
3. Buka terminal atau command prompt dan masuk ke direktori proyek.
4. Jalankan perintah `gradle test` untuk menjalankan semua pengujian.
5. Lihat laporan hasil pengujian di direktori `build/reports/tests`.

## Struktur Proyek
- `src/test/resources`: Berisi file `.feature` untuk skenario Gherkin.
- `src/main/java/Page`: Berisi kelas Model Objek Halaman.
- `src/test/java/Step`: Berisi kelas Step Definitions untuk implementasi langkah-langkah pengujian.

## Hasil running 
- ![Hasil_running1](https://github.com/YusgarRisaldiYusup/Web_Auto_selenium_Java/blob/main/msedge_oBPEcW8iyz.png)



---

Selengkapnya tentang pengaturan proyek, dependensi, dan konfigurasi dapat ditemukan di file `build.gradle`.
