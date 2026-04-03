Сервис запустится на порту 8081.

## Работающий endpoint
http://localhost:8081/api/data  
Ответ: {"message":"Real external data"}

## Endpoint с ошибкой
http://localhost:8081/api/fail  
Ответ: 500 Internal Server Error

Связь с CircuitBreakerExample  
Этот сервис вызывается из CircuitBreakerExample (порт 8080).

Подробнее: CircuitBreakerExample/README.md