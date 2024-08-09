public class CarroParcela {
    public static void main(String[] args) {
        double valorCarro = 30000;
        double valorParcela;
        int quantidadeParcelas=1;

        while (true){
            valorParcela = valorCarro/quantidadeParcelas;
            if (valorParcela < 1000){
                break;
            }
            System.out.println("Divido em "+quantidadeParcelas+" Valor de cada parcela: "+valorParcela);
            quantidadeParcelas++;
        }
    }
}
