package com.reigncode.etalon.web;

import com.reigncode.etalon.exceptions.CustomException;
import com.reigncode.etalon.exceptions.CustomJsonException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class IndexController implements ErrorController {

    private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);
    private static final String PATH = "/error";
    private static final String HOME_PAGE = "index.html";


    @RequestMapping(value = PATH, produces = "text/html")
    public ModelAndView errorHtml(final HttpServletRequest request) {
        String path = (String) request.getAttribute(
                HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE);
        LOGGER.error("redirecting..." + path);
        return new ModelAndView(HOME_PAGE);
    }


    @RequestMapping(value = PATH)
    @ResponseBody
    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<CustomJsonException> error(HttpServletRequest request, Exception e) {
        HttpStatus status = getStatus(request);
        LOGGER.error("error status: " + status + " and exception is " + e.getMessage());
        if (e instanceof CustomException) {
            return new ResponseEntity<>(new CustomJsonException((CustomException) e), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(status);
    }


    @Override
    public String getErrorPath() {
        return PATH;
    }


    private HttpStatus getStatus(HttpServletRequest request) {
        Integer statusCode = (Integer) request
                .getAttribute("javax.servlet.error.status_code");
        if (statusCode != null) {
            try {
                return HttpStatus.valueOf(statusCode);
            } catch (Exception ex) {
            }
        }
        return HttpStatus.INTERNAL_SERVER_ERROR;
    }

}