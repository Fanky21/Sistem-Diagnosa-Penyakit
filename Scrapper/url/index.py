# Membaca file teks
input_file = "data.txt"
with open(input_file, "r") as file:
    data = file.readlines()

# Mengubah data menjadi URL dan menyimpannya dalam list
urls = []
for line in data:
    line = line.strip()
    line = line.replace(" ", "-")
    url = f"https://www.alodokter.com/{line}"
    urls.append(url)

# Menyimpan URL dalam file teks
output_file = "fixed-url.txt"
with open(output_file, "w") as file:
    for url in urls:
        file.write(url + "\n")

print("URL berhasil disimpan dalam file", output_file)
