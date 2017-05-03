package lde;


/**
 *
 * @author Iago Nogueira <sguergachi at gmail.com>
 * @param <E>
 */

public interface ILde<E> {
    
    public void add(E item, int pos);
    public void add( E array[] );
    public void addInicio(E item);
    public void addFim(E item);
    public E remove(int pos);
    public E removeInicio();
    public E removeFim();
    public boolean busca(E item);
    public int tamanho();
    public boolean isEmpyt();
    public void print();
}
