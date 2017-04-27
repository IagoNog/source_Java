package lde;

/**
 * 
 * @author Iago Nogueira <iagonogueira227@gmail.com>
 */
public class Lde implements ILde{ //Somentes os métodos foram herdados
    
    private No inicio;
    private No fim;
    private int tam;
    
    public Lde(){
        
        this.inicio = null;
        this.fim = null;
        this.tam = 0;
    }    

    @Override
    public void add( Object item, int pos ) {
        
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
    public void addInicio( Object item ) {
        
        No node = new No( item );
        
        
        if ( this.inicio.getProx() == null ) {
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
    public void addFim( Object item ) {
        
        No aux = this.fim;
        No node = new No( item );
        
        aux.setProx( node );
        node.setAnt( aux );
        this.fim = node;
        
        this.tam++;
    }

    @Override
    public Object remove( int pos ) {
        
        No aux = this.inicio;
        
        
        for ( int i = 0; i < ( pos-1 ); i++ ) {
            aux = aux.getProx();
        }
        No node_return = aux.getProx(); //Armazena o no a ser removido
        aux.setProx( aux.getProx().getProx() );
        aux.getProx().setAnt( aux.getAnt().getAnt() );
        this.tam--;
        
        return node_return;
    }

    @Override
    public Object removeInicio() {
        
        No node_return = this.inicio; //Armazena o no a ser removido
        this.inicio = this.inicio.getProx();
        this.tam--;
        
        return node_return;
    }

    @Override
    public Object removeFim() {
        
        No node_return = this.fim;
        this.fim = this.fim.getAnt();
        this.tam--;
        
        return node_return;
    }

    @Override
    public Object busca( Object item ) {
        
        No aux = this.fim;
        while ( aux.getAnt() != null ) { //Percorrendo do fim para o inicio
            
            if ( aux.getElemento() == item ) {
                return aux.getElemento();
                
            } else {
                aux = aux.getAnt();
            }
        }
        return ( "Objeto não existe" );
    }

    @Override
    public int size() {
        
        return this.tam;
    }

    @Override
    public boolean isEmpyt() {
        
        return this.tam == 0;
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
