public class Main {
    public static void main(String[] args) {
        TransporteAereo transporteAereo = new TransporteAereo();
        TransporteNautico transporteNautico = new TransporteNautico();
        double altura = 6.00;
        double largura = 8.50;

        System.out.println(transporteAereo.calculaFrete(altura,largura));
        System.out.println(transporteNautico.calculaFrete(altura,largura));
    }

}
