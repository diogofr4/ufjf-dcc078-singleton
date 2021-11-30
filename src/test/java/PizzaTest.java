import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {
    @Test
    public void deveRetornarTamanhoDaPizza(){
        String tamanho = "familia";
        String borda = "recheada";
        Pizza pizza = new Pizza.Builder(tamanho, borda).build();

        assertEquals(tamanho, pizza.getTamanho());
    }

    @Test
    public void deveRetornarBordaDaPizza(){
        String tamanho = "familia";
        String borda = "recheada";
        Pizza pizza = new Pizza.Builder(tamanho, borda).build();

        assertEquals(borda, pizza.getBorda());
    }

    @Test
    public void deveRetornarSeTemQueijoAdicional(){
        String tamanho = "familia";
        String borda = "recheada";
        Pizza pizza = new Pizza.Builder(tamanho, borda)
                .queijoAdicional(true)
                .build();

        assertEquals(true, pizza.temQueijo());
    }

    @Test
    public void deveRetornarSeTemLomboAdicional(){
        String tamanho = "familia";
        String borda = "recheada";
        Pizza pizza = new Pizza.Builder(tamanho, borda)
                .lomboAdicional(true)
                .build();

        assertEquals(true, pizza.temLombo());
    }

    @Test
    public void deveRetornarSeTemManjericaoAdicional(){
        String tamanho = "familia";
        String borda = "recheada";
        Pizza pizza = new Pizza.Builder(tamanho, borda)
                .manjericaoAdicional(true)
                .build();

        assertEquals(true, pizza.temManjericao());
    }

    @Test
    public void deveRetornarSeTemCatupiryAdicional(){
        String tamanho = "familia";
        String borda = "recheada";
        Pizza pizza = new Pizza.Builder(tamanho, borda)
                .catupiryAdicional(true)
                .build();

        assertEquals(true, pizza.temCatupiry());
    }
}