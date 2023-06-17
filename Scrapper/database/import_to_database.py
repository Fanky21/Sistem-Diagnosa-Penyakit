import openpyxl
import random
import string
import pymysql

# Fungsi untuk menghasilkan kode penyakit acak
def generate_random_code(length):
    letters_and_digits = string.ascii_letters + string.digits
    return ''.join(random.choice(letters_and_digits) for _ in range(length))

# Koneksi ke database MySQL
connection = pymysql.connect(host='51.161.134.32',
                             user='database_pbo',
                             password='pbo331',
                             db='sistem_kesehatan',
                             charset='utf8mb4',
                             cursorclass=pymysql.cursors.DictCursor)

# Baca file Excel
workbook = openpyxl.load_workbook('data_penyakit.xlsx')
sheet = workbook.active

# Looping untuk setiap baris di Excel, dimulai dari baris kedua (indeks 2)
for row in sheet.iter_rows(min_row=2, values_only=True):
    kode_penyakit = generate_random_code(6)
    nama_penyakit = row[0] if row[0] else "Tidak ada data"
    deskripsi_penyakit = row[1] if row[1] else "Tidak ada data"
    gejala_penyakit = row[2] if row[2] else "Tidak ada data"

    try:
        # Eksekusi query SQL untuk memasukkan data ke tabel penyakit
        with connection.cursor() as cursor:
            sql = "INSERT INTO penyakit (kode_penyakit, nama_penyakit, deskripsi_penyakit, gejala_penyakit) VALUES (%s, %s, %s, %s)"
            cursor.execute(sql, (kode_penyakit, nama_penyakit, deskripsi_penyakit, gejala_penyakit))
            connection.commit()
        print("Data berhasil dimasukkan: " + nama_penyakit)
    except Exception as e:
        print("Gagal memasukkan data: " + str(e))

# Menutup koneksi ke database
connection.close()