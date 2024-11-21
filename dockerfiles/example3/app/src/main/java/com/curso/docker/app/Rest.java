package com.curso.docker.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.commons.lang3.StringUtils;


@RestController
public class Rest{

    @Value("${SALUDO: desde app spring desplegada en docker}")  // Default value en caso de que no se configure
    private String saludo;

    @GetMapping("/saludar")
    public String saludar()
    {
        if (StringUtils.isNotBlank(saludo)) {
            return "Saludos " + saludo;
        } else {
            return "Saludos desde app spring desplegada en docker";
        }
    }

}