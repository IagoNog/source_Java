/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto2;

import java.util.Collection;
import java.util.Iterator;

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
        node.setProx(inicio);
        this.inicio = node;
        this.fim = this.inicio;
        
        this.size++;
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
    
    public void add(int item, int pos) { //linear
        
        if (pos == 0) {
            this.addInicio(item);
            
        } else if (pos == this.size) {
            this.addFim(item);
            
        } else if (pos > 0 && pos < this.size) {
            System.out.println("Posição inválida");
            
        } else {
            No node = new No(item);
            No node_aux = this.inicio;
            int cont = 0;
            
            while (cont < (pos-1)) {
                cont++;
                node_aux = node_aux.getProx();
            }
            
            node.setProx(node_aux.getProx());
            this.size++;
        }
    }
    
    public int delInicio() { //constante
        
        No node_aux = this.inicio;
        this.inicio = node_aux.getProx();
        
        return node_aux.getItem();
    }
    
    public int delFim() { //constante
        
        No node_aux = this.inicio;
        No x;
        x = this.fim;
        this.fim = null;
        
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
            int cont = 0;
            
            while (cont <= pos--) {
                cont++;
                node_aux = node_aux.getProx();
            }
            x = node_aux;
            node_aux.setProx(node_aux.getProx().getProx());
        }
    }
    
    public int size() { //constante
        return this.size;
    }
    
    public void imprimeInvertido(Collection<? extends Object> colecao) {
        imprimeInvertido(colecao.iterator());
    }
 
    private void imprimeInvertido(Iterator<? extends Object> iterator) {
        if (iterator.hasNext()) {
            Object object = iterator.next();
            imprimeInvertido(iterator);
            System.out.println(object);
        }
    }
    
}
