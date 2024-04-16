import numpy as np
import matplotlib.pyplot as plt
from scipy.integrate import odeint

# Definir la ecuación diferencial
def dF(y, x): 
    dy = eval(equation)  # Evaluamos la ecuación aquí
    return dy

# Definir la ecuación
equation = '2*x - 1'

# Definir valores de y1 para la familia de curvas
y1_values = np.linspace(-5, 5, 10)  # Puedes ajustar el número de curvas cambiando el tercer parámetro

x = np.linspace(-20, 20, 100)

# Graficar la familia de curvas
plt.figure(figsize=(10, 6))  # Ajusta el tamaño de la figura
for y1 in y1_values:
    sol = odeint(dF, y1, x)
    plt.plot(x, sol, label=f'y(0) = {y1:.2f}')  # Etiqueta cada curva con el valor inicial y(0)

plt.xlabel('x')
plt.ylabel('y')
plt.title(f'Familia de Curvas de y\' = {equation}')
plt.legend()
plt.grid(True)
plt.show()

# Graficar la solución particular
plt.figure(figsize=(10, 6))  # Ajusta el tamaño de la figura
initial_condition = 3  # Cambia la condición inicial según tus necesidades
sol = odeint(dF, initial_condition, x)
plt.plot(x, sol)
plt.xlabel('x')
plt.ylabel('y')
plt.title(f'Solución particular de y\' = {equation} con y(0) = {initial_condition}')
plt.grid(True)
plt.show()