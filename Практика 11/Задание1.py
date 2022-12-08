import requests
import json

def F():
    v = name.get()
    response = requests.get('https://api.github.com/users/Kubernetes')

    f_ = json.loads(response.text)

    x = dict.fromkeys(['company'], f_['company'])
    x2 = dict.fromkeys(['created_at'], f_['created_at'])
    x3 = dict.fromkeys(['email'], f_['email'])
    x4 = dict.fromkeys(['id'], f_['id'])
    x5 = dict.fromkeys(['name'], f_['name'])
    x6 = dict.fromkeys(['url'], f_['url'])
    j = (x,x2,x3,x4,x5,x6)


    if v == 'NixOS':
        with open('C:\\Users\\User\\Desktop\\vivod.json', 'w') as file:
            json.dump(j,file)
        
        
    else:
        print('Данное имя не задано')

    
import tkinter as tk 
window = tk.Tk()
window.geometry('400x300')
window.title("json") 
name = tk.Entry(window)
name.grid(padx=120, pady=15)
btn = tk.Button(window, text="click", command=F)
btn.grid(padx=90, pady=15)
window.mainloop()
F()
