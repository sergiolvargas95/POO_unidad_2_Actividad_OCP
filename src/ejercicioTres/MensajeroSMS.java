package ejercicioTres;

public class MensajeroSMS extends Mensajero {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando mensaje por SMS " + mensaje);
    }
}
