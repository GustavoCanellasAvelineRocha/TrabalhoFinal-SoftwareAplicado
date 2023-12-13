# API Sistema de Reembolso de Despesas

Este projeto consiste em uma API desenvolvida em Java, utilizando Spring Boot, Maven, MySQL, Lombok, Flyway, Spring Data JPA e Hibernate. O sistema tem como objetivo gerenciar solicitações de reembolso de despesas, permitindo que um gerente as aprove ou rejeite. Os funcionários da empresa podem cadastrar solicitações de reembolso de despesas de viagem ou outras, incluindo descrição, valor e data da solicitação.

## Funcionalidades

- **Gestão de Solicitações de Reembolso:** Funcionários podem submeter solicitações de reembolso com detalhes como descrição, valor e data da solicitação.
- **Fluxo de Aprovação:** Gerentes podem visualizar as solicitações de reembolso e decidir se as aprovam ou rejeitam, com as datas de aprovação ou reprovação armazenadas.
- **Relatórios para Gerentes:** Gerentes podem solicitar relatórios sobre os reembolsos efetuados em um determinado período, incluindo uma tabela com a quantidade, porcentagem e valor total de pedidos aprovados e rejeitados.

## Contexto do Projeto

Este projeto foi desenvolvido durante o 4º semestre do curso de Sistemas de Informação na Pontifícia Universidade Católica do Rio Grande do Sul (PUCRS), na disciplina de Programação de Software Aplicado. O curso tinha como objetivo fornecer conhecimentos práticos em desenvolvimento de software.

## Membros da Equipe
- <a target="_blank" href = https://www.linkedin.com/in/leonardo-preczevski-733501215/>**Leonardo Preczevski Ramos**<a/>
- <a target="_blank" href = https://www.linkedin.com/in/gustavo-ca%C3%B1ellas-aveline-rocha-073747265/>**Gustavo Cañellas Aveline Rocha**<a/>
- <a target="_blank" href = https://www.linkedin.com/in/arthur-ilha/>**Arthur Battistel Ilha**<a/>

## Como Executar

1. Clone este repositório.
2. Abra o projeto em sua IDE preferida.
3. Certifique-se de ter um servidor MySQL configurado e acessível.
4. Configure as propriedades do banco de dados no arquivo `application.properties` ou `application.yml`.
5. Execute o projeto Spring Boot.

## Observações

Esta API simplifica o processo de reembolso, permitindo que os funcionários submetam solicitações e os gerentes as aprovem ou rejeitem de maneira eficiente. Foi desenvolvida para atender aos requisitos da disciplina "Programação de Software Aplicado". Em caso de dúvidas ou sugestões, sinta-se à vontade para entrar em contato.


# Expense Reimbursement System API (English Version)

This project is an API developed in Java using Spring Boot, Maven, MySQL, Lombok, Flyway, Spring Data JPA, and Hibernate. The system is designed to handle expense reimbursement requests, where a manager can either approve or reject them. It allows employees to submit reimbursement requests for travel or other expenses, including a description, amount, and request date.

## Features

- **Expense Request Management:** Employees can submit reimbursement requests with details such as description, amount, and request date.
- **Approval Workflow:** Managers can view reimbursement requests and decide whether to approve or reject them, with approval or rejection dates stored.
- **Manager Reports:** Managers can request reports on reimbursements made within a specific period, including a table showing the quantity, percentage, and total value of approved and rejected requests.

## Project Background

This project was developed during the 4th semester of the Information Systems course at Pontifícia Universidade Católica do Rio Grande do Sul (PUCRS). The course, "Programação de Software Aplicado" (Applied Software Programming), aimed to provide practical knowledge in software development.

## Team Members

- <a target="_blank" href= https://www.linkedin.com/in/leonardo-preczevski-733501215/>**Leonardo Preczevski Ramos**<a/>
- <a target="_blank" href = https://www.linkedin.com/in/gustavo-ca%C3%B1ellas-aveline-rocha-073747265/>**Gustavo Cañellas Aveline Rocha**<a/>
- <a target="_blank" href = https://www.linkedin.com/in/arthur-ilha/>**Arthur Battistel Ilha**<a/>

## How to Run

1. Clone this repository.
2. Open the project in your preferred IDE.
3. Ensure you have a MySQL server configured and accessible.
4. Configure database properties in the `application.properties` or `application.yml` file.
5. Run the Spring Boot project.

## Notes

This API simplifies the reimbursement process, allowing employees to submit requests and managers to efficiently approve or reject them. It was developed to fulfill the requirements of the "Programação de Software Aplicado" course. If you have any questions or suggestions, feel free to contact us.
