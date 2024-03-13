public class Validar {
    private String validar;
    private int contaExistente = 1021;
    private String agenciaExistente = "067-8";

    public String validator(Dados dados) {
        int conta = dados.getConta();
        String agencia = dados.getAgencia();

        validar = (contaExistente == conta && agenciaExistente.equals(agencia)) ? "Usuario valido!" : "Usuario nao e valido!";
        return validar;
    }
}
