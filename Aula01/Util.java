import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Util {
    /**
     * metodo de classe que popula aleatoriamente uma lista com numeros aleatorios
     * @param lista contem os numeros sorteados
     * @param quantidade de numeros a serem armazenados
     * @param inicio valor inicial da extensao do numero
     * @param fim valor final da extensao do numero
     */
    public static void popularListaNumerosAleatorio(ArrayList<Integer> lista, int quantidade, int inicio, int fim) {
        Random gerador = new Random();
        int numero;
        for (;quantidade > 0; quantidade --) {
            numero = gerador.nextInt(fim - inicio) + inicio;
            lista.add(numero);
        }
    }
    /**
     * metodo de classe que exibe uma lista de inteiros
     * @param lista de inteiros
     */
    public static void exibirListaNumeros(ArrayList<Integer> lista){
        for (Integer item : lista) {
            System.out.println(item);
        }
    }

    public static void popularListaPalavrasAleatorio(ArrayList<String> lista, int quantidade, int tamanho) {
        Random gerador = new Random();
        int posicao;
        String palavraGerada;
        char letraSorteada;
        String letras = "abcdefghijklmnopqrstuvwxyz";
        
        for (; quantidade > 0; quantidade --) {
            palavraGerada = "";
            for (int i = 0; i < tamanho; i++) {
                posicao = gerador.nextInt(letras.length());
                letraSorteada = letras.charAt(posicao);
                palavraGerada += letraSorteada;
            }

            lista.add(palavraGerada);
        }
    }

    public static void exibirListaPalavras(ArrayList<String> lista) {
        for (String item : lista) {
            System.out.println(item);
        }
    }

    public static void popularListaNumerosArquivo(ArrayList<Integer> listaNumeros, String nomeArquivo) throws IOException {
        FileWriter writer = new FileWriter(nomeArquivo);
        BufferedWriter buffWrite = new BufferedWriter(writer);
        for (Integer item : listaNumeros) {
           buffWrite.append(item.toString().concat("\n"));
        }

        buffWrite.close();
    }

    public static void popularListaPalavrasArquivo(ArrayList<String> listaPalavras, String nomeArquivo) throws IOException {
        FileWriter writer = new FileWriter(nomeArquivo);
        BufferedWriter buffWrite = new BufferedWriter(writer);
        for (String item : listaPalavras) {
           buffWrite.append(item.concat("\n"));
        }

        buffWrite.close();
    }
}
