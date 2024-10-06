// Classe Caminhão
class Caminhao extends Veiculo {
    private int eixos;
    private double pesoBruto;

    public Caminhao(String modelo, int anoFabricacao, String montadora, String cor, int odometro, int eixos, double pesoBruto) {
    super(modelo, anoFabricacao, montadora, cor, odometro);
    this.eixos = eixos;
    this.pesoBruto = pesoBruto;
    }

    @Override
    public void insert() {
    System.out.println("Inserindo dados do Caminhão: " + getModelo());
    }

    // Getters e Setters
    public int getEixos() {
    return eixos;
    }

    public void setEixos(int eixos) {
    this.eixos = eixos;
    }

    public double getPesoBruto() {
    return pesoBruto;
    }

    public void setPesoBruto(double pesoBruto) {
    this.pesoBruto = pesoBruto;
    }
}