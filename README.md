## Aplicação Spring Boot Com Java

## Objetivo
Criar uma Api Rest que disponibilize um Endpoint **/products**, para obter uma lista de produtos com suas respectivas categorias

## Diagrama de domínio 

![image](https://github.com/victorvaz001/ApiRestJavaSpringBoot/assets/42657636/81fec1c1-2158-46d6-b430-73f3d7d50f07)

## Classes
- ProductController -> Classe que disponibiliza o metodo com a lsita de produtos
-  Department -> Entidade que contem os atributos do departamento
-  Product -> Entidade que contem os atributos do produto e o **relacionamento** entre **Departamento**

## Annotations
  - @RestController ->  Configura a classe **(ProductController)** para responder na Api
  - @RequestMapping -> Mapear o Endpoint **/products** na classe **(ProductController)**
  - @GetMapping -> Configura o metodo **List<Product>** para que ele responda na API Rest

## Teste no Postman
- EndPoint: http://localhost:8080/products)
- Metodo: Get
- Retorna os produtos com suas respectivas categorias

  ![image](https://github.com/victorvaz001/ApiRestJavaSpringBoot/assets/42657636/398a9f39-7507-4844-b441-e92ebf335904)
