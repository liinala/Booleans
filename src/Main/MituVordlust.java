package Main;

/**
 * Created by Liina on 24/01/2017.
 */
public class MituVordlust {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        int arv1= 10;
        int arv2 = 20;

        if (arv1 > arv2 && a != b){ // && samal ajal ka
            System.out.println("Õige");
        }else {
            System.out.println("Muu");
        }
    }
}

