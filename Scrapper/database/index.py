# import requests
# from bs4 import BeautifulSoup
# import re

# # Mengirim permintaan HTTP ke website
# url = 'https://www.alodokter.com/Alergi-Makanan'
# response = requests.get(url)

# # Mengecek apakah permintaan sukses
# if response.status_code == 200:
#     # Menggunakan BeautifulSoup untuk parsing HTML
#     soup = BeautifulSoup(response.content, 'html.parser')

#     url_suffix = url.split('/')[-1]
#     gejala_text = re.sub('-', ' ', url_suffix).title()

#     # Mengambil bagian <div class="post-content"> dan elemen <p> pada baris kedua
#     post_content = soup.find('div', class_='post-content')
#     paragraphs = post_content.find_all('p')
#     second_paragraph = paragraphs[1].get_text(strip=True) if len(paragraphs) > 1 else ''

#     # Mengambil elemen <h3><strong>Gejala Alergi Makanan</strong></h3> dan elemen <ul> di bawahnya
#     h3_strong_gejala = soup.find('h3', string=f'Gejala {gejala_text}')
#     ul_gejala = h3_strong_gejala.find_next('ul') if h3_strong_gejala else None

#     # Mengambil semua elemen <li> di dalam <ul> Gejala
#     li_gejala = ul_gejala.find_all('li') if ul_gejala else []

#     # Menyimpan output dalam file teks
#     with open('output.txt', 'w') as file:
#         file.write('Bagian p baris kedua:\n')
#         file.write(second_paragraph + '\n\n')
#         file.write('Gejala:\n')
#         for li in li_gejala:
#             file.write(li.get_text(strip=True) + '\n')
#         print('Data telah disimpan dalam file output.txt')
# else:
#     print('Gagal mengambil data dari website')

# import requests
# from bs4 import BeautifulSoup
# import re

# # Membaca URL dari file url.txt
# with open('url.txt', 'r') as file:
#     urls = file.read().splitlines()

# # Melakukan loop pada setiap URL
# for url in urls:
#     # Mengirim permintaan HTTP ke website
#     response = requests.get(url)

#     # Mengecek apakah permintaan sukses
#     if response.status_code == 200:
#         # Menggunakan BeautifulSoup untuk parsing HTML
#         soup = BeautifulSoup(response.content, 'html.parser')

#         url_suffix = url.split('/')[-1]
#         gejala_text = re.sub('-', ' ', url_suffix).title()

#         # Mengambil bagian <div class="post-content"> dan elemen <p> pada baris kedua
#         post_content = soup.find('div', class_='post-content')
#         paragraphs = post_content.find_all('p')
#         second_paragraph = paragraphs[1].get_text(strip=True) if len(paragraphs) > 1 else ''

#         # Mengambil elemen <h3><strong>Gejala Alergi Makanan</strong></h3> dan elemen <ul> di bawahnya
#         h3_strong_gejala = soup.find('h3', string=f'Gejala {gejala_text}')
#         ul_gejala = h3_strong_gejala.find_next('ul') if h3_strong_gejala else None

#         # Mengambil semua elemen <li> di dalam <ul> Gejala
#         li_gejala = ul_gejala.find_all('li') if ul_gejala else []

#         # Menyimpan output dalam file teks
#         output_file = f'output_{url_suffix}.txt'
#         with open(output_file, 'w') as file:
#             file.write('Bagian p baris kedua:\n')
#             file.write(second_paragraph + '\n\n')
#             file.write('Gejala:\n')
#             for li in li_gejala:
#                 file.write(li.get_text(strip=True) + '\n')
#             print(f'Data untuk URL {url} telah disimpan dalam file {output_file}')
#     else:
#         print(f'Gagal mengambil data dari URL {url}')


# import requests
# from bs4 import BeautifulSoup
# import re
# from openpyxl import Workbook

# # Membaca URL dari file url.txt
# with open('url.txt', 'r') as file:
#     urls = file.read().splitlines()

# # Membuat file Excel baru
# wb = Workbook()
# ws = wb.active

# # Menambahkan header ke dalam file Excel
# ws.append(['Nama Penyakit', 'Penjelasan', 'Gejala'])

# # Melakukan loop pada setiap URL
# for url in urls:
#     # Mengirim permintaan HTTP ke website
#     response = requests.get(url)

#     # Mengecek apakah permintaan sukses
#     if response.status_code == 200:
#         # Menggunakan BeautifulSoup untuk parsing HTML
#         soup = BeautifulSoup(response.content, 'html.parser')

#         url_suffix = url.split('/')[-1]
#         gejala_text = re.sub('-', ' ', url_suffix).title()

#         # Mengambil bagian <div class="post-content"> dan elemen <p> pada baris kedua
#         post_content = soup.find('div', class_='post-content')
#         paragraphs = post_content.find_all('p')
#         second_paragraph = paragraphs[1].get_text(strip=True) if len(paragraphs) > 1 else ''

#         # Mengambil elemen <h3><strong>Gejala Alergi Makanan</strong></h3> dan elemen <ul> di bawahnya
#         h3_strong_gejala = soup.find('h3', string=f'Gejala {gejala_text}')
#         ul_gejala = h3_strong_gejala.find_next('ul') if h3_strong_gejala else None

#         # Mengambil semua elemen <li> di dalam <ul> Gejala
#         li_gejala = ul_gejala.find_all('li') if ul_gejala else []

#         # Menambahkan data ke dalam file Excel
#         ws.append([gejala_text, second_paragraph, '\n'.join(li.get_text(strip=True) for li in li_gejala)])

#         print(f'Data untuk URL {url} telah ditambahkan ke file Excel')
#     else:
#         print(f'Gagal mengambil data dari URL {url}')

# # Menyimpan file Excel
# wb.save('output.xlsx')
# print('Data telah disimpan dalam file output.xlsx')


import requests
from bs4 import BeautifulSoup
import re
from openpyxl import Workbook

# Membaca URL dari file url.txt
with open('url.txt', 'r') as file:
    urls = file.read().splitlines()

# Membuat file Excel baru
wb = Workbook()
ws = wb.active

# Menambahkan header ke dalam file Excel
ws.append(['Nama Penyakit', 'Penjelasan', 'Gejala'])

# Melakukan loop pada setiap URL
for url in urls:
    try:
        # Mengirim permintaan HTTP ke website
        response = requests.get(url)

        # Mengecek apakah permintaan sukses
        if response.status_code == 200:
            # Menggunakan BeautifulSoup untuk parsing HTML
            soup = BeautifulSoup(response.content, 'html.parser')

            url_suffix = url.split('/')[-1]
            gejala_text = re.sub('-', ' ', url_suffix).title()

            # Mengambil bagian <div class="post-content"> dan elemen <p> pada baris kedua
            post_content = soup.find('div', class_='post-content')
            paragraphs = post_content.find_all('p') if post_content else []
            second_paragraph = paragraphs[1].get_text(strip=True) if len(paragraphs) > 1 else ''

            # Mengambil elemen <h3><strong>Gejala Alergi Makanan</strong></h3> dan elemen <ul> di bawahnya
            h3_strong_gejala = soup.find('h3', string=f'Gejala {gejala_text}')
            ul_gejala = h3_strong_gejala.find_next('ul') if h3_strong_gejala else None

            # Mengambil semua elemen <li> di dalam <ul> Gejala
            li_gejala = ul_gejala.find_all('li') if ul_gejala else []

            # Menambahkan data ke dalam file Excel
            ws.append([gejala_text, second_paragraph, '\n'.join(li.get_text(strip=True) for li in li_gejala)])

            print(f'Data untuk URL {url} telah ditambahkan ke file Excel')
        else:
            print(f'Gagal mengambil data dari URL {url}')
    except Exception as e:
        print(f'Terjadi kesalahan saat memproses URL {url}: {str(e)}')

# Menyimpan file Excel
wb.save('output.xlsx')
print('Data telah disimpan dalam file output.xlsx')
