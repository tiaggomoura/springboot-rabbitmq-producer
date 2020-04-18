### Projeto para Estudo de Mensageria com Spring Boot + RabbitMQ (Producer &amp; Consumer)

- Crie um container no Docker para testar as aplicações
    - sudo docker run -d -p 15672:15672 -p 5672:5672 --name rabbitmq rabbitmq:3-management
    - Acesse pelo seu http://localhost:15672
        - user: guest
        - pass: guest
- Se precise executar algo no console do RabbitMQ no container basta executar o seguinte comando para habilitá-lo:
    - sudo docker exec -it rabbtitmq bash

