public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        int tukst = 1000;
//        int tukst9 = 9999;
//        int viso1 = tukst + (int) (Math.random() * ((tukst9 - tukst) + 1));
//        int viso2 = tukst + (int) (Math.random() * ((tukst9 - tukst) + 1));

        String phoNo = "+37063544789";
        phoNo = "37063544789";
        phoNo = "863544789";
        phoNo = "63544789";
        phoNo = "370 635 44789";
        phoNo = "+370 635 44789";
        phoNo = "8 635 44789";
//        phoNo = "+370 (635) 44789";
//        phoNo = "+370(635)44789";
//        phoNo = "+370 (635)44789";
//        phoNo = "+370(635) 44789";
//        phoNo = "00370(635) 44789";
        phoNo.contains("+");
        phoNo.equals("labas");
        System.out.println("labDF5sdrzSFD54dfas vakERWRWaras".replaceAll("[a-zA-Z]","*"));
        phoNo.split(" ");
        phoNo = phoNo.replaceAll("[^0-9]","");
        System.out.println( phoNo.substring(phoNo.length()-8));
        //               01234567
//        String rndTxt = "ABCDEFGH";
//        System.out.println(rndTxt.substring(2,5));
//        System.out.println(rndTxt.substring(5,8));
//        System.out.println(rndTxt.length());
//        System.out.println(rndTxt.substring(rndTxt.length()-3, rndTxt.length() ));
        System.out.println("labas".charAt(2));
        String starWars = "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope";
        System.out.println(starWars);


        System.out.println("----------------------------1--------------------------");

        String fname = "Will";
        String lname = "Smith";

        if (fname.length() < lname.length()) {
            System.out.println(fname);
        }
            if (fname.length() > lname.length()){
                System.out.println(lname);
            }

        System.out.println("----------------------------2--------------------------");

        String firstname = "Johnny";
        String lastlname = "Depp";
        System.out.println(firstname.toUpperCase());
        System.out.println(lastlname.toLowerCase());

        System.out.println("----------------------------3--------------------------");

        String newname = "Bruce";
        String oldname = "Willis";
        String initials = newname.charAt(0) + "." + oldname.charAt(0) + ".";
        System.out.println(initials);

        System.out.println("----------------------------4--------------------------");

        String name1 = "Jim";
        String lname1 = "Carrey";
        String last3l = name1.substring (name1.length() - 3) + lname1.substring(lname1.length() - 3);
        System.out.println(last3l);

        System.out.println("----------------------------5--------------------------");

        String words =  "An American in Paris";
        System.out.println("An American in Paris".replaceAll("[aA]","*"));

        System.out.println("----------------------------6--------------------------");

        String words2 =  "An American in Paris";
        String vowelsOut = words2.replaceAll("[aeiouyAEIOUY]","");
        System.out.println(vowelsOut);

        String breakF = "Breakfast at Tiffany's";
        String space = "2001: A Space Odyssey";
        String life = "It's a Wonderful Life";
        String vowelsOut1 = breakF.replaceAll("[aeiouyAEIOUY]","");
        String vowelsOut2 = space.replaceAll("[aeiouyAEIOUY]","");
        String vowelsOut3 = life.replaceAll("[aeiouyAEIOUY]","");
        System.out.println(vowelsOut1 + " " + vowelsOut2 + " " + vowelsOut3);

        System.out.println("----------------------------7--------------------------");

        String star = "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope";
        System.out.println(star);

        String epizNr = star.replaceAll("[^0-9]","");
        System.out.println("Epizodo numeris yra: " + epizNr);

        System.out.println("----------------------------8--------------------------");

        String juice = "Don't Be a Menace to South Central While Drinking Your Juice in the Hood";












































    }
}
