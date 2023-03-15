<h1 align="center">Springboot Microservices</h1>

<p>O projeto foi desenvolvido para simular o backend de um Shopping Online. Foi utilizada a arquitetura de microservices para separar cada setor do serviço com responsabilidades únicas. Existem quatro microservices: product, order, inventory e notification service. O primeiro é responsável por armazenar e gerenciar os produtos, o segundo pelos pedidos, o terceiro por verificar quais produtos estão disponíveis no estoque e o último pela comunicação dos estados do pedido.<p>

## Instalação

1. Clone o projeto
```bash
git clone https://github.com/JG-OLIVEIRA/springboot-microservice-study.git
```
2. Vá até à pasta raiz do projeto
```bash
cd springboot-microservice-study
```
3. Use `mvn package` para gerar a pasta `target` contendo o execultável da aplicação
```bash
mvn package
```
Agora você pode escolher uma IDE de sua preferência para rodar cada microservice, entre no entry-point de cada um e rode a aplicação

```java
package com.programming.techie.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

}
```

<h2 align="center">:construction: Projeto em construção :construction: </h2>

<h3 align="center">Componentes da Aplicação:</h3>

- [Discovery Server](https://github.com/JG-OLIVEIRA/discovery-server)
- [Product Service](https://github.com/JG-OLIVEIRA/product-service)
- [Order Service](https://github.com/JG-OLIVEIRA/order-service)
- [Inventory Service](https://github.com/JG-OLIVEIRA/inventory-service)
- [Notification Service](https://github.com/JG-OLIVEIRA/notification-service)

<h3 align="center">Arquitetura do Projeto:</h3>
<img src="https://gcdnb.pbrd.co/images/oWrlnSAn7EfR.png?o=1">

<h3 align="center">Arquitetura da Requisição:</h3>
<img src="https://gcdnb.pbrd.co/images/5HaCSzLBTRLA.png?o=1">

## ✔️ Técnicas e tecnologias utilizadas

- Java 17
- Kafta
- ElasticSearch
- Logstack
- Kibana
- RabbitMQ
- MongoDB
- MySQL
- InteliJ IDEA
- Microservices
- Mensageria
- Serviços de segurança e autenticação
- Paradigma de orientação a objetos