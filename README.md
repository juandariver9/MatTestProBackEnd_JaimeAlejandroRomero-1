# Sistema de Ensayos de Tracción

Este proyecto es una aplicación Spring Boot que gestiona ensayos de tracción de materiales, permitiendo realizar cálculos automáticos de esfuerzo, deformación y módulo de elasticidad.

## Características Principales

- Gestión de materiales con propiedades mecánicas
- Registro de ensayos de tracción
- Cálculo automático de:
  - Esfuerzo (σ = F/A)
  - Deformación (ε = ΔL/L₀)
  - Módulo de elasticidad (E = σ/ε)
  - Factor de seguridad
- API RESTful para integración con frontend
- Soporte CORS para desarrollo local

## Tecnologías Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL/PostgreSQL (configurable)
- RESTful API

## Estructura del Proyecto

```
src/main/java/com/proyecto/math/
├── Config/
│   └── WebConfig.java
├── Controller/
│   ├── EnsayoTraccionController.java
│   ├── MaterialController.java
│   └── ResultadoCalculoController.java
├── Model/
│   ├── EnsayoTraccion.java
│   ├── Material.java
│   └── ResultadoCalculo.java
├── Repository/
│   ├── EnsayoTraccionRepository.java
│   ├── MaterialRepository.java
│   └── ResultadoCalculoRepository.java
├── Service/
│   ├── EnsayoTraccionService.java
│   ├── MaterialService.java
│   └── ResultadoCalculoService.java
└── MathApplication.java
```

## Endpoints de la API

### Materiales
- `GET /api/materiales` - Obtener todos los materiales
- `GET /api/materiales/{id}` - Obtener material por ID
- `POST /api/materiales` - Crear nuevo material
- `PUT /api/materiales/{id}` - Actualizar material
- `DELETE /api/materiales/{id}` - Eliminar material

### Ensayos de Tracción
- `GET /api/ensayos` - Obtener todos los ensayos
- `GET /api/ensayos/{id}` - Obtener ensayo por ID
- `POST /api/ensayos` - Crear nuevo ensayo
- `PUT /api/ensayos/{id}` - Actualizar ensayo
- `DELETE /api/ensayos/{id}` - Eliminar ensayo

### Resultados de Cálculo
- `GET /api/resultados` - Obtener todos los resultados
- `GET /api/resultados/{id}` - Obtener resultado por ID
- `POST /api/resultados` - Crear nuevo resultado
- `PUT /api/resultados/{id}` - Actualizar resultado
- `DELETE /api/resultados/{id}` - Eliminar resultado

## Requisitos Previos

- Java 17 o superior
- Maven
- Base de datos MySQL o PostgreSQL

## Configuración

1. Clonar el repositorio
2. Configurar la base de datos en `application.properties`
3. Ejecutar `mvn spring-boot:run`

## Desarrollo

El proyecto está configurado para permitir CORS desde `http://127.0.0.1:5500` para desarrollo local.

## Contribución

1. Fork el proyecto
2. Crear una rama para tu feature (`git checkout -b feature/AmazingFeature`)
3. Commit tus cambios (`git commit -m 'Add some AmazingFeature'`)
4. Push a la rama (`git push origin feature/AmazingFeature`)
5. Abrir un Pull Request 
