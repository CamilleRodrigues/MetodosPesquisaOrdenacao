import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        ArrayList<String> listaPalavras = new ArrayList<>();

        util.popularListaNumerosAleatorio(listaNumeros, 10, 50, 100);
        util.exibirListaNumeros(listaNumeros);

        util.popularListaPalavrasAleatorio(listaPalavras, 100, 10);
        util.exibirListaPalavras(listaPalavras);
    } 
}
