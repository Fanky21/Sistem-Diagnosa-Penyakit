from bs4 import BeautifulSoup

# Membaca file HTML lokal
html_file = "data.htm"
with open(html_file, "r") as file:
    html_data = file.read()

# Membuat objek BeautifulSoup
soup = BeautifulSoup(html_data, "html.parser")

# Mencari elemen <a> yang berada dalam <li class="index-item" style="display:block"><a href>
links = soup.select('li.index-item[style="display:block"] a[href]')

# Menyimpan data dalam file teks
output_file = "output.txt"
with open(output_file, "w") as file:
    for link in links:
        file.write(link.text + "\n")

print("Data berhasil disimpan dalam file", output_file)
