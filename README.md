# 🚀 Desafio Spring Boot - Injeção de Dependência

Projeto desenvolvido com o objetivo de aplicar conceitos fundamentais de arquitetura backend utilizando **Java e Spring Boot**.

---

## 📚 Objetivo

Implementar a lógica de cálculo de um pedido aplicando:

- Injeção de Dependência
- Separação de responsabilidades
- Organização em camadas (Entity e Service)
- Regras de negócio para cálculo de frete e desconto

---

## 🏗️ Arquitetura

O projeto foi estruturado seguindo boas práticas:

src  
 ├── entities  
 │    └── Order  
 └── services  
      ├── OrderService  
      ├── ShippingService  
      └── DiscountService  

Cada classe possui responsabilidade única, garantindo baixo acoplamento e maior manutenibilidade.

---

## ⚙️ Tecnologias Utilizadas

- Java 21
- Spring Boot
- Maven
- Git & GitHub

---

## 📌 Regras de Negócio Implementadas

### 🚚 Frete

- Pedidos abaixo de R$ 100.00 → R$ 20.00
- Pedidos entre R$ 100.00 e R$ 200.00 → R$ 12.00
- Pedidos acima de R$ 200.00 → R$ 0.00

### 💸 Desconto

- Desconto percentual aplicado sobre o valor básico do pedido.

---

## ▶️ Como Executar o Projeto

Clone o repositório:

```bash
git clone https://github.com/okayamafilho/desafio-spring-injection.git
