package com.wj.shared.definition;

public class ResourceNotFoundException extends RuntimeException {

    private static final String NOT_FOUND_MESSAGE_TEMPLATE = "%s does not exist (%s: %s)";

    public ResourceNotFoundException(String message) {
        super(message);
    }

    public static ResourceNotFoundException notFound(String entityName, String fieldName, long fieldValue) {
        String message = String.format(NOT_FOUND_MESSAGE_TEMPLATE, entityName, fieldName, fieldValue);
        return new ResourceNotFoundException(message);
    }

    public static ResourceNotFoundException notFound(String entityName, String fieldName, String fieldValue) {
        String message = String.format(NOT_FOUND_MESSAGE_TEMPLATE, entityName, fieldName, fieldValue);
        return new ResourceNotFoundException(message);
    }
}
