# Desafio Spring Boot - Injeção de Dependência

Projeto desenvolvido com foco em:

- Injeção de Dependência
- Separação de camadas (Entity, Service)
- Regra de negócio para cálculo de pedido
- Estruturação com Maven

## Tecnologias
- Java 21
- Spring Boot
- Maven

## Regras implementadas

- Frete:
  - < 100 = R$20
  - 100 até 200 = R$12
  - > 200 = R$0

- Desconto percentual aplicado sobre o valor do pedido

## Autor
Toshiaki Okayama Filho


## Como executar o projeto

Clone o repositório:

git clone https://github.com/okayamafilho/desafio-spring-injection.git

Entre na pasta do projeto:

cd desafio-spring-injection

Execute:

./mvnw spring-boot:run


## Exemplo de execução

Pedido:
Código: 1  
Valor básico: 200.00  
Desconto: 10%

Resultado:
Valor total: 192.00
