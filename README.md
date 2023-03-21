# Desafio Java Week


Desenvolva os métodos da controller para que possamos executar as seguintes chamadas na nossa API


### criação de produto
curl --location --request POST 'http://localhost:8080/api/produtos' \
--header 'Content-Type: application/json' \
--data-raw '{
"nome": "java week",
"preco": 0
}'

### listando todos os produtos

curl --location --request GET 'http://localhost:8080/api/produtos'

### buscar produto pelo id
curl --location --request GET 'http://localhost:8080/api/produtos/1'


### atualizar produto pelo id

curl --location --request PUT 'http://localhost:8080/api/produtos/1' \
--header 'Content-Type: application/json' \
--data-raw '{
"nome": "java week - desafio",
"preco": 0
}'



### excluir produto pelo id

curl --location --request DELETE 'http://localhost:8080/api/produtos/1'

## Como rodar o projeto

1 - Configure o java 19 no GitPod

sdk install java 19.0.2-open

2 - Rode o comando mvn clean e mvn install

3 - Rode o comando mvn spring-boot:run

4 - Commite as alterações no seu fork do Gitpod
