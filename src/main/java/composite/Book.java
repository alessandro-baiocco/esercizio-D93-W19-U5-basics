package composite;

import java.util.List;

public class Book implements BookComponent {
    private List<BookComponent> componentList;


    @Override
    public int pageCounter() {
        int pageNumber = 0;
        for (BookComponent bookComponent : componentList) {
            pageNumber += bookComponent.pageCounter();
        }
        return pageNumber;

    }
}
