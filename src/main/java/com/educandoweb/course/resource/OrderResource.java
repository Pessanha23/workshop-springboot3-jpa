package com.educandoweb.course.resource;


import com.educandoweb.course.entities.Order;
import com.educandoweb.course.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    @Autowired
    private OrderService service;

    @GetMapping
    public ResponseEntity<List<Order>> findAll() {
        List<Order> list = service.findAll();
        // Em uma boa pratica, criamos uma lista aqui conectada a classe OrderJson, no caderno tem melhor explicado, mas é uma má pratica retornar entidade;
        //Exist um metódo aqui para realizar a maneira correta, uam boa prática, uma funcao depara;
        return  ResponseEntity.ok().body(list);
    }

    // indica que dessa maneira a requisição vai aceitar um "id" dentro da url;
    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id) {
        Order obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
