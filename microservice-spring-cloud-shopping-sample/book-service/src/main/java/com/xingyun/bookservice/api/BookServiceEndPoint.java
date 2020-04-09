package com.xingyun.bookservice.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qing-feng.zhao
 */
@RestController
public class BookServiceEndPoint {

    @GetMapping(value = "/available")
    public String available() {
        return "Spring in Action";
    }

    @GetMapping(value = "/checked-out")
    public String checkedOut() {
        return "Spring Boot in Action";
    }


    @GetMapping(value = "/")
    public String home(){
        return "Spring Boot Book Service";
    }
}
