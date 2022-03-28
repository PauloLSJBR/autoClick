package org.una.empresa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.una.empresa.domain.Endereco;
import org.una.empresa.services.interfaces.EnderecoServiceAPI;

import java.util.List;

@RestController
@RequestMapping("/enderecos")
public class EnderecoResource {

//    @Autowired
//    private EnderecoServiceAPI enderecoService;
//
//    @GetMapping
//    public @ResponseBody
//    HttpEntity<List<Endereco>> findAll() {
//
//        List<Endereco> enderecos = enderecoService.findAll();
//
//        if(enderecos.isEmpty()) {
//            return ResponseEntity.noContent().build();
//        }
//
//        return ResponseEntity.ok(enderecos);
//    }
//
//    @GetMapping(value = "/{id}")
//    public @ResponseBody
//    HttpEntity<Endereco> get(@PathVariable(name = "id") Long id) {
//
//        Endereco endereco = enderecoService.get(id);
//        return ResponseEntity.ok(endereco);
//    }
//
//    @PostMapping
//    public @ResponseBody
//    HttpEntity<Endereco> create(@RequestBody Endereco endereco) {
//
//        endereco = enderecoService.create(endereco);
//        return ResponseEntity.ok(endereco);
//    }
//
//    @PutMapping(value = "/{id}")
//    public @ResponseBody
//    HttpEntity<Endereco> update(@PathVariable(name = "id") Long id,
//                               @RequestBody Endereco endereco) {
//
//        endereco.setId(id);
//        enderecoService.update(endereco);
//        return ResponseEntity.noContent().build();
//    }
//
//    @DeleteMapping(value = "/{id}")
//    public @ResponseBody
//    HttpEntity<Endereco> remove(@PathVariable(name = "id") Long id) {
//
//        enderecoService.remove(id);
//        return ResponseEntity.ok().build();
//    }

}
