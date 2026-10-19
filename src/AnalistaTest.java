import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnalistaTest {
    Analista analista;
    @BeforeEach 
    public void init (){
        analista = new Analista("George", "40028922999");
        analista.addHorasExtras(10);
    }
    @Test 
    public void pagamento(){
        double valor = analista.registrarPagamento();
        assertEquals(valor, 5373.3, 0.1);
    }
    @Test 
    public void horaExtra(){
        
        double resposta = analista.addHorasExtras(30);
        assertEquals(40, resposta,0.01); //esperado,resultado
    }

}
