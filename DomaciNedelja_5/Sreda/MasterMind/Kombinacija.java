package MasterMind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Kombinacija {

    private Random rnd = new Random();
    private String[] dozvoljenaSlova;
    public String[] combo;
    public boolean validanUnos = true;
    public boolean pogodak = false;
    private Skocko skocko = null;

    public final static String POGODAK = "O";
    public final static String POGRESNO_MESTO = "X";

    public boolean getPogodak() {
        return this.pogodak;
    }

    public String[] getCombo() {
        return this.combo;
    }

    public boolean getValidanUnos() {
        return this.validanUnos;
    }

    private void RandomizeCombo() {
        //randomize combo, potrebno za kreiranje resenja.
        if (combo != null && combo.length > 0) {
            for (int i = 0; i < combo.length; i++) {
                int nextIndex = rnd.nextInt(this.dozvoljenaSlova.length);
                combo[i] = dozvoljenaSlova[nextIndex];
            }
        }
    }

    public Kombinacija(Skocko _skocko) {
        this.skocko = _skocko;
        if (skocko.getDozvoljenaSlova() != null && skocko.getDozvoljenaSlova().length > 0) {
            this.dozvoljenaSlova = skocko.getDozvoljenaSlova();
            this.combo = new String[this.dozvoljenaSlova.length];
            RandomizeCombo();
        }
    }

    public Kombinacija(Skocko _skocko, Scanner sc) {
        this.skocko = _skocko;
        System.out.println("Unesite polja u formatu:" + " X".repeat(skocko.getDozvoljenaSlova().length));
        String input = sc.nextLine();
        this.combo = input.trim().split(" ");
        validanUnos = true;
        for (int j = 0; j < this.combo.length; j++) {
            if (this.combo[j].length() != 1) {
                System.out.println("Uneti tekst nije u pravilnom formatu!\n");
                validanUnos = false;
                break;
            }
            var lowerLetter = this.combo[j].toLowerCase();
            if (!skocko.getDozvoljenaSlovaList().contains(lowerLetter))
            {
                System.out.println("Uneli ste nedozvoljeno slovo: " + lowerLetter + "!\n");
                validanUnos = false;
                break;
            }
        }
    }

    public String[] CompareTo(Kombinacija resenje) {
        if (this == resenje) return this.SvePogoci();
        if (resenje == null || resenje.getCombo() == null || resenje.getCombo().length == 0) return null;
        if (this.combo == null || this.combo.length == 0) return null;

        int pogodaka = 0;
        var solutionListTemp = new ArrayList<String>(Arrays.asList(resenje.getCombo()));
        String[] pogoci = new String[resenje.getCombo().length];
        for (int j = 0; j < this.combo.length; j++) {
            var lowerLetter = this.combo[j].toLowerCase();
            if (lowerLetter.equals(resenje.getCombo()[j])) {
                pogodaka++;
                pogoci[j] = lowerLetter;
                solutionListTemp.remove(j);
                solutionListTemp.add(j, "");
            }
        }
        if (pogodaka == resenje.getCombo().length) {
            this.pogodak = true;
            return SvePogoci();
        }
        int tacnoSlovoPogresnoMesto = 0;
        for (int j = 0; j < this.combo.length; j++) {
            var lowerLetter = this.combo[j].toLowerCase();
            if (pogoci[j] != lowerLetter && solutionListTemp.contains(lowerLetter)) {
                solutionListTemp.remove(lowerLetter);
                tacnoSlovoPogresnoMesto++;
            }
        }
        return IspisPogodaka(pogodaka, tacnoSlovoPogresnoMesto);
    }

    public String[] IspisPogodaka(int pogodaka, int tacnoSlovoPogresnoMesto) {
        String[] retVal = new String[pogodaka + tacnoSlovoPogresnoMesto];
        for (int i = 0; i < pogodaka; i++) {
            retVal[i] = Kombinacija.POGODAK;
        }
        for (int j = pogodaka; j < pogodaka + tacnoSlovoPogresnoMesto; j++) {
            retVal[j] = Kombinacija.POGRESNO_MESTO;
        }
        System.out.println(((" " + POGODAK).repeat(pogodaka) + (" " + POGRESNO_MESTO).repeat(tacnoSlovoPogresnoMesto)).trim() + "\n");
        return retVal;
    }

    public String[] SvePogoci() {
        return IspisPogodaka(this.skocko.getResenje().length, 0);
    }
}
