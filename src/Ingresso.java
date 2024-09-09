
public class Ingresso {

    private float valor;

    public void imprimirValor(){
        System.out.printf("Valor do ingresso: R$ %.2f reais %n", valor);
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    
    
}