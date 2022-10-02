    public class NedeljaZadatak3 {
        public static void main(String[] args) {
            String tekstSaZagradama = "((({}[])))(";
            System.out.println(tekstSaZagradama);
            boolean zagradeSuZatvorene = proveriDaLiSuZagradeZatvorene(tekstSaZagradama);
            System.out.println(zagradeSuZatvorene);
        }

        public static boolean proveriDaLiSuZagradeZatvorene(String tekst) {
            while (tekst.contains("{}") || tekst.contains("[]") || tekst.contains("()")) {
                tekst = tekst.replace("{}", "").replace("[]", "").replace("()", "").trim();
            }
            return tekst.length() == 0;

        }
    }
