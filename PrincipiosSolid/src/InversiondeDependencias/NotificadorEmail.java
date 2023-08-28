package InversiondeDependencias;


class NotificadorEmail implements INotificador {
    private String correoSoporte;

    public NotificadorEmail(String correoSoporte) {
        this.correoSoporte = correoSoporte;
    }

    public void enviarNotificacion(String mensaje) {

        String asunto = "Notificación de Pedido";
        String cuerpo = mensaje + "\nPara cualquier consulta, contáctenos en: " + correoSoporte;


        System.out.println("Enviando correo a: cliente@example.com");
        System.out.println("Asunto: " + asunto);
        System.out.println("Cuerpo: " + cuerpo);
        System.out.println("Correo electrónico enviado");
    }
}