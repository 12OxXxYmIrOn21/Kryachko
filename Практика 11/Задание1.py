import json
def F():
    v = name.get()
    f_json= """
    {
        'company': None
        'created_at': '2015-08-03T17:55:43Z'
        'email': None
        'id': 13629408
        'name': 'Kubernetes'
        'url': 'https://api.github.com/users/Kubernetes'
    }"""

    if v == 'Kubernetes':
        with open('C:\\Users\\User\\Desktop\\vivod.json', 'w') as file:
            json.dump(f_json,file)
        
        
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
