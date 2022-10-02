package MasterMind;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Skocko {
        private int max_pokusaja;
        private Kombinacija resenje;
        private String[] dozvoljenaSlova;
        private List<String> tempDozvoljenaSlova;
        private boolean pogodak = false;

        public Skocko(int _pokusaja, String[] _dozvoljenaSlova) {
            this.max_pokusaja = _pokusaja;
            this.dozvoljenaSlova = _dozvoljenaSlova;
            this.tempDozvoljenaSlova = Arrays.asList(this.dozvoljenaSlova);
            this.resenje = new Kombinacija(this);
        }

        public Kombinacija getKombinacijaResenja() {
            return this.resenje;
        }

        public String[] getResenje() {
            return this.resenje.getCombo();
        }

        public String[] getDozvoljenaSlova() {
            return this.dozvoljenaSlova;
        }

        public List<String> getDozvoljenaSlovaList() {
            return this.tempDozvoljenaSlova;
        }

        public void Igraj() {
            System.out.println("\n*** Igra je pocela ***\n");
            System.out.println("Imate " + max_pokusaja + " pokusaja da nadjete kombinaciju!\nDozvoljeni karakteri: " + Arrays.toString(dozvoljenaSlova) + "\n");
            int pokusaji = 0;
            Scanner sc = new Scanner(System.in);
            while (pokusaji < max_pokusaja) {
                System.out.println("pokusaj #" + (pokusaji + 1) + "/" + max_pokusaja);
                var novaKomb = new Kombinacija(this, sc);
                if (!novaKomb.getValidanUnos()) {
                    continue;
                }
                pokusaji++;
                novaKomb.CompareTo(this.resenje);
                this.pogodak = novaKomb.getPogodak();
                if (this.pogodak) {
                    pogodak = true;
                    break;
                }
            }
            if (this.pogodak) {
                System.out.println("Bravo, pogodak iz: " + pokusaji + ". pokusaja!");
            } else {
                System.out.println("Zao mi je, ali niste uspeli da pronadjete resenje sa: " + max_pokusaja + " dozvoljenih pokusaja!");
                System.out.println("\nResenje je:\n" + Arrays.toString(getResenje()) + "\n");
            }
            System.out.println("\n*** Igra je gotova ***\n");
            sc.close();
        }
    }
