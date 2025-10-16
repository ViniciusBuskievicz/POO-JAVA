package atividadesaula12.exercicio1;

interface GeradorRelatorio {
    void gerar(RelatorioFinanceiro relatorio);
}

class GeradorPDF implements GeradorRelatorio {
    public void gerar(RelatorioFinanceiro relatorio) {
        
        System.out.println("Gerando relatório em PDF...");
    }
}

class GeradorExcel implements GeradorRelatorio {
    public void gerar(RelatorioFinanceiro relatorio) {
   
        System.out.println("Gerando relatório em Excel...");
    }
}

public class RelatorioFinanceiro {

}

class EnviadorEmail {
    public void enviar(RelatorioFinanceiro relatorio) {
        System.out.println("Enviando relatório por e-mail...");
    }
}