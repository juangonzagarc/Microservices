package org.example.model;

public class NotificacionResponse {
    private String response;
    private int status;

    public NotificacionResponse() {}
    public NotificacionResponse(String response, int status) {
        this.response = response;
        this.status = status;
    }
    public String getResponse() { return response; }
    public void setResponse(String response) { this.response = response; }
    public int getStatus() { return status; }
    public void setStatus(int status) { this.status = status; }
}
