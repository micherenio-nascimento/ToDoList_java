# ToDo List API - Java Spring Boot

## Descrição

O **ToDo List API** é uma aplicação backend simples construída com **Java** e **Spring Boot** que permite gerenciar tarefas. A aplicação expõe uma API RESTful para operações de CRUD (Create, Read, Update, Delete) de tarefas, armazenando dados em memória. Ideal para aprender sobre desenvolvimento de APIs com Java e Spring Boot.

## Funcionalidades

- **Criar** novas tarefas
- **Listar** todas as tarefas
- **Atualizar** uma tarefa existente
- **Excluir** uma tarefa

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.x**
- **Spring Web** - Para criar as APIs REST
- **Jakarta Validation** - Para validação dos dados
- **Maven** - Gerenciamento de dependências e build

## Como Executar o Projeto

### Pré-requisitos

- **JDK 17+** instalado
- **Maven** instalado

### Passo a Passo

1. Clone o repositório:
   ```bash
   git@github.com:micherenio-nascimento/ToDoList_java.git
   ```
   
2. Navegue até o diretório do projeto:
   ```bash
   cd ToDoList_java
   ```

3. Compile e execute o projeto usando Maven:
   ```bash
   mvn spring-boot:run
   ```

4. A API estará rodando em: `http://localhost:8080`.

Aqui está a seção atualizada sobre o teste da API, mencionando o uso do Postman e a collection que você disponibilizou no GitHub:

---

### Testando a API

Você pode testar a API utilizando o **Postman**. Para facilitar, disponibilizamos uma collection com todas as rotas e exemplos de uso. 

1. Baixe a collection de testes do Postman diretamente do nosso repositório no GitHub:
   - [Collection Postman](https://github.com/seu-usuario/todo-list-api/blob/main/postman_collection.json)

2. Importe a collection no Postman:
   - Abra o Postman.
   - Clique em **Import** no canto superior esquerdo.
   - Selecione o arquivo **postman_collection.json** que você baixou do repositório.

A partir da collection, você poderá testar as seguintes funcionalidades:

- **GET** `/tasks` - Listar todas as tarefas.
- **POST** `/tasks` - Criar uma nova tarefa.
- **PUT** `/tasks/{id}` - Atualizar uma tarefa existente.
- **DELETE** `/tasks/{id}` - Excluir uma tarefa.

---

Essa atualização reflete o uso do Postman com a collection já pronta no GitHub. Lembre-se de ajustar o link conforme o nome e o local exato do arquivo em seu repositório.

## Estrutura do Projeto

```bash
src/
├── main/
    ├── java/com/micherenio/todo_list/
    │   ├── TaskController.java   # Controlador responsável pelas requisições
    │   ├── TaskService.java      # Lógica de negócio para manipulação de tarefas
    │   ├── Task.java             # Entidade Task
    └── resources/
        └── application.properties # Configurações da aplicação

```

## Melhorias Futuras

- [ ] Persistência de dados com um banco de dados (H2, MySQL, PostgreSQL, etc.)
- [ ] Adicionar autenticação (JWT, OAuth2)
- [ ] Validações mais detalhadas nas requisições
- [ ] Implementação de testes unitários e de integração