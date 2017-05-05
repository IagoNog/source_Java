package ordenacaoAlg;

/**
 * @author Iago Nogueira <iagonogueira227@gmail.com>
 *
 * @brief Classe BubbleSort
 * @date   05/05/2017
 */
public class BubbleSort {
    
    public BubbleSort( ) {
        super();
    }
    
    public void ordenation( Integer array[] ) { //BubbleSort
        
        int aux;
        boolean change = true;
        
        while ( change ) {
        
            change = false;
            
            for ( int i=0 ; i < ( array.length-1 ) ; i++ ) {

                if ( array[i] > array[i+1] ) { //Ordenação - low to high
                    aux = array[i];
                    array[i] = array[i+1];
                    array[i+1] = aux;
                    change = true;
                }
            }
        }
        
    }

}
