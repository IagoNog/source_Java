package analizadorLexico;

import java.io.File;
import java.nio.file.Paths;

public class Gerador {

    public static void main(String[] args) {
        
        String pastaRaiz = Paths.get( "" ).toAbsolutePath(). toString();
        String subPasta = "/src/analizadorLexico/";

        String file = pastaRaiz + subPasta + "linguagem.lex";

        File arqCodigo = new File( file );

        jflex.Main.generate( arqCodigo );
        
    }
    
}
