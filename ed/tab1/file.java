/**
 * Essa classe faz a leitura de dados de arquivos .txt em caracteres
 */

package arq;
import java.util.Scanner;
import java.io.FileReader; //tipo "r"
import java.io.FileWriter; //tipo "w"
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import lde.Lde;

/**
 * @author Iago Nogueira <iagonogueira227@gmail.com>
 *
 * @brief Classe ReadFile
 * @date   28/04/2017
 */
public class File {
    
    public File() {
        super();
    }
    
    public void Write() {
        
        Scanner input = new Scanner( System.in );
        
        System.out.print( "Digite o nome do arquivo: " );
        String nomeArq = input.next();
        
        try {
            FileWriter file = new FileWriter( nomeArq ); //fopen
            PrintWriter writeArq = new PrintWriter( file );
            
            System.out.println( "O arquivo ja pode ser escrito: " );
            BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
            
            String texto = in.readLine();
            
            writeArq.write( texto ); //Grava no arquivo .txt
            
            file.close(); //fclose
            
        } catch ( IOException ex ) {
            System.err.println( "Erro ao criar o arquivo " + ex );
        } 
        
    }
    
    public void Read() {
        
        Lde lista = new Lde();
        
        try {
            FileReader file = new FileReader( "C:/Users/Administrador/Documents/NetBeansProjects/ED/src/arq/entrada.txt" );
            BufferedReader readFile = new BufferedReader( file );

            this.List( file, readFile ); //transforma em lista
            this.ReorganizeList( lista );
            
            file.close();
            
        } catch ( FileNotFoundException ex ) {
            System.err.println( "O arquivo não foi encontrado " + ex );
            
        } catch ( IOException ex ) {
            System.out.println( "Não foi possivel abrir o arquivo " + ex );
        }
    }
    
    public void List( FileReader file, BufferedReader readFile ) {
        
        String linha;
        String caracter[] = null;
        
        try {
            while (  ( linha = readFile.readLine() ) != null ) { //Percorre todas as linhas do arquivo de texto
                caracter = linha.split( " " ); //Separa os numeros
               
            }
                        
        } catch (  IOException ex) {
            System.err.println( "Não foi possivel criar o arquivo " + ex );
        }
        
    }
    
    private void ReorganizeList( Lde lista ) {
        
        
    }
        
}

//Runtime.getRuntime().exec( "C:/Users/Administrador/Desktop/exerc2.exe" ); //Caminho absoluto

/**
public void ord( No aux ) {
		
		while ( aux.getNext() != null ) {
			
			if ( (int)aux.getElement < (int)aux.getNext().getElement() ) {
				
				No node.setElement( aux.getElement() );
				aux.setElement( aux.getNext().getElement() );
				aux.getNext().setElement( node.getElement() );
			}
		}
		/**
		 * Se n > n+1 até lista.size();
		 *   list ord;
		 *  
		 *  Se não retorna false -> Recursivo Ord;
		
		this.ord( this.inicio ); //Recursivo Ord; -> Else
		

	}
*/
