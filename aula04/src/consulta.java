public class consulta {


    private final String dataConsulta;
    private final String hora;
    private final String medico;
    private double valor;

    public consulta(String dataConsulta, String hora, String medico) {
        this.dataConsulta = dataConsulta;
        this.hora = hora;
        this.medico = medico;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public String getHora() {
        return hora;
    }

    public String getMedico() {
        return medico;
    }
}
