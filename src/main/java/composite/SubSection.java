package composite;

public class SubSection implements BookComponent {
    private int pageNumber;


    @Override
    public int pageCounter() {
        return this.pageNumber;
    }
}
