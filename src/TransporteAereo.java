public class TransporteAereo extends Transportadora{

    public double calculaFrete(double altura, double largura) {
        return 0.10 * (altura + largura);
    }

}
