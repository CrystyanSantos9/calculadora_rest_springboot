package dev.cryss.exception.handler;

import dev.cryss.exception.ExceptionResponse;
import dev.cryss.exception.UnsuportedMathOperationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@RestControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(Exception.class) //
    public final ResponseEntity<ExceptionResponse> handleAllException(Exception ex, WebRequest request) {
        ExceptionResponse exceptionResponse =
                new ExceptionResponse (
                        new Date (),
                        ex.getMessage (),
                        request.getDescription (false)
                );
        return new ResponseEntity<> (exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(value = UnsuportedMathOperationException.class) //
    public final ResponseEntity<ExceptionResponse> handleBadRequestException(UnsuportedMathOperationException ex, WebRequest request) {
        ExceptionResponse exceptionResponse =
                new ExceptionResponse (
                        new Date (),
                        ex.getMessage (),
                        request.getDescription (false)
                );
        return new ResponseEntity<> (exceptionResponse, HttpStatus.BAD_REQUEST);
    }

}
