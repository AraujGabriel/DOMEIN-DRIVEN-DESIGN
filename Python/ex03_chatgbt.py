# import requests

# # Definir URL base da API e chave de acesso
# API_BASE_URL = 'https://economia.awesomeapi.com.br/json'
# API_ACCESS_KEY = 'sua_chave_de_acesso'

# # Mostrar opções de moedas disponíveis para conversão
# print('Escolha a moeda de destino:')
# print('1 - Dólar americano (USD)')
# print('2 - Euro (EUR)')
# print('3 - Libra esterlina (GBP)')
# opcao = int(input('Digite o número da opção desejada: '))

# # Mapear a opção escolhida para o código da moeda correspondente
# moedas = {
#     1: 'USD',
#     2: 'EUR',
#     3: 'GBP'
# }
# moeda_destino = moedas[opcao]

# # Obter valor em reais a ser convertido
# valor_em_reais = float(input('Digite o valor em reais a ser convertido: '))

# # Fazer requisição à API para obter a taxa de conversão
# url = f"{API_BASE_URL}/all/{moeda_destino}-BRL?api_key={API_ACCESS_KEY}"
# response = requests.get(url)

# if response.status_code == 200:
#     # Converter a resposta em um dicionário
#     cotacoes = response.json()

#     # Obter a taxa de conversão para a moeda de destino
#     taxa = float(cotacoes[moeda_destino]['high'])

#     # Calcular o valor convertido
#     valor_convertido = valor_em_reais / taxa

#     # Exibir o resultado
#     print(f"{valor_em_reais:.2f} reais equivalem a {valor_convertido:.2f} {moeda_destino}")
# else:
#     print("Não foi possível obter a taxa de conversão. Tente novamente mais tarde.")

import requests

# Moedas disponíveis
moedas = {
    "Dolar": "https://economia.awesomeapi.com.br/json/last/USD-BRL",
    "Euro": "https://economia.awesomeapi.com.br/json/last/EUR-BRL",
    "Bitcoin": "https://economia.awesomeapi.com.br/json/last/BTC-BRL"
}

# Mostrar as moedas disponíveis
for moeda in moedas:
    print(moeda)

# Solicitar a entrada do usuário
valor_reais = float(input("Digite o valor em reais: "))
moeda_destino = input("Digite o nome da moeda de destino: ")

# Converter
if moeda_destino in moedas:
    response = requests.get(moedas[moeda_destino])
    cotacao = float(response.json()[moeda_destino+""]["bid"])
    valor_convertido = valor_reais / cotacao
    print(f"R$ {valor_reais:.2f} equivalem a {valor_convertido:.2f} {moeda_destino}")
else:
    print(f"A moeda {moeda_destino} não está disponível para conversão.")