import tkinter as tk

# ウインドウの作成
root = tk.Tk()
# ウインドウのサイズ指定
root.geometry("350x350")

button = tk.Button(root, text ="RUN")
button.place(x = 100, y = 100)

# ウインドウ状態の維持
root.mainloop()

