import requests
from bs4 import BeautifulSoup

# Mengirim permintaan GET ke halaman web
url = "https://www.alomedika.com/penyakit"
response = requests.get(url)

# Membuat objek BeautifulSoup
soup = BeautifulSoup(response.text, "html.parser")

# Mencari elemen <a> yang berada dalam <li class="page_item index-item">
links = soup.select('li.page_item.index-item a.title-az-results')

# Menyimpan data dalam file teks
output_file = "output.txt"
with open(output_file, "w") as file:
    for link in links:
        file.write(link.text + "\n")

print("Data berhasil disimpan dalam file", output_file)
