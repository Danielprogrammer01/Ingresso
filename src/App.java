public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        Ingresso ingresso = new Ingresso();
        ingresso.setValor(100.0f);
        ingresso.imprimirValor();

        IngressoVip ingressoVip = new IngressoVip();

        ingressoVip.setValor(100.0f);
        ingressoVip.setValorAdicional(150.99f);

        System.out.printf("Valor do ingresso VIP: R$ %.2f reais\n", ingressoVip.valorIngressoVip());
        System.out.printf("Adicional: R$ %.2f reais\n", ingressoVip.getValorAdicional());
    }
}
