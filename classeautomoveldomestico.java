// Classe Automóvel Doméstico
class AutomovelDomestico extends Veiculo {
    private int maxPassageiros;
    private String tipoFreio;
    private boolean airbag;

    public AutomovelDomestico(String modelo, int anoFabricacao, String montadora, String cor, int odometro, int maxPassageiros, String tipoFreio, boolean airbag) {
    super(modelo, anoFabricacao, montadora, cor, odometro);
    this.maxPassageiros = maxPassageiros;
    this.tipoFreio = tipoFreio;
    this.airbag = airbag;
    }

    @Override
    public void insert() {
    System.out.println("Inserindo dados do Automóvel Doméstico: " + getModelo());
    }

    // Getters e Setters
    public int getMaxPassageiros() {
    return maxPassageiros;
    }

    public void setMaxPassageiros(int maxPassageiros) {
    this.maxPassageiros = maxPassageiros;
    }

    public String getTipoFreio() {
    return tipoFreio;
    }

    public void setTipoFreio(String tipoFreio) {
    this.tipoFreio = tipoFreio;
    }

    public boolean isAirbag() {
    return airbag;
    }

    public void setAirbag(boolean airbag) {
    this.airbag = airbag;
    }
}