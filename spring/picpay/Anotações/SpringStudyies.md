# Anotações
## Dados
### Repositories
- são interfaces do JPA Repository
- As querys e consultas de manipulação de tabelas e colunas do banco de dados ficam no diretório `repository` ?? Eloquent do laravel, pois é responsável pela manipulação de consultas ao banco de dados

# Estrutura de diretórios do Spring
`
src/main/java/com/seuapp
├── config/                 # Configurações gerais do projeto
│   ├── SecurityConfig.java  # Configuração de segurança (JWT, filtros, etc.)
│   ├── WebConfig.java       # Configuração de CORS ou outros filtros globais
├── controllers/            # Controladores da API (equivalente a Laravel Controllers)
│   ├── UserController.java
├── dto/                    # Objetos de Transferência de Dados (opcional, para validações e entrada/saída de dados)
│   ├── UserRequest.java     # Para criação/edição de usuários
│   ├── UserResponse.java    # Para retorno estruturado
├── exceptions/             # Manipuladores de exceções customizadas
│   ├── GlobalExceptionHandler.java
│   ├── UserNotFoundException.java
├── models/                 # Entidades JPA (equivalente a Laravel Models)
│   ├── User.java
├── repositories/           # Repositórios (equivalente ao Eloquent no Laravel)
│   ├── UserRepository.java
├── services/               # Lógica de negócios (equivalente ao Laravel Services ou lógica nos Controllers)
│   ├── UserService.java
│   ├── AuthService.java
├── utils/                  # Utilitários para o projeto (helpers, formatadores, etc.)
│   ├── JwtUtil.java
├── SeuAppApplication.java  # Classe principal para iniciar o Spring Boot
`
