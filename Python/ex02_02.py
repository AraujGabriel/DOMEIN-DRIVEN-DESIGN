import requests

login = input("Insira o login:  ")

url = f"https://api.github.com/users/{login}"

response = requests.get(url)

if response.status_code == 200:
    dados = response.json()
    print(f"NOME: {dados['name']}")
    print(f"REPOSITÓRIOS: {dados['public_repos']}")
    print(f"SEGUIDORES: {dados['followers']}")

else:
    print("USER FAKE AMIGAO")

   