nilai = int(input("Mencari Bilangan Ganjil = "))
hasil = 0

print("================")

for i in range(1,nilai,2):
      if i % 3 == 0:
          hasil +=i
          print(i)
print("================")
print("jumlah :",hasil)
