package com.example.demospringbootrest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No se encuentra el recurso solicitado")
public class NotFoundException extends RuntimeException{
}

