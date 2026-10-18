public class ConsList extends AList {
    private Stop first;
    private AList rest;

    public ConsList(Stop first, AList rest){
        this.first = first;
        this.rest = rest;
    }

}
