public class EmailServis {
    private String smtpServer;
    private int port;

    public EmailServis(String smtpServer, int port) {
        this.smtpServer = smtpServer;
        this.port = port;
    }

    public void posaljiPotvrdu(String email) {
        System.out.println("Potvrda poslata na adresu: " + email);
    }

    public void posaljiObavestenjeORoku(String email, String naslovKnjige) {
        System.out.println("Obaveštenje: Rok za knjigu \"" + naslovKnjige + "\" ističe. Poslato na: " + email);
    }
}
