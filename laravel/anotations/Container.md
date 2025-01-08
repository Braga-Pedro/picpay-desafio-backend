# Conteinização
Objetivo é containizar o projeto picpay, para isso será necessário configurar:
- php, dependencias e php fpm para funcionamento com nginx no container
- nginx pois no container é recomendado o uso de um servidor web
- postgre como banco de dados, configurar usuário e criar o database que será usado no sistema (picpay_database)
- copiar o laravel para o workdir /var/www/
- instalar o projeto

## DockerFile
- configuração do php fpm 
- copiar sistema para o workdir
- ajustes de permissões do workdir
- instalação do sistema

## docker-compose.yml
- configuração do postgre
    - configuração de usuário
    - criação do database
- configuração do nginx