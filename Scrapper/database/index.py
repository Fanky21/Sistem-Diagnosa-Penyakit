# Baca input dari file filter.txt
with open('filter.txt', 'r') as input_file:
    lines = input_file.readlines()

# Menghapus baris baru dan menambahkan koma
filtered_text = ','.join([line.strip() for line in lines])

# Tulis output ke file output.txt
with open('output.txt', 'w') as output_file:
    output_file.write(filtered_text)