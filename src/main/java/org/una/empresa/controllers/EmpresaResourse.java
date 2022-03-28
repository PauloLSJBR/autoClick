package org.una.empresa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.una.empresa.domain.Empresa;
import org.una.empresa.services.interfaces.EmpresaServiceAPI;

import java.util.List;

@RestController
@RequestMapping("/empresas")
public class EmpresaResourse {

    @Autowired
    private EmpresaServiceAPI empresaService;

    @GetMapping
    public @ResponseBody
    HttpEntity<List<Empresa>> findAll() {

        List<Empresa> empresas = empresaService.findAll();

        if(empresas.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(empresas);
    }

    @GetMapping(value = "/{id}")
    public @ResponseBody
    HttpEntity<Empresa> get(@PathVariable(name = "id") Long id) {

        Empresa banda = empresaService.get(id);
        return ResponseEntity.ok(banda);
    }

    @PostMapping
    public @ResponseBody
    HttpEntity<Empresa> create(@RequestBody Empresa empresa) {

        empresa = empresaService.create(empresa);
        return ResponseEntity.ok(empresa);
    }

    @PutMapping(value = "/{id}")
    public @ResponseBody
    HttpEntity<Empresa> update(@PathVariable(name = "id") Long id,
                             @RequestBody Empresa empresa) {

        empresa.setId(id);
        empresaService.update(empresa);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping(value = "/{id}")
    public @ResponseBody
    HttpEntity<Empresa> remove(@PathVariable(name = "id") Long id) {

        empresaService.remove(id);
        return ResponseEntity.ok().build();
    }

}
