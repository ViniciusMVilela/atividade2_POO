public class TransporteNautico extends Transportadora{

    public double calculaFrete(double altura, double largura) {
        return 0.20 * (altura/largura);
    }
}
