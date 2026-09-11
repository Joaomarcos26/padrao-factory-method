package padroescriacao.factorymethod;

public class SocioFactory {

    public static ISocio obterSocio(String socio) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("padroescriacao.factorymethod.Socio" + socio);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Sócio inexistente");
        }
        if (!(objeto instanceof ISocio)) {
            throw new IllegalArgumentException("Sócio inválido");
        }
        return (ISocio) objeto;
    }
}