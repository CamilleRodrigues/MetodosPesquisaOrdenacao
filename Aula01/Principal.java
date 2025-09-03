import java.io.IOException;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        ArrayList<String> listaPalavras = new ArrayList<>();

        Util.popularListaNumerosAleatorio(listaNumeros, 10, 50, 100);
        Util.exibirListaNumeros(listaNumeros);
        Util.popularListaNumerosArquivo(listaNumeros, "__lista_numeros.txt");

        Util.popularListaPalavrasAleatorio(listaPalavras, 100, 10);
        Util.exibirListaPalavras(listaPalavras);
        Util.popularListaPalavrasArquivo(listaPalavras, "__lista_palavras.txt");
    } 
}
