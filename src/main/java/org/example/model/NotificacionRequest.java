package org.example.model;

public class NotificacionRequest {
    private String mensaje;
    private String destinatario;

    public NotificacionRequest() {}

    public NotificacionRequest(String mensaje, String destinatario) {
        this.mensaje = mensaje;
        this.destinatario = destinatario;
    }

    public String getMensaje() { return mensaje; }
    public void setMensaje(String mensaje) { this.mensaje = mensaje; }

    public String getDestinatario() { return destinatario; }
    public void setDestinatario(String destinatario) { this.destinatario = destinatario; }
}
