package src;
import java.util.ArrayList;
import java.util.Collections;

public class Sortear {

    public static void sortear(int quantidade_numeros, int quantidade_resultados)
    {  
     //Criando uma lista. O tamanho da lista é o mesmo do tamanho da variavel quantidade_numeros.
     ArrayList<Integer> lista = new ArrayList<>();
     for (int contador = 0; contador < quantidade_numeros; contador++)
     {
         lista.add(contador+1);
     }
     //Sorteando os numeros
     Collections.shuffle(lista);
     //Exibindo resultado
     System.out.print("=>");
     for (int contador = 0;contador < quantidade_resultados; contador++)
     {
         System.out.print(" "+lista.get(contador));
     }
     System.out.println(" <=");
     System.out.print("Executar novamente?");
    }
}
