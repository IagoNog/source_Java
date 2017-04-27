package lde;

/**
 * 
 * @author Iago Nogueira <iagonogueira227@gmail.com>
 */
public class No {
    private No prox;
    private No ant;
    private Object elemento;
    
    public No(Object item){
        this.elemento = item;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    public No getAnt() {
        return ant;
    }

    public void setAnt(No ant) {
        this.ant = ant;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }
}
