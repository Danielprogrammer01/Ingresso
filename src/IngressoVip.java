public class IngressoVip extends Ingresso {

    private float valorAdicional;

    public float valorIngressoVip(){

        return getValor() + valorAdicional;
    }

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public float getValorAdicional() {
        return valorAdicional;
    }

    
}
