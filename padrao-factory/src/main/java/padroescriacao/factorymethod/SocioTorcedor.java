package padroescriacao.factorymethod;

public class SocioTorcedor implements ISocio {

    @Override
    public String executar() {
        return "Sócio Torcedor ativado";
    }

    @Override
    public String cancelar() {
        return "Sócio Torcedor cancelado";
    }
}