/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.perulangan.deretaritmatikamatriksaxb;

/**
 *
 * @author rizwa
 */
public class CodinganAing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nilaipertama_a = 10;
        int selisih_b = 5;
        int baris_A = 4;
        int kolom_B = 4;
        int sukusaatini = nilaipertama_a;
        int jmlderet = nilaipertama_a;
        System.out.println("Deret Aritmatikanya dalam matriks adalah:");
        for (int i = 0; i < baris_A ; i++){
            for (int j = 0; j < kolom_B; j++){
                System.out.print(sukusaatini + "\t");
                sukusaatini = sukusaatini + selisih_b;
                jmlderet = jmlderet + sukusaatini;
            }
            System.out.println();
            }
        jmlderet = jmlderet - sukusaatini;
        System.out.println("Jumlah Deret Aritmatikanya adalah: "+jmlderet);
    }
}
