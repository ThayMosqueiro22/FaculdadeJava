public class Carro {
    private String modelo;
    private int ano;
    private String cor;

    //Construtor padrão
    public Carro (){
        modelo = "Modelo desconhecido";
        ano = 0;
        this.cor = "Cor indefinida";

    }

    //Constutor com parâmetros
    public Carro (String modelo){
        this.modelo = modelo;
        this.ano =  2022;
        this.cor = "Cor padrão";
    }
     public Carro(String modelo, int ano, String cor) {

        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;

    }

    public void mostrarinfo(){
        System.out.println("Modelo: " + modelo + ", Ano: " + ano +", Cor : "+ cor);
    }

     // Método principal
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro("Gol");
        Carro carro3 = new Carro("Corolla", 2023, "Vermelho");

        carro1.mostrarinfo();
        carro2.mostrarinfo();
        carro3.mostrarinfo();
    }   
    
}