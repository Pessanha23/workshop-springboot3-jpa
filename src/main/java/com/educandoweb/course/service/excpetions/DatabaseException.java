package com.educandoweb.course.service.excpetions;

public class DatabaseException extends  RuntimeException{

    public DatabaseException(String msg){
        super(msg);
    }
}
