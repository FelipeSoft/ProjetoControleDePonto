import model.Gerente;
import model.Operador;
import model.RegistroPonto;
import model.Secretaria;

public class GerenciarControlePonto {
    public static void main(String[] args) throws InterruptedException {
        Gerente gerente = new Gerente();
        gerente.setNome("Gerente");

        Secretaria secretaria = new Secretaria();
        secretaria.setNome("Secretaria");

        Operador operador = new Operador();
        operador.setNome("Operador");

        RegistroPonto registroPontoGerente = new RegistroPonto();
        registroPontoGerente.setFunc(gerente);

        RegistroPonto registroPontoSecretaria = new RegistroPonto();
        registroPontoSecretaria.setFunc(secretaria);

        RegistroPonto registroPontoOperador = new RegistroPonto();
        registroPontoOperador.setFunc(operador);

        System.out.println(registroPontoGerente.apresentarRegistroPonto());
        System.out.println(registroPontoSecretaria.apresentarRegistroPonto());
        System.out.println(registroPontoOperador.apresentarRegistroPonto());
    }
}