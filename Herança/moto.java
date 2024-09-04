public class moto extends veiculo {
    private boolean temCarenagem;

    public moto(String marca, String modelo, int ano, boolean temCarenagem) {
        super(marca, modelo, ano);
        this.temCarenagem = temCarenagem;
    }

    public void empinar() {
        System.out.println("A moto está empinando.");
    }

    @Override
    public void exibirInformacao() {
        super.exibirInformacao();
        System.out.println("Tem Carenagem: " + (temCarenagem ? "Sim" : "Não"));
    }

       
    public boolean isTemCarenagem() {
        return temCarenagem;
    }

    public void setTemCarenagem(boolean temCarenagem) {
        this.temCarenagem = temCarenagem;
    }
}

