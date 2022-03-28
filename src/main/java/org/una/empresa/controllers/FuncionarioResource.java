package org.una.empresa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.una.empresa.domain.Funcionario;
import org.una.empresa.services.FuncionarioService;
import org.una.empresa.services.interfaces.FuncionarioServiceAPI;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioResource {

//    @Autowired
//    private FuncionarioService funcionarioService;
//
//    @GetMapping
//    public @ResponseBody
//    HttpEntity<List<Funcionario>> findAll() {
//
//        List<Funcionario> funcionarios = funcionarioService.findAll();
//
//        if(funcionarios.isEmpty()) {
//            return ResponseEntity.noContent().build();
//        }
//
//        return ResponseEntity.ok(funcionarios);
//    }
//
//    @GetMapping(value = "/{id}")
//    public @ResponseBody
//    HttpEntity<Funcionario> get(@PathVariable(name = "id") Long id) {
//
//        Funcionario funcionario = funcionarioService.get(id);
//        return ResponseEntity.ok(funcionario);
//    }
//
//    @PostMapping
//    public @ResponseBody
//    HttpEntity<Funcionario> create(@RequestBody Funcionario funcionario) {
//
//        funcionario = funcionarioService.create(funcionario);
//        return ResponseEntity.ok(funcionario);
//    }
//
//    @PutMapping(value = "/{id}")
//    public @ResponseBody
//    HttpEntity<Funcionario> update(@PathVariable(name = "id") Long id,
//                                @RequestBody Funcionario funcionario) {
//
//        funcionario.setId(id);
//        funcionarioService.update(funcionario);
//        return ResponseEntity.noContent().build();
//    }
//
//    @DeleteMapping(value = "/{id}")
//    public @ResponseBody
//    HttpEntity<Funcionario> remove(@PathVariable(name = "id") Long id) {
//
//        funcionarioService.remove(id);
//        return ResponseEntity.ok().build();
//    }

}
