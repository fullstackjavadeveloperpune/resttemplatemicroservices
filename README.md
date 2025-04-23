# resttemplatemicroservices
Spring Boot with Microservices using RestTemplate

Microservices-> 2 or more Spring Boot module they will communicate with each other

Services-
1. DepartmentService- 9191
2. EmployeeService- 9192
3. ServiceRegistry- 8761
4. APIGateway- 2025

Service Communication- 
1. RestTemplate
2. Feign Client

Design Pattern-
1. SAGA Design Pattern- Service per db
2. Circuit Breaker- 3 states
   A. Close 
   B. Open 
   C. Half-Open
