package exominmaj;

public class ExoMinMaj {

    public static void main(String[] args) {
        String chaine = "J'utilise JAVA avec brio";
        StringBuffer chaine2 = new StringBuffer("");

        System.out.println("\n Avant : " + chaine);

        for (int i = 0; i < chaine.length(); i++)
        {
            char ch = chaine.charAt(i);

            if (Character.isLowerCase(ch))
            {
                chaine2.append(Character.toUpperCase(ch));
            } else 
            {
                chaine2.append(Character.toLowerCase(ch));
            }
        }

        System.out.println("\n Apres : " + chaine2);

    }

}
