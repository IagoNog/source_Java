/**
 * 
 * @author Iago Nogueira <iagonogueira227@gmail.com>
 */
public class No {

    private No next;
    private int item;
    
    public No ( int item ) {
        this.item = item;
    }
    
    public No ( int item, No next ) {
        this.item = item;
        this.next = next;
    }

    public No getNext() {
        return next;
    }

    public void setNext(No next) {
        this.next = next;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }    
}
