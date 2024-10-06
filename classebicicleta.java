// Classe Bicicleta
class Bicicleta extends Veiculo {
    private String marca;
    private String material;
    private int marchas;
    private boolean amortecedor;

    public Bicicleta(String modelo, int anoFabricacao, String montadora, String cor, int odometro, String marca, String material, int marchas, boolean amortecedor) {
    super(modelo, anoFabricacao, montadora, cor, odometro);
    this.marca = marca;
    this.material = material;
    this.marchas = marchas;
    this.amortecedor = amortecedor;
    }

    @Override
    public void insert() {
    System.out.println("Inserindo dados da Bicicleta: " + getModelo());
    }

    // Getters e Setters
    public String getMarca() {
    return marca;
    }

    public void setMarca(String marca) {
    this.marca = marca;
    }

    public String getMaterial() {
    return material;
    }

    public void setMaterial(String material) {
    this.material = material;
    }

    public int getMarchas() {
    return marchas;
    }

    public void setMarchas(int marchas) {
    this.marchas = marchas;
    }

    public boolean isAmortecedor() {
    return amortecedor;
    }

    public void setAmortecedor(boolean amortecedor) {
    this.amortecedor = amortecedor;
    }
}