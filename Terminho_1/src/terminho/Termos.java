/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terminho;

import java.util.Random;

/**
 *
 * @author renan
 */
public class Termos {

    /**
     * @param args the command line arguments
     */
    private String[] termos = {"sagaz", "negro", "âmago", "êxito", "mexer", "termo", "senso", "nobre", "algoz", "afeto", "plena",
        "ética", "mútua", "sutil", "tênue", "vigor", "aquém", "audaz", "porém", "fazer", "sanar", "seção", "inato", "assim",
        "cerne", "ideia", "desde", "fosse", "poder", "moral", "torpe", "honra", "muito", "justo", "gozar", "anexo", "fútil",
        "razão", "quiçá", "etnia", "ícone", "sobre", "tange", "égide", "lapso", "mútuo", "sonho", "expor", "haver", "hábil"};
    private String termo;
    private String jaFoi;

    public String getTermo() {
        return termo;
    }
    public String getJaFoi() {
        return jaFoi;
    }

    public Termos() {
        Random rnd = new Random();
        int n = rnd.nextInt(termos.length);
        jaFoi = ""+n;
        termo = termos[n];
    }

    public int sorteio() {
        Random rnd = new Random();
        String[] numeros = jaFoi.split("-");
        
        int n = rnd.nextInt(termos.length);
        for(int i = 0; i < numeros.length; i++){
            if (Integer.parseInt(numeros[i]) == n){
               n = rnd.nextInt(termos.length);
            }
        }
        termo = termos[n];
        jaFoi = jaFoi+"-"+n;
        return n;
    }
    
        public int sorteio(int n1) {
        Random rnd = new Random();
        String[] numeros = jaFoi.split("-");
        
        int n = rnd.nextInt(termos.length);
        for(int i = 0; i < numeros.length; i++){
            if (Integer.parseInt(numeros[i]) == n || n1 == n){
               n = rnd.nextInt(termos.length);
            }
        }
        termo = termos[n];
        jaFoi = jaFoi+"-"+n;

        return n;
    }
        
    public int sorteio(int n1, int n2) {
        Random rnd = new Random();
        String[] numeros = jaFoi.split("-");
        
        int n = rnd.nextInt(termos.length);
        for(int i = 0; i < numeros.length; i++){
            if (Integer.parseInt(numeros[i]) == n || n1 == n || n2 == n ){
               n = rnd.nextInt(termos.length);
            }
        }
        termo = termos[n];
        jaFoi = jaFoi+"-"+n;

        return n;
    }
            
    public int sorteio(int n1, int n2, int n3) {
        Random rnd = new Random();
        String[] numeros = jaFoi.split("-");
        
        int n = rnd.nextInt(termos.length);
        for(int i = 0; i < numeros.length; i++){
            if (Integer.parseInt(numeros[i]) == n || n1 == n || n2 == n || n3 == n){
               n = rnd.nextInt(termos.length);
            }
        }
        termo = termos[n];
        jaFoi = jaFoi+"-"+n;

        return n;
    }

}
