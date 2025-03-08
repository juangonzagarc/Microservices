package org.example.service;

import org.example.model.NotificacionRequest;
import org.example.model.NotificacionResponse;
import org.springframework.stereotype.Service;

@Service
public class AldeamoService {

    public NotificacionResponse procesarNotificacion(NotificacionRequest request) {
        System.out.println("Enviando notificación a: " + request.getDestinatario());
        return new NotificacionResponse("Aldeamo", 200);
    }
}
