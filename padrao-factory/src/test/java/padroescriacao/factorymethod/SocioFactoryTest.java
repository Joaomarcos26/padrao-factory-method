package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SocioFactoryTest {

    @Test
    void deveRetornarExcecaoParaSocioInexistente() {
        try {
            ISocio socio = SocioFactory.obterSocio("Inexistente");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Sócio inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaSocioInvalido() {
        try {
            ISocio socio = SocioFactory.obterSocio("Factory");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Sócio inválido", e.getMessage());
        }
    }

    @Test
    void deveExecutarSocioTorcedor() {
        ISocio socio = SocioFactory.obterSocio("Torcedor");
        assertEquals("Sócio Torcedor ativado", socio.executar());
    }

    @Test
    void deveCancelarSocioTorcedor() {
        ISocio socio = SocioFactory.obterSocio("Torcedor");
        assertEquals("Sócio Torcedor cancelado", socio.cancelar());
    }

    @Test
    void deveExecutarSocioVIP() {
        ISocio socio = SocioFactory.obterSocio("VIP");
        assertEquals("Sócio VIP ativado", socio.executar());
    }

    @Test
    void deveCancelarSocioVIP() {
        ISocio socio = SocioFactory.obterSocio("VIP");
        assertEquals("Sócio VIP cancelado", socio.cancelar());
    }

    @Test
    void deveExecutarSocioProprietario() {
        ISocio socio = SocioFactory.obterSocio("Proprietario");
        assertEquals("Sócio Proprietário ativado", socio.executar());
    }

    @Test
    void deveCancelarSocioProprietario() {
        ISocio socio = SocioFactory.obterSocio("Proprietario");
        assertEquals("Sócio Proprietário cancelado", socio.cancelar());
    }
}