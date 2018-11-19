Playing with Jackson Polymorphic Deserialization
===============

http://localhost:8080/content provides List with two types of Content
- Episode 
- Series

Content is specified by contentType property in the response and determines class to be used for deserialization
- contentType = "episode" -> pl.dk.deserplay.Episode
- contentType = "series" -> pl.dk.deserplay.Series


## Requirements

* Java 11
* Lombok Plugin (when using ide - enable annotation processing in IntelliJ)

## To run
* Run DeserApp, hit http://localhost:8080/content to get all content types (episode, series) 
* Run DeserPlaySpec to hit content endpoint by restTemplate end deserialize to different classes depending on contentType property 

## links
https://github.com/FasterXML/jackson-docs/wiki/JacksonPolymorphicDeserialization


