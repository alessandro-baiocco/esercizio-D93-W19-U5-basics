package chainOfResponsability;

public abstract class Soldier {
    private int stipendio;
    private Soldier superiore;
    private String mansione;

    public abstract void doCheck(int stipendio);


    public void goNext(int stipendio) {
        if (this.superiore != null) {
            this.superiore.doCheck(stipendio);
        } else {
            System.out.println("la gerarchia è finita");
        }


    }

}
