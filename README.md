# Estudando Java Spring

Este repositório contém exemplos e anotações sobre o estudo do **Spring Framework** e **Spring Boot**, duas ferramentas essenciais para o desenvolvimento de aplicações Java.

<p align="center">
  <img src="https://github.com/user-attachments/assets/9705bdff-b786-4a16-bd2c-498ea325cc12" alt="Spring_Boot svg" width="100"/>
  <img src="https://github.com/user-attachments/assets/1c9c584c-1d92-43e5-ad41-6389bafd28b3" width="100"/>
</p>


## Spring vs Spring Boot

- **Spring** é um _framework_ que fornece um modelo abrangente para o desenvolvimento de aplicações Java.

- **Spring Boot** é uma extensão do Spring que facilita a criação de aplicações de forma mais rápida e simples.
### Como o Spring Boot facilita?

O **Spring Boot** abstrai muitas das configurações detalhadas da Spring Framework, permitindo que você foque na lógica de negócio. Ele fornece:

- **Redução de configurações manuais**
- **Estrutura pronta para produção**, com recursos como servidor embutido.
- **Gerenciamento de dependências**, facilitando a adição de bibliotecas com um arquivo de configuração central (pom.xml).


## Estrutura do Projeto

Aqui estão as principais pastas e arquivos que você encontrará em um projeto Spring Boot típico.

### Gerenciamento de Dependências

- As dependências do projeto são gerenciadas no arquivo `pom.xml` (para Maven) ou `build.gradle` (para Gradle).
- O Maven/Gradle baixa automaticamente as bibliotecas necessárias com base nas dependências declaradas neste arquivo.

### Pasta `.mvn`

- Contém configurações avançadas do Maven, como definições de plugins e comportamentos específicos do projeto.

### Pasta `src`

- **`src/main/java`**: Contém o código-fonte principal da aplicação.
- **`src/main/resources`**: Contém arquivos de configuração e outros recursos, como propriedades, templates e arquivos estáticos.
- **`src/test/java`**: Contém os testes automatizados da aplicação.

### Pasta `resources`

Essa pasta é usada para armazenar arquivos de configuração e outros recursos não compilados que a aplicação utiliza.

1. **Arquivos de configuração** (`application.properties` ou `application.yml`): Arquivos de configuração para o Spring Boot. Aqui, é definido:
    - A porta do servidor (ex: `server.port=8080`).
    - Credenciais de acesso ao banco de dados (ex: `spring.datasource.username` e `spring.datasource.password`).
    - Propriedades de conexão, entre outras configurações.

2. **Perfis de Configuração**: Você pode definir diferentes perfis para diferentes ambientes (desenvolvimento, produção, testes). Por exemplo, crie um arquivo `application-dev.properties` para o ambiente de desenvolvimento e outro `application-prod.properties` para o ambiente de produção. Para usar um perfil específico, adicione a anotação `@Profile("dev")` nos componentes ou nas classes de configuração.

# Anotações

O Spring é amplamente baseado no uso de **anotações**. As anotações são indicadas pelo símbolo `@` e são colocadas **em cima das classes, métodos ou campos**.

Essas anotações configuram o comportamento da classe ou método e são usadas para diversos propósitos, como injeção de dependência, configuração de rotas, tratamento de exceções, entre outros.

# Dependências

| Dependência              | Descrição                                                                                       |
|--------------------------|-------------------------------------------------------------------------------------------------|
| **Spring Boot DevTools**  | Ferramenta que facilita o desenvolvimento, com funcionalidades como reinicialização automática. |
| **Spring Web**            | Módulo para a criação de aplicações web, incluindo suporte a RESTful APIs, processamento de requisições HTTP e integração com MVC. |
| **Lombok**                | Biblioteca que reduz o _boilerplate code_ gerando automaticamente getters, setters, construtores e outros métodos comuns. |

---

Essas dependências podem ser adicionadas ao arquivo `pom.xml` (se você estiver usando Maven) ou `build.gradle` (se estiver usando Gradle) para facilitar o desenvolvimento com Spring Boot e suas ferramentas adicionais.



# Anotações (Configurações das classes)

| Anotação                               | Descrição                                                                                                                                                                                                                       |
|----------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **@SpringBootApplication**             | Combina `@Configuration`, `@EnableAutoConfiguration` e `@ComponentScan`. Define a classe principal da aplicação Spring Boot, habilitando a auto-configuração e permitindo o escaneamento dos pacotes.                                                                  |
| **@RestController**                    | Combina `@Controller` e `@ResponseBody`, permitindo a criação de um controlador que responde a requisições HTTP e retorna dados diretamente no corpo da resposta (como JSON ou XML).                                             |
| **@Autowired**                         | Injeta automaticamente as dependências nas classes. O Spring gerencia a inicialização e a injeção de instâncias necessárias para essa classe.                                                                                    |
| **@Bean**                              | Indica que um método vai instanciar, configurar e inicializar um novo bean para o Spring gerenciar. Usado para instâncias de classes que não podem ser gerenciadas automaticamente pelo Spring.                                   |
| **@Configuration**                     | Define uma classe como uma classe de configuração, permitindo que métodos que definem beans sejam usados para configurar dependências e injeções não padrão no Spring.                                                            |
| **@Service**                           | Indica que a classe é um serviço e contém a lógica de negócios. O Spring gerencia a instância desta classe. Segue o padrão MVC, onde o serviço realiza as operações de negócio.                                                   |
| **@RequestBody**                       | Anotação usada em parâmetros de métodos de controladores para indicar que o corpo da requisição HTTP (em requisições POST) deve ser convertido e injetado no parâmetro correspondente.                                            |
| **@Getter, @Setter, @AllArgsConstructor** (Lombok) | Anotações do Lombok que automaticamente geram getters, setters e construtores, eliminando a necessidade de escrever código _boilerplate_ para esses métodos.                                                                      |
| **@PathVariables**                     | Anotação usada para capturar e injetar valores passados pela URL na assinatura do método do controlador. Geralmente usado para parâmetros de caminho, como IDs em rotas RESTful.                                                   |

---

OBS: Com o uso de `@RestController`, estamos focando na criação de APIs que lidam apenas com a lógica e a conexão com o banco de dados, retornando respostas em JSON ou XML, sem a necessidade de renderizar páginas HTML (responsabilidade do frontend).


# Stateless (APIs Rest) vs Statefull

Stateless: Cada nova requisição é enviada as informações necessárias (tokens) para fazer o que é preciso.
Statefull: O estado do cliente é mantindo no servidor.

