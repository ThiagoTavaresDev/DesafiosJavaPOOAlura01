//Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.

public class Carro {
    String modelo;
    int ano;
    String cor;

    void ExibeFichaTecnica(){
        System.out.println("o carro é do modelo: " + modelo + " do ano " + ano + " e da cor " + cor);

    }
    int ExibeIdadeCarro(){
        int idadeCarro = 2024 - ano;
        System.out.println("a idade do carro é " + idadeCarro);
        return idadeCarro;

    }
}
