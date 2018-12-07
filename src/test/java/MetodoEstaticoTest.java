import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

import database.Conexao;


@RunWith(PowerMockRunner.class)
@PrepareForTest(Conexao.class)
public class MetodoEstaticoTest {
	 
	@Mock
    Conexao conexao;   
	
    @Before
    public void setUp() {
    }
    
    @Test public void testSingleton() {        
    	Whitebox.setInternalState(Conexao.class, "instancia", conexao);
    	assertEquals(conexao, Conexao.getInstancia());        
    }
    
    @Test public void  testMetodoEstatico() {
    	PowerMockito.mockStatic(Conexao.class);
    	PowerMockito.when(Conexao.estaFechado()).thenReturn(true);
    	assertEquals(true, Conexao.estaFechado());    
    	
    }
}
