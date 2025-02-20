Diabetes Exam Management



Sistema para gerenciamento de exames de diabetes, desenvolvido com Spring Boot, JPA, PostgreSQL e seguindo a Arquitetura Hexagonal.

📌 Tecnologias Utilizadas

Java 17

Spring Boot 3.4.2

Spring Data JPA

PostgreSQL

Maven

Lombok

RabbitMQ (mensageria opcional)

🚀 Como Rodar o Projeto

📌 Pré-requisitos

Antes de iniciar, você precisa ter instalado:

Java 17

Maven

PostgreSQL (ou um banco de dados compatível)

⚙️ Configuração do Banco de Dados

Crie um banco de dados PostgreSQL:

CREATE DATABASE ms_exames;

E configure o arquivo src/main/resources/application.properties:

spring.datasource.url=jdbc:postgresql://localhost:5432/ms_exames
spring.datasource.username=postgres
spring.datasource.password=admin
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

📦 Build e Execução

1️⃣ Compilar o projeto

mvn clean package

2️⃣ Rodar a aplicação

mvn spring-boot:run

A aplicação será iniciada em http://localhost:8080.

🔗 Endpoints Disponíveis

➤ Criar um exame

POST /api/exames

Body:

{
"idPaciente": 1,
"resultadoExame": 5.8,
"dataExame": "2025-02-18T14:30:00"
}

Resposta:

{
"idExame": 1,
"idPaciente": 1,
"resultadoExame": 5.8,
"classificacaoDiabetes": "Pré-diabetes",
"dataExame": "2025-02-18T14:30:00"
}

➤ Listar todos os exames

GET /api/exames

Resposta:

[
{
"idExame": 1,
"idPaciente": 1,
"resultadoExame": 5.8,
"classificacaoDiabetes": "Pré-diabetes",
"dataExame": "2025-02-18T14:30:00"
}
]

📜 Estrutura do Projeto

📂 diabetes-exam-management
┣ 📂 src/main/java/com/ms/exame/diabetes
┃ ┣ 📂 application (Regras de negócio e DTOs)
┃ ┣ 📂 domain (Entidades e interfaces de domínio)
┃ ┣ 📂 entrypoint (Controllers e APIs)
┃ ┣ 📂 infrastructure (Repositórios e persistência)
┣ 📂 src/main/resources
┃ ┣ 📜 application.properties (Configuração do sistema)
┣ 📂 src/test/java/com/ms/exame/diabetes
┣ 📜 pom.xml (Dependências Maven)
┗ 📜 README.md (Este arquivo)

🤝 Contribuições

Contribuições são bem-vindas! Para contribuir, siga os passos:

Faça um fork do repositório.

Crie uma branch com sua feature (git checkout -b minha-feature).

Commit suas mudanças (git commit -m 'Minha nova feature').

Faça um push para sua branch (git push origin minha-feature).

Abra um Pull Request.

📜 Licença

Este projeto está sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.

Desenvolvido por Elton Souza 🚀