package padroescriacao.factorymethod;

public class SocioProprietario implements ISocio {

    @Override
    public String executar() {
        return "Sócio Proprietário ativado";
    }

    @Override
    public String cancelar() {
        return "Sócio Proprietário cancelado";
    }
}