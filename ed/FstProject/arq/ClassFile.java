/**
 * Essa classe faz a leitura de dados de arquivos .txt em caracteres
 */

package arq;

import java.io.FileReader; //tipo "r"
import java.io.FileWriter; //tipo "w"
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;



/**
 * @author Iago Nogueira <iagonogueira227@gmail.com>
 *
 * @brief Classe ReadFile
 * @date   28/04/2017
 */
public class ClassFile {
        
    private Object text_aux;
    
    public ClassFile() {
        super();
    }
    
    public void createFile( ) {
        
        Scanner input = new Scanner( System.in );
        
        System.out.print( "Digite o nome do arquivo: " );
        String nameFile = input.next();
        
        try {
            
            FileWriter file = new FileWriter( nameFile );
            PrintWriter writeFile = new PrintWriter( file );
            
            writeFile.print( this.write() );
            
            writeFile.close(); //Fecha o arquivo
            
        } catch (IOException ex) {
            System.err.println( "Não foi possivel abrir o arquivo " + ex );
        }
    }
    
    //Reescrita
    public void createFile( String nameFile ) {
        
        try {
            
            FileWriter file = new FileWriter( nameFile );
            PrintWriter writeFile = new PrintWriter( file );
            
            writeFile.close(); //Fecha o arquivo
            
        } catch (IOException ex) {
            System.err.println( "Não foi possivel abrir o arquivo" );
        }
    }
    
    
    public String write( ) {
        
        int opc = 0;
        BufferedReader qwerty = new BufferedReader( new InputStreamReader( System.in ) );
        
        System.out.println( "O arquivo está pronto para ser editado: " );
        String text = null;
        
        try {
            
            text = qwerty.readLine();
            
        } catch (IOException ex) {
            System.err.println( "Não foi possivel escrever no arquivo " + ex );
        }
        
        return text;
    }
    
    public void openFile( String nameFile ) {
        
        try {
            
            FileReader file = new FileReader( nameFile );
            BufferedReader readFile = new BufferedReader( file );
            
            this.write();
            
            
            file.close();
            
        } catch ( FileNotFoundException ex ) {
            System.err.println( "O arquivo não foi encontrado " + ex );
            
        } catch ( IOException ex ) {
            System.err.println( "Não foi possivel abrir o arquivo " + ex );
        }
    }
        
    public void printFile( String nameArq ) {
        
        String line;
                
        try {
            
            FileReader file = new FileReader( nameArq );
            BufferedReader readFile = new BufferedReader( file );
            
            while ( ( line = readFile.readLine() ) != null ) { //Lê todas as linas do arquivo
                
                System.out.println( line );
            }
            
            
            file.close();
            
        } catch ( FileNotFoundException ex ) {
            System.err.println( "O arquivo não foi encontrado " + ex );
            
        } catch ( IOException ex ) {
            System.err.println( "Não foi possivel abrir o arquivo " + ex );
        }
    }
    
    
        
}

//Runtime.getRuntime().exec( "C:/Users/Administrador/Desktop/exerc2.exe" ); //Caminho absoluto