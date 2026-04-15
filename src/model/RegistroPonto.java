package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistroPonto {
    public String apresentarRegistroPonto() throws InterruptedException {
        StringBuilder sb = new StringBuilder();
        String nome = getFunc().getNome();
        LocalDate hoje = LocalDate.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String dataRegistro = hoje.format(dateFormatter);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalDateTime hojeHora = LocalDateTime.now();
        String horaEntrada = hojeHora.format(dateTimeFormatter);

        sb.append("=======================================").append("\n");
        sb.append("Funcionário: ").append(nome).append("\n");
        sb.append("Data de Registro: ").append(dataRegistro).append("\n");
        sb.append("Hora de Entrada: ").append(horaEntrada).append("\n");
        Thread.sleep(1000);
        hojeHora = LocalDateTime.now();
        String horaSaida = hojeHora.format(dateTimeFormatter);

        sb.append("=======================================").append("\n");
        sb.append("Funcionário: ").append(nome).append("\n");
        sb.append("Data de Registro: ").append(dataRegistro).append("\n");
        sb.append("Hora de Entrada: ").append(horaEntrada).append("\n");
        sb.append("Hora de Saída: ").append(horaSaida).append("\n");
        return sb.toString();
    }

    public long getIdRegPonto() {
        return idRegPonto;
    }

    public void setIdRegPonto(long idRegPonto) {
        this.idRegPonto = idRegPonto;
    }

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    private long idRegPonto;
    private Funcionario func;
    private LocalDate dataRegistro;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;
}
