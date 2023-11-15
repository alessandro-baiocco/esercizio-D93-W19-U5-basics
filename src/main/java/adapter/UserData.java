package adapter;

public class UserData {
    private String nomeCompleto;
    private int eta;


    private void getData(DataSource ds) {
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }


}
