![Main Logo](https://cdn.discordapp.com/attachments/1078763571355324426/1120591644580921404/png.png)

# SISTEM KESEHATAN DIGITAL TERPADU
Perancangan Sistem Diagnosa Penyakit Terpadu yang dikembangkan oleh mahasiswa Informatika Institut Teknologi Kalimantan.

## Feature
1. Diagnosa Penyakit
2. Daftar Penyakit
3. Hubungi Dokter
4. Database Penyakit
5. Riwayat Penyakit

## **Pendahuluan**
Dengan kemajuan teknologi yang ada pada saat ini, kita tidak perlu lagi harus ke rumah sakit untuk bertanya terkait gejala-gejala penyakit yang kita alami. Saat ini tiap orang bisa mengetahui jenis penyakit yang mereka alami hanya melalui genggaman Smartphone mereka. Berdasarkan situasi yang terjadi seperti yang telah dijelaskan diatas, maka dibuatlah aplikasi Sistem Informasi Kesehatan Digital. Aplikasi ini bertujuan untuk memudahkan masyarakat agar mereka dapat mengetahui penyakit yang mereka alami dengan hanya memberitahu gejala atau keluhan yang mereka alami. Aplikasi ini dibuat untuk memudahkan masyarakat agar mereka mendapat diagnosa yang cepat namun memiliki akurasi yang baik karena aplikasi ini mengambil basis data dari beberapa situs kesehatan besar sehingga mereka tidak perlu ke Rumah Sakit apabila mengalami gejala-gejala penyakit ringan.

## **Pembahasan**
### 1.	GUI
Perancangan GUI kami lakukan dengan menggunakan FIGMA sebagai Design Editor. Setelah desain fix untuk digunakan, kami mengintegrasikan GUI ke program aplikasi kami menggunakan NetBeans.
### 2.	Penggunaan Code Editor (IDE)
Kami menggunakan 2 IDE yaitu Visual Studio Code, dan NetBeans. Visual Studio Code kami menggunakan untuk mengembangkan aplikasi seperti penerapan Class Diagram, Integrasi Database, dan serta pembuatan objek. Lalu untuk NetBeans kami gunakan untuk mengintegrasikan desain yang telah kami buat di FIGMA menjadi aplikasi dengan bahasa pemrograman java.
### 3.	Database
Database yang kami gunakan adalah MyPHP. Database tersebut berisi dataset penyakit-penyakit yang kami ambil dari Situs Alodokter.com. Dalam database tersebut, Gejala penyakit dan penyakitnya telah terintegrasi.
### 4.	Skema pengambilan data penyakit dari database
Aplikasi kami akan melakukan “Word Tracking” terhadap masukan dari pengguna berupa keluhan-keluhan atau gejala penyakut yang mereka rasakan. Program kami akan mengunci kalimat-kalimat yang dianggap sebagai gejala sebagai contoh “Sakit Perut”, “Mual”, ”Pusing”, dan lain sebagainya yang diklasifikasikan sebagai gejala penyakit. Berikutnya program kami akan mencari kecocokan antara gejala yang disampaikan oleh pengguna dengan database yang kami sehingga program akan dapat memberikan diagnosa penyakit sesuai dengan keluhan atau gejala yang mereka alami.

##
##
Scrapper - Python <br>
Program - Java <br>
Database - MySQL <br>
