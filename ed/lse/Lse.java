/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto2;

/**
 *
 * @author Iago Nogueira <iagonogueira227@gmail.com>
 */
public class Lse {
    private No inicio;
    private No fim;
    private int size;
    
    public Lse(){
        super();
        this.inicio = null;
        this.fim = null;
    }
    
    public void addInicio(int item) { //constante
        
        No node = new No(item);
        if (this.size == 0) {
            node.setProx(inicio);
            this.inicio = node;
            this.fim = this.inicio;
            this.size++;
        }      
    }  
    
    public void addFim(int item) { //constante
        if (this.size == 0) {
            this.addInicio(item);
            
        } else {
            No node = new No(item);
            this.fim.setProx(node);
            this.fim = node;
            
            this.size++;
        }        
    }
    
    public void add(int pos, int item) { //linear
        No node = new No(item);
        No node_aux = this.inicio;
        
        if (pos == 0) {
            this.addInicio(item);
            
        } else if (pos == this.size) {
            this.addFim(item);
            
        } else if (pos < 0 && pos > this.size) {
            System.out.println("Posição inválida");
            
        } else {
            
            for (int i = 0; i < pos-1; i++) {
                node_aux = node_aux.getProx();
            }
            
            node.setProx(node_aux.getProx());
            node_aux.setProx(node);
            this.size++;
        }
    }
    
    public int delInicio() { //constante
        
        No node_aux = this.inicio;
        this.inicio = node_aux.getProx();
        this.size--;
        
        return node_aux.getItem();
    }
    
    public int delFim() { //constante
        
        No node_aux = this.inicio;
        No x;
        x = this.fim;
        this.fim = null;
        this.size--;
        
        return x.getItem();
    }
    
    public void del(int pos) { //linear
        if (pos == 0) {
            this.delInicio();
            
        } else if (pos == this.size) {
            this.delFim();
            
        } else if (pos < 0 && pos > this.size) {
            System.out.println("Posição inválida");
            
        } else {
            No node_aux = this.inicio;
            No x;
            
            for (int i = 0; i < pos--; i++) {
                node_aux = node_aux.getProx();
            }
            x = node_aux;
            node_aux.setProx(node_aux.getProx().getProx());
            this.size--;
        }
    }
    
    public int size() { //constante
        return this.size;
    }
    
    public void print() { //constante
	this.imprime(this.inicio);
	}
	
    private void imprime(No n) { //constante
        if (n.getProx() != null) {
            imprime(n.getProx());
            System.out.println(n.getItem());
        }
    }
}
