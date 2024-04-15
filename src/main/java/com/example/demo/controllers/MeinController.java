
package com.example.demo.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeinController {

    @GetMapping("/hallo")
    public String hallo() {
        return "Hallo, Welt!";
    }

    @GetMapping("/hallojson")
    public Map<String, Object> halloJson() {
        Map<String, Object> response = new HashMap<>();
        response.put("nachricht", "Hallo, Welt!");
        response.put("zeit", System.currentTimeMillis());
        // add a json object
        Map<String, Object> foo = new HashMap<>();
        foo.put("bar", "baz");
        response.put("foo", foo);
        return response;
    }

    @GetMapping(value = "/hallohtml", produces = "text/html")
    public String halloHtml() {
        return "<html><body><h1>Hallo, Welt!</h1></body></html>";
    }
}