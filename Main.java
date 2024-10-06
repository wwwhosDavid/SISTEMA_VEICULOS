public class Main {
    public static void main(String[] args) throws Exception {

    // Classe para testar o sistema
    AutomovelDomestico carro = new AutomovelDomestico("Honda Civic", 2020, "Honda", "Prata", 15000, 5, "ABS", true);
    carro.insert();

    Motocicleta moto = new Motocicleta("Harley-Davidson", 2018, "Harley", "Preta", 8000, 1200, 95);
    moto.insert();

    Caminhao caminhao = new Caminhao("Volvo FH", 2022, "Volvo", "Branco", 50000, 4, 18000);
    caminhao.insert();

    Bicicleta bike = new Bicicleta("Caloi", 2021, "Caloi", "Vermelha", 100, "Caloi", "Alumínio", 21, true);
    bike.insert();

    Skate skate = new Skate("Skateboard Pro", 2023, "XYZ", "Azul", 50, "Rodas de poliuretano");
    skate.insert();

    }
}

