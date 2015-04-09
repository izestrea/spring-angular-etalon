package com.reigncode.etalon.web;

import com.reigncode.etalon.exceptions.CustomException;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by denchiosa on 4/9/15.
 */
@ControllerAdvice
public class JsonErrorController implements ErrorController {

    @RequestMapping(value = IndexController.PATH)
    @ResponseBody
    @ExceptionHandler(value = {RuntimeException.class})
    public ResponseEntity<String> jsonError(RuntimeException e) {
        if (e instanceof CustomException) {
            return new ResponseEntity<>("custom exception: " + e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(e.getMessage(), HttpStatus.METHOD_NOT_ALLOWED);
    }

    @Override
    public String getErrorPath() {
        return IndexController.PATH;
    }
}
