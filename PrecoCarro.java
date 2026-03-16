public class PrecoCarro {

    private String modelo;
    private int ano;

    // Construtor padrão
    public Carro() {
        modelo = "Modelo desconhecido";
        ano = 0;
    }

    // Construtor com parâmetros
    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public void mostrarInfo() {
        System.out.println("Modelo: " + modelo + ", Ano: " + ano);

    }

} 