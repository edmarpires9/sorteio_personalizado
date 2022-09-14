//Criando um app que sorteia números conforme a necessidade do usuário.

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Main
{
    public static void main(String[] args)
    {
        System.out.println("SORTEIO PERSONALIZADO");
        System.out.println("[1] PERSONALIZADO");
        System.out.println("[2] JOGAR DADO");
        System.out.println("[3] MEGA SENA");
        System.out.print("SELECIONE UM MODO: ");
        Scanner input = new Scanner(System.in);
        int modo = input.nextInt();

        if(modo == 1)
        {
            //Inserir quantidade de resultados
            System.out.print("Quantidades de resultados: ");
            int quantidade_resultados = input.nextInt();

            //Inserir quantidade de números dentro do sorteio.
            System.out.print("Números dentro do sorteio:");
            int quantidade_numeros = input.nextInt();
            
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
        
        else if(modo == 2)
        {
            while(true)
            {
                int quantidade_resultados = 1;          
                int quantidade_numeros = 6;
                
                //Criando uma lista de inteiros conforme o usuário precisa
                ArrayList<Integer> lista = new ArrayList<>();
                for (int contador = 0; contador < quantidade_numeros; contador++)
                {
                    lista.add(contador+1);
                }
                
                //Sorteando os numeros
                Collections.shuffle(lista);
                
                //Exibindo resultado
                System.out.print("\n\nRESULTADO: ");
                for (int contador = 0;contador < quantidade_resultados; contador++)
                {
                    System.out.println(lista.get(contador));
                }

                //Mensagem continuar
                System.out.print("Para encerrar digite stop. Para jogar novamente pressione qualquer botão: ");
                String continuar = input.next();
                if(continuar.equals("stop"))
                {
                    break;
                }
            }
        }

        else if(modo == 3)
        {
            while(true)
            {
                int quantidade_resultados = 6;          
                int quantidade_numeros = 60;
                
                //Criando uma lista de inteiros conforme o usuário precisa
                ArrayList<Integer> lista = new ArrayList<>();
                for (int contador = 0; contador < quantidade_numeros; contador++)
                {
                    lista.add(contador+1);
                }
                
                //Sorteando os numeros
                Collections.shuffle(lista);
                
                //Exibindo resultado
                System.out.print("\n\nRESULTADOS: - ");
                for (int contador = 0;contador < quantidade_resultados; contador++)
                {
                    System.out.print(lista.get(contador)+" - ");
                }

                //Mensagem continuar
                System.out.print("\nPara encerrar digite stop. Para jogar novamente pressione qualquer botão: ");
                String continuar = input.next();
                if(continuar.equals("stop"))
                {
                    break;
                }
            }
        }
        input.close();
    }
}
