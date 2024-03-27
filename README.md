# Swagger UI

## Problem Statement

Create a Swagger UI to generate interactive API documentation that lets your users try out the API calls directly in the browser.

## Run Swagger UI in browser

Hit the root URL : http://localhost:8080/swagger-ui.html in your browser after running the application.

**Congratulation! Swagger UI is created for Rest API is created successfully**

If you want the Swagger YAML file for the previously constructed Swagger UI, follow the instructions below.

1. Open the link in your browser : http://localhost:8080/v3/api-docs . You can see the JSON code of Swagger UI. Select it all.
2. Now in another tab open Swagger editor : https://editor.swagger.io/ . Paste all the JSON code on the left side. You will be asked <i>Would you like to convert your JSON into YAML?</i>, select OK.

**Congratulation! On Right side is the same Swagger UI and on the left side is you have your Json Swagger Code for YAML File ready.**

For webflux, use `spring openapi starter ui` dependency
```
   <dependency>
      <groupId>org.springdoc</groupId>
      <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
      <version>2.0.2</version>
   </dependency>
```