/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoc.services;
import javapoc.data.Nota;

/**
 *
 * @author Vinicius
 */
public class NotaService {
    
    private Nota nota = new Nota();
    
    public NotaService() {
        
    }
    
    public int getNota() {
        return nota.getValor();
    }
    
    public void setNota(int x) {
        nota.setValor(x);
    }
    
    public void add50() {
        nota.setValor(getNota()+50);
    }
    
}
