//Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número.

public class Calculadora {
    double numeroDuplicado(double numero){
        double resultado = numero * 2;
        return resultado;
    }

    void mostraNumeroDuplicado(double numero){
        double resultado = numeroDuplicado(numero);
        System.out.println("O dobro é igual a " + resultado);
    }
}
