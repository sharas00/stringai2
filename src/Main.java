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
    }
}
