package Main;

public class MitumituVordlust {

        public static void main(String[] args) {
            boolean a = true;
            boolean b = false;

            int arv1 = 10;
            int arv2 = 20;

            if (arv1 > arv2 || (a != b || a == b) && 10 == 15) { // && samal ajal ka
                System.out.println("Õige");
            } else {
                System.out.println("Muu");
            }

        }
}

