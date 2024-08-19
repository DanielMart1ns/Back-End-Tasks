package factory;

public class Main {
    public static void main(String[] args) {
        CarFactory carStandardVersion = new StandardVersion("Popular",
                2,
                "Branco",
                500l,
                "Flex");

        CarFactory carLuxuryVersion = new LuxuryVersion("Versão de luxo",
                4,
                "Preto",
                1200l,
                "Flex");

        CarFactory carSuperSportVersion = new SuperSportVersion("Esportivo",
                2,
                "Vinho",
                1900l,
                "Gasolina");

        carStandardVersion.setLaunch(true);
        carLuxuryVersion.setLaunch(true);
        carSuperSportVersion.setLaunch(true);
    }
}