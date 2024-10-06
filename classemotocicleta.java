// Classe Motocicleta
class Motocicleta extends Veiculo {
    private int cilindradas;
    private int torque;

    public Motocicleta(String modelo, int anoFabricacao, String montadora, String cor, int odometro, int cilindradas, int torque) {
    super(modelo, anoFabricacao, montadora, cor, odometro);
    this.cilindradas = cilindradas;
    this.torque = torque;
    }

    @Override
    public void insert() {
    System.out.println("Inserindo dados da Motocicleta: " + getModelo());
    }

    // Getters e Setters
    public int getCilindradas() {
    return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
    this.cilindradas = cilindradas;
    }

    public int getTorque() {
    return torque;
    }

    public void setTorque(int torque) {
    this.torque = torque;
    }
}