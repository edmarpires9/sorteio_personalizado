package src;
import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        int quantidade_numeros, quantidade_resultados, modo;
        System.out.print("SORTEIO JAVA\n[1] PERSONALIZADO\n[2] JOGAR DADO\n[3] MEGA SENA\nOPÇÃO:");
        Scanner input = new Scanner(System.in);
        modo = input.nextInt();
        
        switch(modo)
        {
            case 1:
            //Jogo personalizado
            //Inserir quantidade de números dentro do sorteio.
            System.out.print("TAMANHO DO SORTEIO: ");
            quantidade_numeros = input.nextInt();            
            //Inserir quantidade de resultados
            System.out.print("QNTD DE RESULTADOS: ");
            quantidade_resultados = input.nextInt();            
            Sortear.sortear(quantidade_numeros, quantidade_resultados);
            break;
            //Jogar dado
            case 2:
                quantidade_numeros = 6;
                quantidade_resultados = 1;
                Sortear.sortear(quantidade_numeros, quantidade_resultados);
            break;
            //Jogar mega sena
            case 3:
            quantidade_numeros = 60;
            quantidade_resultados = 6;
            Sortear.sortear(quantidade_numeros, quantidade_resultados);
            break;
            
            default: System.out.println("OPÇÃO INVÁLIDA!");
        }
        input.close();        
    }
}
