# CommonExceptionLibrary
A library of common exceptions that are useful across various types of applications.

## Exceptions

1) **RequestValidationException**: 

    An exception to be used when request validation (especially **HTTP** request validation) fails. 
    
    You can throw this exception with a **400 BAD REQUEST** response code when custom validation fails.


2) **ResourceNotFoundException**:

    An exception to be used when a requested resource is not found. 
    
    For example, if you call [**GET] /resource/{id}** and the resource with the given **ID** 
    does not exist, you can throw this exception with a **404 NOT FOUND** response code.

## Changelog

### Version 1.0.0
- RequestValidationException
- ResourceNotFoundException