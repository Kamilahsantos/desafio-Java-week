# Desafio Java Week


Desenvolva os métodos da controller para que possamos executar as seguintes chamadas na nossa API


### Criação de produto

``` bash
$ curl --location --request POST 'http://localhost:8080/api/produtos' \
--header 'Content-Type: application/json' \
--data-raw '{
"nome": "java week",
"preco": 0
}'
```

### Listando todos os produtos
``` bash
$ curl --location --request GET 'http://localhost:8080/api/produtos'
```

### Buscar produto pelo id
``` bash
$ curl --location --request GET 'http://localhost:8080/api/produtos/1'
```

### Atualizar produto pelo id
``` bash
$ curl --location --request PUT 'http://localhost:8080/api/produtos/1' \
--header 'Content-Type: application/json' \
--data-raw '{
"nome": "java week - desafio",
"preco": 0
}'
```

### Excluir produto pelo id
``` bash
curl --location --request DELETE 'http://localhost:8080/api/produtos/1'
```

## Como rodar o projeto

1 - Configure o java 19 no GitPod. <br>
Confirme que sim para usar o java 19.0.2-open como padrão e para fazer o upgrade do SDKMAN

``` bash
$ sdk install java 19.0.2-open
``` 

2 - Execute os comandos:

``` bash
$ mvn clean
$ mvn install
```

3 - Rode o mvn spring-boot:run

``` bash
$ mvn spring-boot:run
```

4 - Commite as alterações no seu fork do Gitpod


Caso queira ver a solução do desafio consulte [esse commit:](https://github.com/Kamilahsantos/desafio-Java-week/blob/bd5241395a83f8a61059a64e217269c45bc57f29/src/main/java/com/linuxtips/challengejavaweek/controller/ProdutoController.java)
