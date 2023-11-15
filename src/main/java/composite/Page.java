package composite;

public class Page implements BookComponent {


    @Override
    public int pageCounter() {
        return 1;
    }
}
