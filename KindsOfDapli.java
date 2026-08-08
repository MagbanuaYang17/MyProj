public class KindsOfDapli {

    private String mgaGustoKo[][] = {
        {"Adobo","Afritada", "Menudo"},
        {"Sinigang", "Tinola", "Bulalo"},
        {"Lechon", "Inihaw", "Sisig"},
        {"Pancit", "Sotanghon", "Lomi"},
        {"Tocino", "Humba", "Tapa"}
    };
    private String DapLiKo[] = {"Sarsa", "Sabaw", "Sinugba", "Noodles", "Tam-is"};
    private final String[] dapliKinds;

    public KindsOfDapli(String[] dapliKinds) {
        this.dapliKinds = dapliKinds;
    }
    public static void main(String[] args) {
        String[] dapliKinds = {"Sarsa", "Sabaw", "Sinugba", "Noodles", "Tam-is"};
        KindsOfDapli app = new KindsOfDapli(dapliKinds);
        app.Display();
    }

    void Display() {
        System.out.println("Mga Dapli Ko:");
        for (int i = 0; i < DapLiKo.length; i++) {
            String gusto = "";
            String medj = "";
            String ndi = "";
            if (i < mgaGustoKo.length) {
                gusto = mgaGustoKo[i][0];
                if (mgaGustoKo[i].length > 1) medj = mgaGustoKo[i][1];
                if (mgaGustoKo[i].length > 2) ndi = mgaGustoKo[i][2];
            }
            System.out.println("DapLiKo: " + DapLiKo[i] + " | Mga Gusto Ko: " + gusto + "| Medj Gusto Ko: " + medj + " | Ndi Ko Gusto: " + ndi);
        }
    }
}

