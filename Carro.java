public class Carro {
    private String modelo;
    private int ano;
    private String cor;
    private double preco;


    //Construtor padrão
    public Carro (){
        this("Modelo Desconhecido", 0, "Cor Indefinida", 0);
    /*  modelo = "Modelo desconhecido";
        ano = 0;
        cor = "Cor indefinida";
        preco = 0.0;
    */   
    }

    //Constutor com parâmetros
    public Carro (String modelo){
        this(modelo, 2022, "Cor padrão", 50000.0);
       /* this.modelo = modelo;
        this.ano =  2022;
        this.cor = "Cor padrão";
        this.preco = 50000.0;
         */
    }
     public Carro(String modelo, int ano, String cor, double preco) {

        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;

    }

    // Método calcularPreco sem impostos
    public double calcularPreco() {
        return preco;
    }

    // Método calcularPreco com imposto
    public double calcularPreco(double imposto) {
        return preco + (preco * imposto);
    }

    public void mostrarinfo(){
        System.out.println("Modelo: " + modelo + ", Ano: " + ano +", Cor : "+ cor+ ", Preço:" +preco);
    }


     // Método principal
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro("Gol");
        Carro carro3 = new Carro("Corolla", 2023, "Vermelho", 23000.0);

        carro1.mostrarinfo();
        carro2.mostrarinfo();
        carro3.mostrarinfo();
    }   
    
}