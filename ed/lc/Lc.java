/**
 *
 * @author Igao Nogueira <iagonogueira227@gmail.com>
 */
public class Lc {

    private No inicio;
    private int size;
    
    public Lc () {
        super();
    }
    
    public void add ( int valor ) {
        
        No aux = inicio;
        No node = new No( valor );
        if (this.size == 0) {
            this.inicio = node;
            node.setNext(this.inicio);
            this.size++;
            
        } else {
            while (aux.getNext() != this.inicio ) {
                aux = aux.getNext();
            }
            node.setNext(this.inicio);
            aux.setNext(node);
            this.size++;
            
        }
    }
    
    public void add ( int array[] ) {
        
        No aux = this.inicio;
        for ( int i = 0; i <= array.length; i++ ) {
            No node = new No( array[i] );
            
            while ( aux.getNext() != this.inicio ) {
                aux = aux.getNext();
            }
            node.setNext( this.inicio );
            aux.setNext(node);
        }
        this.size += array.length;
    }
    
    public void add ( Lc lista ) {
        
        No aux = lista.getInicio();
        while ( aux.getNext() != lista.getInicio() ) {
            aux = aux.getNext();
        }
        aux.setNext(this.inicio);
        
        No node_aux = this.inicio;
        while ( node_aux.getNext() != this.inicio ) {
            node_aux = node_aux.getNext();
        }
        node_aux.setNext(lista.getInicio());
        this.size += lista.size();
        
    }
    
    public void remove (int pos) {
        
        No aux = this.inicio;
        if ( this.size == 0 ) {
            throw new IllegalArgumentException("A lista está vazia");
            
        } else if ( pos == this.size ) {
            this.inicio = aux.getNext();
            this.size--;
            
        } else if ( pos < 0 && pos > this.size ) {
            throw new IllegalArgumentException("Posição inválida");
            
        } else {
            for ( int i = 0; i < (pos-1); i++ ) {
                aux = aux.getNext();
            }
            aux.setNext(aux.getNext().getNext());
            this.size--;
            
        }
    }
    
    public int size() {
        return this.size;
    }
    
    public void print() {
        this.print(this.inicio);
    }
    
    private void print (No node) {
        System.out.println(node.getItem());
        if ( node.getNext() != this.inicio ) {
            this.print(node.getNext()); //Recursivo
        }
    }

    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }
    
}
