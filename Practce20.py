#pythonを使って、入力を受け取る方法
#udemyのプログラミング500本ノックの問題20

x = list(map(int, input("数値をスペース区切りで二つ入力して下さい ").split()))
n = len(x)
for i in range(n):
    print(x[i])

fir = x[0]/x[1]
sec = fir*x[1]

print(fir)
print(sec)
