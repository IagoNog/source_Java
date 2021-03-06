package lde;

/**
 * 
 * @author Iago Nogueira <iagonogueira227@gmail.com>
 * @param <E>
 */

public class Lde<E> implements ILde<E> {
    
    private No inicio;
    private No fim;
    private int tam;
    
    public Lde(){
        
        this.inicio = null;
        this.fim = null;
        this.tam = 0;
    }    
    
    @Override
    public void add( E item, int pos ) {
        
        if (  this.tam == 0 ) {
            this.addInicio( item );
            
        } else if ( this.tam == pos) {
            this.addFim( item );
            
        } else if ( pos < 0 && pos > this.tam ) {
            throw new IllegalArgumentException( "Posição inválida" );
            
        } else {
            No aux = this.inicio;
            No node = new No( item );
            
            for ( int i = 0; i < ( pos-1 ); i++ ) {
                aux = aux.getProx();
            }
            node.setProx( aux.getProx() ); //Aplicável no construtor
            aux.setProx( node );
            node.setAnt( aux ); //Aplicável no construtor
            aux.getProx().setAnt( node );
            
            this.tam++;
        }
    }
    
    @Override
    public void add( E array[] ) {
        
        for ( E o : array ) {
            this.addFim( o );
        }
    }

    @Override
    public void addInicio( E item ) {
        
         No node = new No( item );
        
        if ( this.tam == 0 ) {
            this.inicio = node;
            this.fim = node;
            
        } else {
            No aux = this.inicio;
            node.setProx( aux.getProx() );
            aux.getProx().setAnt( node );
            this.inicio = node;
        }
        
        this.tam++;
    }

    @Override
    public void addFim( E item ) {
        
        if ( this.tam == 0 ) {
            this.addInicio( item );
            
        } else {
            No aux = this.fim;
            No node = new No( item );

            aux.setProx( node );
            node.setAnt( aux );
            this.fim = node;

            this.tam++;
        }
    }
    
    @Override
    public E remove( int pos ) {
        
        No aux = this.inicio;
        
        
        for ( int i = 0; i < ( pos-1 ); i++ ) {
            aux = aux.getProx();
        }
        No node_return = aux.getProx(); //Armazena o no a ser removido
        aux.setProx( aux.getProx().getProx() );
        aux.getProx().setAnt( aux.getAnt().getAnt() );
        this.tam--;
        
        return (E) node_return;
    }

    @Override
    public E removeInicio() {
        
        No node_return = this.inicio; //Armazena o no a ser removido
        this.inicio = this.inicio.getProx();
        this.tam--;
        
        return (E) node_return;
    }

    @Override
    public E removeFim() {
        
        No node_return = this.fim;
        this.fim = this.fim.getAnt();
        this.tam--;
        
        return (E) node_return;
    }
    
    @Override
    public void swap() {
        
        int node;
    	
        for ( int i=0 ; i < this.tam ; i++ ) {
            for ( int j=0 ; j < ( this.tam - 1 ) ; j++ ) {
    			
                if ( ( int )posicao( j ).getElemento() > ( int )posicao( j+1 ).getElemento() ) {
    				
                    node = ( Integer )posicao( j ).getElemento();
                    posicao( j ).setElemento(posicao( j+1 ).getElemento());
                    posicao( j+1 ).setElemento( node );
                }
            }
        }
    }
    
    private No posicao( int pos ) {
    	
        No aux = this.inicio;
    	
        if ( pos < this.tam ) {
    		
            for ( int i=0 ; i < pos ; i++ ) {

                aux = aux.getProx();
            }
        }
    	
        return aux;
    }

    @Override
    public boolean busca( E item ) {
        
        No aux = this.fim;
        while ( aux.getAnt() != null ) { //Percorrendo do fim para o inicio
            
            if ( aux.getElemento() == item ) {
                return true;
            }
                
            aux = aux.getAnt();
        }
        return false;
    }

    @Override
    public int tamanho() {
        
        return this.tam;
    }

    @Override
    public boolean isEmpyt() {
        
        return this.tam == 0;
    }
    
    @Override
    public void print() { //constante | Método recursivo
        
	this.imprime(this.inicio);
	}
	
    private void imprime( No n ) { //constante
        
        System.out.println(n.getElemento());
        if (n.getProx() != null) {
            imprime(n.getProx());
        }
    }

    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public No getFim() {
        return fim;
    }

    public void setFim(No fim) {
        this.fim = fim;
    }

    
}
