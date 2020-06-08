# Sprint Boot QuickStart

## Students API

### Author: Abdulrhman al-harasis

### Links and Resources

- [API Documentation](https://abdulrhamn@bitbucket.org/abdulrhamn/studentsapi.git)
- [submission repository](https://abdulrhamn@bitbucket.org/abdulrhamn/studentsapi.git)
- [Deployment Link](http://xyz.com) (when applicable)


### Setup

#### `application.properties` requirements 

- `server.port` - Port Number
- `spring.jpa.hibernate.ddl-auto=create` - initialize the schema
##### POSTGRES SQL config
- `spring.datasource.url` - the URI for Postgres SQL Database
- `spring.datasource.username` - DB user name
- `spring.datasource.password` - DB password


#### How to initialize/run your application

- `mvn spring-boot:run` - or - `java -jar target\students-0.0.1-SNAPSHOT.jar`


#### Tests
- Tested with Swagger, results in the `swagger.jso` [File](swagger.json) 


#### UML
[Link to the UML](https://app.lucidchart.com/invitations/accept/04ce584c-231c-4483-b0f3-f3d25c1e1469)
