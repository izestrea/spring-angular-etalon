package com.reigncode.etalon.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@RestController
public class IndexController implements ErrorController {

    private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);
    private static final String PATH = "/error";
    private static final String HOME_PAGE = "index.html";

    @RequestMapping(value = PATH)
    public ModelAndView error(final HttpServletRequest request) {
        String path = (String) request.getAttribute(
                HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE);
        LOGGER.error("redirecting..." + path);
        return new ModelAndView(HOME_PAGE);
    }


    @Override
    public String getErrorPath() {
        return PATH;
    }
}