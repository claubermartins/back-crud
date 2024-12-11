# API REST com Spring Boot e Angular

CRUD com Angular e Spring Boot, destacando o relacionamento Has-Many entre entidades e aproveitando os novos recursos do Java 17.

Este projeto foi desenvolvido para demonstrar a implementação de um sistema CRUD utilizando práticas modernas de desenvolvimento, integrações entre front-end e back-end, e as melhorias do Java 17, como o uso de Records para criar DTOs (Data Transfer Objects) de forma mais concisa e eficiente. A API será integrada com um front-end desenvolvido em Angular, proporcionando uma experiência de integração entre front-end e back-end.

---

## 💻 Tecnologias

- **Java 17**
- **Spring Boot 3 (Spring 6)**
- **Maven**
- **JPA + Hibernate**
- **MySQL**
- **Docker**
- **Angular v17**
- **Angular Material**

---

## Funcionalidades disponíveis na API

- ✅ Classe Model em Java com validação
- ✅ Repositório JPA
- ✅ Paginação com JPA
- ✅ Banco de dados MySQL
- ✅ Camadas Controller, Service e Repository
- ✅ Relacionamento Has-Many (Curso-Aulas)
- ✅ DTO (Data Transfer Object) usando Records do Java 17
- ✅ Hibernate / Jakarta Validation
- ✅ Configuração de banco de dados com **Docker Compose**

---

## 🚀 Como iniciar a API

### Pré-requisitos
Certifique-se de ter as seguintes ferramentas instaladas:
- **Docker** e **Docker Compose**
- **Java 17**
- **Maven**

### Passos para iniciar o projeto

1. **Suba o banco de dados com Docker Compose:**  
   Execute o comando abaixo para baixar a imagem do MySQL e iniciar o contêiner:
   ```bash
   docker compose up -d
   ```  

2. **Compile e inicie a API:**  
   Use o Maven para compilar o projeto e iniciar o servidor Spring Boot:
   ```bash
   mvn clean install  
   mvn spring-boot:run  
   ```  

3. **Acesse a API:**  
   A API estará disponível no endereço:
   ```
   http://localhost:8080  
   ```

---

## Front-end
O front-end do projeto está disponível em: [front-crud](https://github.com/claubermartins/front-crud)

---  
