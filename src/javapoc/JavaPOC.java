/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoc;

import javapoc.services.NotaService;
/**
 *
 * @author Vinicius
 */
public class JavaPOC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NotaService notaService = new NotaService();
        System.out.println("O valor é: " + String.valueOf(notaService.getNota()));
        notaService.setNota(10);
        System.out.println("O novo valor é: " + String.valueOf(notaService.getNota()));
        notaService.add50();
        System.out.println("O novo valor é: " + String.valueOf(notaService.getNota()));
    }
    
}
