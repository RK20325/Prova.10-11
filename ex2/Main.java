public class Main {
    public static void main(String[] args) {
        Tiquete tiquete = new Tiquete("ABC-1234", 135, new Rotativo());
        System.out.println("Placa: " + tiquete.getPlaca()
                + " | Permanencia: " + tiquete.getMinutos() + " min");

        System.out.printf("Rotativo: R$ %.2f%n", tiquete.calcularValor());

        tiquete.setEstrategia(new Mensalista());
        System.out.printf("Mensalista: R$ %.2f%n", tiquete.calcularValor());

        tiquete.setEstrategia(new Conveniado());
        System.out.printf("Conveniado: R$ %.2f%n", tiquete.calcularValor());
    }
}
