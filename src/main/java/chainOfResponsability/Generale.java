package chainOfResponsability;

public class Generale extends Soldier {
    private final int stipendio = 5000;
    private Soldier superiore;
    private String mansione;

    public void doCheck(int stipendio) {
        if (stipendio <= this.stipendio) {
            System.out.println("percepisce abbastanza");
        }
    }


    @Override
    public void goNext(int stipendio) {
        if (this.superiore != null) {
            this.superiore.doCheck(stipendio);
        } else {
            System.out.println("la gerarchia è finita");
        }
    }


}
