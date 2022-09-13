//Criando um app que sorteia números conforme a necessidade do usuário.

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Main
{
    public static void main(String[] args)
    {
        System.out.println("SORTEIO PERSONALIZADO");

        //Inserir quantidade de resultados
        Scanner input = new Scanner(System.in);
        System.out.print("Quantidades de resultados: ");
        int quantidade_resultados = input.nextInt();

        //Inserir quantidade de números dentro do sorteio.
        System.out.print("Números dentro do sorteio:");
        int quantidade_numeros = input.nextInt();
        input.close();

        //Criando uma lista de inteiros conforme o usuário precisa
        ArrayList<Integer> lista = new ArrayList<>();
        for (int contador = 0; contador < quantidade_numeros; contador++)
        {
            lista.add(contador+1);
        }

        //Sorteando os numeros
        Collections.shuffle(lista);

        //Exibindo resultado
        System.out.println("\n\nRESULTADOS: ");
        for (int contador = 0;contador < quantidade_resultados; contador++)
        {
            System.out.println(lista.get(contador));
        }
    }
}
