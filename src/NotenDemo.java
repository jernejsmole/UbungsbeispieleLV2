public class NotenDemo {
    public static void main(String[] args) {
        System.out.println(getNotentext(90));
        System.out.println(getNotentext(50));
        System.out.println(getNotentext(51));
        System.out.println(getNotentext(77));
        System.out.println(getNotentext(40));
    }

    public static String getNotentext(int punkte){
        if (punkte >= 90){
            return "Sehr Gut";}
        else if (punkte > 78){
            return "Gut";}
        else if (punkte > 65){
            return "Befridigend";
        }else if (punkte > 51){
            return "Genugend";
        }else return "Ungenugend";

        }
    }

