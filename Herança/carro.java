public class carro extends veiculo {
    private int portas;

    public carro(String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano);
        this.portas = portas;
    }

    public void abrirPortaMalas() {
        System.out.println("A porta-malas do carro está aberta.");
    }

    @Override
    public void exibirInformacao() {
        super.exibirInformacao();
        System.out.println("Número de Portas: " + portas);
    }

    
    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
}
