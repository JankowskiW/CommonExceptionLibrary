package com.wj.shared.definition;

public class RequestValidationException extends RuntimeException {

    private static final String ALREADY_EXISTS_MESSAGE_TEMPLATE = "%s already exists (%s: %s)";
    private static final String NOT_FOUND_MESSAGE_TEMPLATE = "%s does not exist (%s: %s)";

    public RequestValidationException(String message) {
        super(message);
    }

    public static RequestValidationException alreadyExists(String entityName, String fieldName, String fieldValue) {
        String message = String.format(ALREADY_EXISTS_MESSAGE_TEMPLATE, entityName, fieldName, fieldValue);
        return new RequestValidationException(message);
    }

    public static RequestValidationException notFound(String entityName, String fieldName, long fieldValue) {
        String message = String.format(NOT_FOUND_MESSAGE_TEMPLATE, entityName, fieldName, fieldValue);
        return new RequestValidationException(message);
    }

    public static RequestValidationException notFound(String entityName, String fieldName, String fieldValue) {
        String message = String.format(NOT_FOUND_MESSAGE_TEMPLATE, entityName, fieldName, fieldValue);
        return new RequestValidationException(message);
    }
}