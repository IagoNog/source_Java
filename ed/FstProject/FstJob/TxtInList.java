package FstJob;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/** Pacotes de estruturas desenvolvido em sala */
import lde.Lde;
import lde.No;
import ordenacaoAlg.BubbleSort;

/**
 * @author Iago Nogueira <iagonogueira227@gmail.com>
 *
 * @brief Classe TxtInList
 * @date   05/05/2017
 */
public class TxtInList {

    private Lde<Integer> list = new Lde();
    private Lde<Lde> bigList = new Lde();    
    
    public TxtInList() {
        super();
    }
    
    public void reciveArq( String nameFile ) {
        
        try {
                        
            FileReader file = new FileReader( nameFile );
            BufferedReader readFile = new BufferedReader( file );
            
            this.countLineFile( readFile );
            this.exitTxt( this.bigList, "saida.txt" );
            
            readFile.close();
            
        } catch ( IOException ex ) {
            System.err.println( "Erro no metodo 'reciveArq()' Não foi possivel abrir o arquivo " + nameFile + " - " + ex );
        }
        
        System.out.println( "Arquivo construido" );
        
    }
    
    public void countLineFile( BufferedReader readFile ) {
        
        String actLine;
        
        try {
            
            while ( ( actLine = readFile.readLine() ) != null ) { //Percorre toto o arquivo .txt
                
                this.addToList( actLine );
            }
            
        } catch ( IOException ex ) {
            System.err.println( "Erro no metodo 'countLineFile()' Não foi possivel abrir o arquivo" + " - " + ex );
        }
        
    }
        
    public void addToList( String actLine ) { //Adiciona a sequencia na lista
        
        String caracter[], SPACE = " ";
        Integer number[];
        BubbleSort ord = new BubbleSort();
        
        caracter = actLine.split( SPACE ); //Armazena somente os numeros no array
        number = converter( caracter );
                
        //ord.ordenation( number ); //Ordena o array
        this.list.add( number ); //Adiciona a sequencia de numeros a lista encadeada
        this.list.swap();
        this.bigList.addFim( list ); //adiciona a lista na bigList, uma lista de listas

    }
    
    public static Integer[] converter( String array[] ) { //Converte de String para Integer
        
        Integer arrayAux[] = new Integer[array.length];
                    
        for ( int i=0 ; i < array.length ; i++ ) {
            arrayAux[i] = Integer.parseInt( array[i] );
        }
        
        return arrayAux;    
    }
    
    public void exitTxt( Lde list, String nameFile ) { //colocar a lista em um arq .txt
        
        No aux = this.list.getInicio();
        
        try {
                        
            FileWriter file = new FileWriter( nameFile );
            PrintWriter writeFile = new PrintWriter( file );
            
            while ( aux.getProx() != null ) {
                
                writeFile.print( aux.getElemento() + " " );
                
                //if ( ( int )aux.getElemento() > ( int )aux.getProx().getElemento() ) {
                    //writeFile.println();
                //}
                
                aux = aux.getProx();
            }
            writeFile.close();
            
        } catch ( IOException ex ) {
            System.err.println( "Erro no metodo 'exitTxt()' Não foi possivel abrir o arquivo " + nameFile + " - " + ex );
        }
            
    }

    public Lde<Integer> getList() {
        return list;
    }

    public void setList(Lde<Integer> list) {
        this.list = list;
    }

    public Lde<Lde> getBigList() {
        return bigList;
    }

    public void setBigList(Lde<Lde> bigList) {
        this.bigList = bigList;
    }
    
    
}
