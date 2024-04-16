//Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double armazenaNota;
    int contador;
    void exibeFichaTecnica(){
        System.out.println("o Titulo da musica é " + titulo + " o artista que canta esta musica é " + artista + " e o" +
                " " +
                "ano de lançamento desta musica é " + anoLancamento);

    }
    double avaliaMusica(double nota){
        armazenaNota += nota;
        contador++;
        System.out.println("nota armazenada " + armazenaNota + " contador: " + contador);
        return armazenaNota;
    };
    void calculaMediaMusica(){
        double media = armazenaNota / contador;
        System.out.println("Media " + media);
    }




}
