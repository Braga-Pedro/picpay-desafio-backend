# Anotações
## Dados
### Repositories
- são interfaces do JPA Repository
- As querys e consultas de manipulação de tabelas e colunas do banco de dados ficam no diretório `repository` ?? Eloquent do laravel, pois é responsável pela manipulação de consultas ao banco de dados

# Estrutura de diretórios do Spring

src/main/java/com/seuapp <br>
├── config/                 # Configurações gerais do projeto  <br>
│   ├── SecurityConfig.java  # Configuração de segurança (JWT, filtros, etc.) <br>
│   ├── WebConfig.java       # Configuração de CORS ou outros filtros globais <br>
├── controllers/            # Controladores da API (equivalente a Laravel Controllers) <br>
│   ├── UserController.java <br>
├── dto/                    # Objetos de Transferência de Dados (opcional, para validações e entrada/saída de dados) <br>
│   ├── UserRequest.java     # Para criação/edição de usuários <br>
│   ├── UserResponse.java    # Para retorno estruturado <br>
├── exceptions/             # Manipuladores de exceções customizadas <br>
│   ├── GlobalExceptionHandler.java <br>
│   ├── UserNotFoundException.java <br>
├── models/                 # Entidades JPA (equivalente a Laravel Models) <br>
│   ├── User.java <br>
├── repositories/           # Repositórios (equivalente ao Eloquent no Laravel) <br>
│   ├── UserRepository.java <br>
├── services/               # Lógica de negócios (equivalente ao Laravel Services ou lógica nos Controllers) <br>
│   ├── UserService.java <br>
│   ├── AuthService.java <br>
├── utils/                  # Utilitários para o projeto (helpers, formatadores, etc.) <br>
│   ├── JwtUtil.java <br>
├── SeuAppApplication.java  # Classe principal para iniciar o Spring Boot <br>
