package com.example.inicial1.controllers;

import com.example.inicial1.dtos.MutantRequest;
import com.example.inicial1.dtos.MutantResponse;
import com.example.inicial1.dtos.StatsResponse;
import com.example.inicial1.services.MutantService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mutant")
public class MutantController {

    private final MutantService mutantService;

    // Constructor para inyectar el servicio
    public MutantController(MutantService mutantService) {
        this.mutantService = mutantService;
    }

    @PostMapping
    public ResponseEntity<MutantResponse> checkMutant(@Valid @RequestBody MutantRequest mutantRequest) {
        boolean isMutant = mutantService.analyzeDna(mutantRequest.getDna());
        MutantResponse mutantResponse = new MutantResponse(isMutant);

        if (isMutant) {
            // Devuelve la respuesta con el objeto DnaResponse
            return ResponseEntity.status(HttpStatus.OK).body(mutantResponse);
        } else {
            // Devuelve la respuesta con el objeto DnaResponse
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(mutantResponse);
        }

    }

    @GetMapping
    public ResponseEntity<String> testEndpoint() {
        return ResponseEntity.ok("El endpoint /mutant está funcionando");
    }
}
