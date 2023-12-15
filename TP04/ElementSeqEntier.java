public class ElementSeqEntier {
    private int x;
    private ElementSeqEntier next = null;

    public  ElementSeqEntier (int x){
        this.x = x;
    }

    public  ElementSeqEntier (int x, ElementSeqEntier next){
        this.x = x;
        this.next = next;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public ElementSeqEntier getNext() {
        return next;
    }

    public void setNext(ElementSeqEntier next) {
        this.next = next;
    }
}
