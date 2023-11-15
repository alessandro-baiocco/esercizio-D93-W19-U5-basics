package adapter;


import java.time.LocalDate;

public class Info implements DataSource {
    private String nome;
    private String cogNome;
    private LocalDate dataDiNascita;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCogNome() {
        return cogNome;
    }

    public void setCogNome(String cogNome) {
        this.cogNome = cogNome;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    @Override
    public String getNomeCompleto() {
        return this.nome + " " + this.cogNome;
    }

    @Override
    public int getEta() {
        return LocalDate.now().getYear() - dataDiNascita.getYear();
    }
}
