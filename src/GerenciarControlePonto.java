import model.Gerente;
import model.Operador;
import model.RegistroPonto;
import model.Secretaria;

public class GerenciarControlePonto {
    public static void main(String[] args) throws InterruptedException {
        Gerente gerente = new Gerente();
        gerente.setNome("Gerente");
        gerente.setDocumento("12345678910");
        gerente.setEmail("gerente@domain.com");
        gerente.setIdFunc(1);
        gerente.setLogin("gerente");
        gerente.setSenha("gerente");

        Secretaria secretaria = new Secretaria();
        secretaria.setNome("Secretaria");
        secretaria.setDocumento("12345678911");
        secretaria.setEmail("secretaria@domain.com");
        secretaria.setIdFunc(2);
        secretaria.setTelefone("1999988776666");
        secretaria.setRamal("256");

        Operador operador = new Operador();
        operador.setNome("Operador");
        operador.setDocumento("12345678912");
        operador.setEmail("operador@domain.com");
        operador.setIdFunc(3);
        operador.setValorHora(20.5);

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