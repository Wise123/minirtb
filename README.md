# Mini Realtimeboard

## Запуск приложения
Для запуска приложения требуются сконфигурированные Java 8+ и Maven а также выход в интернет 

* Чтобы запустить приложение требуется в директории в которой находится pom.xml выполнить команду `mvn spring-boot:run`

После этого апи станет доступен на порту 8080 (например http://localhost:8080/widget/byFilters)
Кроме того в проекте сконфигурирован swagger-ui (http://localhost:8080/swagger-ui.html) так что потестить апи можно из него

## Запуск тестов
* Чтобы выполнить тесты нужно в той же директории выполнить `mvn test`