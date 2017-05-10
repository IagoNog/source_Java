package FstJob;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/** Pacotes de estruturas desenvolvido em sala */
import lde.Lde;
import lde.No;

/**
 * @author Iago Nogueira <iagonogueira227@gmail.com>
 *
 * @brief Classe TxtInList
 * @date   05/05/2017
 */
public class TxtInList {

    private Lde<Lde> bigList = new Lde();    
    
    public TxtInList() {
        super();
    }
    
    public void reciveArq( String nameFile ) {
        
        try {
                        
            FileReader file = new FileReader( nameFile );
            BufferedReader readFile = new BufferedReader( file );
            
            this.addToList( readFile );
            
            readFile.close();
            file.close();
            
        } catch ( IOException ex ) {
            System.err.println( "Erro no metodo 'reciveArq()' Não foi possivel abrir o arquivo " + nameFile + " - " + ex );
        }
        
        System.out.println( "Arquivo construido" );
        
    } 
        
    public void addToList( BufferedReader readFile) { //Adiciona a sequencia na lista
        
        String c[], SPACE = " ";
        String actLine;
        
        try {
            while ( (actLine = readFile.readLine()) != null ) {
                
                c = actLine.split( SPACE );
                Lde<Integer> list = new Lde<>();
                
                for ( String c1 : c ) {
                    
                    list.addFim( Integer.parseInt( c1 ) ); //Adiciona a sequencia de numeros a lista encadeada
                    
                }
                this.exitTxt( list );
            }
            
        } catch (IOException ex) {
            System.err.println( "Erro no metodo 'addToList()" + ex );
        } 

    }
  
    public void exitTxt( Lde list ) { //colocar a lista em um arq .txt
        
        list.bubbleSort(); //ordenação da lista
        No aux = list.getInicio();
        
        try {
                        
            FileWriter file = new FileWriter( "saida.txt" );
            PrintWriter writeFile = new PrintWriter( file );
            
            for ( int i=0 ; i < list.tamanho() ; i++ ) {
                
                writeFile.print(aux.getElemento() + " " );
                aux = aux.getProx();
            }
            
            writeFile.close();
            file.close();
            
        } catch ( IOException ex ) {
            System.err.println( "Erro no metodo 'exitTxt()' Não foi possivel abrir o arquivo " + " - " + ex );
        }
            
    }

    public Lde<Lde> getBigList() {
        return bigList;
    }

    public void setBigList(Lde<Lde> bigList) {
        this.bigList = bigList;
    }
    
    
}
