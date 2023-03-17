import pyautogui
from time import sleep

quantidadeProtocolos = 576

while quantidadeProtocolos > 0:
    #seleciona "editar" no perfil
    pyautogui.click(1547,807, duration=0.1)
    #Abre os filtros(reutilizar)
    pyautogui.click(1397,497, duration=0.1)
    #seleciona 1° filtro
    pyautogui.click(1453,526, duration=0.1)
    #Abre os filtros(reutilizar)
    pyautogui.click(1397,497, duration=0.1)
    #Seleciona 2° filtro 
    pyautogui.click(1361,565, duration=0.1)
    #adiciona os filtros 
    pyautogui.click(1663,495, duration=0.1)
    #Atualiza os filtros
    pyautogui.click(1671,688, duration=0.2)
    sleep(1.5)
    quantidadeProtocolos -= 1
