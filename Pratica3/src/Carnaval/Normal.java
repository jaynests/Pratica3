package Carnaval;

public class Normal  extends Ingresso {
    public Normal(double valorIngresso) {
        super(valorIngresso);
    }

    public String imprimeIngresso() {
        return "Ingresso Normal: " + getValorIngresso();
    }

}

