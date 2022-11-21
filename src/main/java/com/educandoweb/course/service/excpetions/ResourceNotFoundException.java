package com.educandoweb.course.service.excpetions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException (Object id) {
        super("Resource not found.ID" + id);
    }
}
