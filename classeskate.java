// Classe Skate
class Skate extends Veiculo {
    private String cor;
    private String tipoRodas;

    public Skate(String modelo, int anoFabricacao, String montadora, String cor, int odometro, String tipoRodas) {
    super(modelo, anoFabricacao, montadora, cor, odometro);
    this.cor = cor;
    this.tipoRodas = tipoRodas;
    }

    @Override
    public void insert() {
    System.out.println("Inserindo dados do Skate: " + getModelo());
    }

    // Getters e Setters
    public String getTipoRodas() {
    return tipoRodas;
    }

    public void setTipoRodas(String tipoRodas) {
    this.tipoRodas = tipoRodas;
    }
}

