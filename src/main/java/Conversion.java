public class Conversion {

    private int decimal;
    private long binario;

    public Conversion(int decimal) {
        this.decimal = decimal;
        setBinario();
    }

    public int divisaoPorDois(int inteiro) {
        return inteiro / 2;
    }

    public int restoDivisaoPorDois(int inteiro) {
        return inteiro % 2;
    }

    public String incrementaBinario() {
        String binario = "";
        int resto;
        while (decimal > 0) {
             resto = restoDivisaoPorDois(decimal);
             decimal = divisaoPorDois(decimal);
             binario = resto + binario;
        }
        return binario;
    }

    public void setBinario() {
        this.binario = Long.parseLong(incrementaBinario());
    }

    public long getBinario() {
        return binario;
    }

}
