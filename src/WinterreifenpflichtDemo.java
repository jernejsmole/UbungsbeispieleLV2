public class WinterreifenpflichtDemo {
    public static void main(String[] args) {
        isWinterpflicht(1,false);
        isWinterpflicht(3,true);
        System.out.println(isWinterpflicht(11,true));
    }
    public static String isWinterpflicht (int temperatur, boolean rutschigeFahrbahn){
        if ((temperatur< 10 && rutschigeFahrbahn) || temperatur < 4){
            return "Winterrreifen sind erforderlich";}
        else {return "Winterreifen sind nicht erfordelich";}

        }
    }

