package com.wj.shared.definition;

public class ResourceExistsException extends RuntimeException {

    private static final String EXISTS_MESSAGE_TEMPLATE = "%s exists (%s: %s)";

    public static RequestValidationException exists(String entityName, String fieldName, long fieldValue) {
        String message = String.format(EXISTS_MESSAGE_TEMPLATE, entityName, fieldName, fieldValue);
        return new RequestValidationException(message);
    }

    public static RequestValidationException exists(String entityName, String fieldName, String fieldValue) {
        String message = String.format(EXISTS_MESSAGE_TEMPLATE, entityName, fieldName, fieldValue);
        return new RequestValidationException(message);
    }
}
