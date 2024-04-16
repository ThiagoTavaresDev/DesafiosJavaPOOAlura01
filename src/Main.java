

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.idadePessoa = 19;
        pessoa1.nomePessoa = "Thiago Tavares";
        pessoa1.exibeMenssagem();
        //
        Calculadora conta1 = new Calculadora();
        conta1.mostraNumeroDuplicado(10);
        //
        Musica musica1 = new Musica();
        musica1.titulo = "Dido Remix";
        musica1.anoLancamento = 2023;
        musica1.artista = "Eminem";
        musica1.exibeFichaTecnica();
        musica1.avaliaMusica(10);
        musica1.avaliaMusica(6);
        musica1.calculaMediaMusica();
        //
        Carro carro1 = new Carro();
        carro1.modelo = "Argo";
        carro1.ano = 2020;
        carro1.cor = "Azul";
        carro1.ExibeFichaTecnica();
        carro1.ExibeIdadeCarro();
        //

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Joaquin";
        aluno1.idade = 12;
        aluno1.exibirInformacoes();

    }

}