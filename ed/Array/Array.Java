/**
 *
 * @author Iago Nogueira <iagonogueira227@gmail.com>
 */
public class Vetor {
    private int array[] = new int[100];
    private int tam = 0;
    
    public Vetor() {
        super();
    }
    
    public Vetor(int array[]) { //Opção de já instanciar o vetor passando uma sequencia
        if (array.length <= this.array.length) {
            this.array = array;
        }
    }
    
    public void addInicio(int item) { //Complexidade linear
        if (this.tam == 0) {
            this.array[tam] = item;
        } else {
            for (int i = (this.tam-1); i <= 0; i--) {
                this.array[i] = this.array[i-1];
            }
            this.array[0] = item;
            this.tam++;
        }
    }    
    
    public void addFim(int item) { //Complexidade constante
            this.array[tam] = item;
            this.tam++;
    }
    
    public void add(int item, int pos) { //Complexidade constante
        if (pos == 0) {
            this.addInicio(item);
            
        } else if (pos == this.tam) {
            this.addFim(item);
            
        } else if (pos > 0 && pos < this.array.length) {
            System.out.println("Posição inválida");
            
        } else {
            this.array[pos] = item;
            this.tam++;
        }
    }
    
    public int delInicio() { //Complexidade linear
        int aux;
        
        aux = this.array[0];
        this.array[0] = 0;
        
        for (int i = 0; i < this.tam; i++) {
            this.array[i] = this.array[i+1];
        }
        this.tam--;
        
        return aux;
    }
    
    public int delFim() { //Complexidade constante
        int aux;
        
        aux = this.array[this.tam];
        this.array[this.tam] = 0;
        this.tam--;
        
        return aux;
    }
    
    public int del(int pos) { //Complexidade linear
        int aux = 0;
        
        if (pos == 0) {
            this.delInicio();
            
        } else if (pos == tam) {
            this.delFim();
            
        } else if (pos > 0 && pos < this.array.length) {
            System.out.println("Posição inválida");
            
        } else {
            aux = this.array[pos];
            this.array[pos] = 0;
            
            for (int i = pos; this.array[i+1] != 0; i++) {
                this.array[i] = this.array[i+1];
            }
            this.tam--;
        }
        return aux;
    }
    
    public void print() { //Complexidade linear, embora sabendo o tamanho
        for(int o : this.array){
            System.out.println(o);
        }
    }
    
    public int size() { //Complexidade constante
        return this.tam;
    }
}
