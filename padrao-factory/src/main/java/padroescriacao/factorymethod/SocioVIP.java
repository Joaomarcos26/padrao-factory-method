package padroescriacao.factorymethod;

public class SocioVIP implements ISocio {

    @Override
    public String executar() {
        return "Sócio VIP ativado";
    }

    @Override
    public String cancelar() {
        return "Sócio VIP cancelado";
    }
}