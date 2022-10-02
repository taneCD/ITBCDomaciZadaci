package DomaciCetvrtaNedNedelja;
public class Televizor {
    int jacinaTona = 0;
    int trenutniProgram = 1;
    boolean ukljucen = false;

    public void promeniProgramNavise(){
        if(ukljucen) {
            trenutniProgram = trenutniProgram + 1;
             if(trenutniProgram>100){
                trenutniProgram=0;

            }
            System.out.println("Trenutni program: "+trenutniProgram);
        }
    }
    public void promeniProgramNanize(){
        if(ukljucen) {
            trenutniProgram = trenutniProgram - 1;
            if(trenutniProgram<0) {
                trenutniProgram=100;

            }
            System.out.println("Trenutni program: "+trenutniProgram);
        }
    }
    void vratiTrenutniProgram(){
        if(ukljucen) {
            trenutniProgram = 1;
        }
        System.out.println("Trenutni program: "+trenutniProgram);
    }
    void ukljuci() {
        ukljucen = true;
    }
    void iskljuci() {
        ukljucen = false;
    }
    void pojacajTon() {
        if(ukljucen) {
            jacinaTona = jacinaTona + 1;
            if(jacinaTona>100){
                jacinaTona=100;
            }
            System.out.println("Trenutna jacina tona: "+jacinaTona);
        }
    }
    void smanjiTon() {
        if(ukljucen) {
            jacinaTona = jacinaTona - 1;
            if(jacinaTona<0){
                jacinaTona=0;
            }
            System.out.println("Trenutna jacina tona: "+jacinaTona);
        }
    }
    void iskljuciTon() {
        if(ukljucen) {
            jacinaTona = 0;
        }
    }
    public void vratiJacinuTona(){
        if(ukljucen){
            jacinaTona=0;
        }
        System.out.println("Trenutna jacina tona: "+jacinaTona);
    }
    Televizor(){}

    public String ispisiParametre(){
        return "Jacina tona: " +jacinaTona+", trenutni program: "+trenutniProgram+", TV je ukljucen: "+ukljucen;
    }

}
