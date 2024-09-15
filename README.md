# CommonExceptionLibrary

A library of common exceptions that are useful across various types of applications.


## Exceptions

1) **RequestValidationException**: 

    An exception to be used when request validation (especially **HTTP** request validation) fails. 
    
    You can throw this exception with a **400 BAD REQUEST** response code when custom validation fails.


2) **ResourceNotFoundException**:

    An exception to be used when a requested resource is not found. 
    
    For example, if you call **[GET] /resource/{id}** and the resource with the given **ID** 
    does not exist, you can throw this exception with a **404 NOT FOUND** response code.


3) **ResourceExistsException**:

    An exception tobe used when a requested resource exists in database.

    For example, if you call **[GET] /resource/{id}** and the resource with the given **ID**
    already exists, you can throw this exception with a **409 CONFLICT** response code.


## Instructions of usage

You can use static methods of exceptions to create an instance with predefined message templates, 
or you can create a new exception instance with a custom message by using its constructor.


## Changelog

### Version 1.0.0
- Add **RequestValidationException** with following methods:
  - _RequestValidationException alreadyExists(String, String, String)_
  - _RequestValidationException notFound(String, String, long)_
  
- Add **ResourceNotFoundException** with following methods:
  - _ResourceNotFoundException notFound(String, String, long)_

### Version 1.1.0
- Add **ResourceExistsException** with following methods:
  - _RequestValidationException exists(String, String, long)_
  - _RequestValidationException exists(String, String, String)_
  
- Add following method to **RequestValidationException**:
  - _RequestValidationException notFound(String, String, String)_

- Add following method to **ResourceNotFoundException**:
  - _ResourceNotFoundException notFound(String, String, String)_