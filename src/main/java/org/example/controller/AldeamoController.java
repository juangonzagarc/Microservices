package org.example.controller;

import org.example.model.NotificacionRequest;
import org.example.model.NotificacionResponse;
import org.example.service.AldeamoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notificacion")
public class AldeamoController {
    private final AldeamoService aldeamoService;

    public AldeamoController(AldeamoService aldeamoService) {
        this.aldeamoService = aldeamoService;
    }

    @PostMapping
    public ResponseEntity<NotificacionResponse> enviarNotificacion(@RequestBody NotificacionRequest request) {
        NotificacionResponse response = aldeamoService.procesarNotificacion(request);
        return ResponseEntity.ok(response);
    }
}
