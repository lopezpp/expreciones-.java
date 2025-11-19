package fotoexpress;

public class SoporteTicket {
    private int idTicket;
    private String descripcionProblema;

    public SoporteTicket(int idTicket, String descripcionProblema) {
        this.idTicket = idTicket;
        this.descripcionProblema = descripcionProblema;
    }

    public void mostrarTicket() {
        System.out.println("🎫 Ticket #" + idTicket + ": " + descripcionProblema);
    }
}
