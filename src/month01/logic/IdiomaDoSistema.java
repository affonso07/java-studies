package month01.logic;

import java.util.Locale;

public class IdiomaDoSistema {
    public static void main(String[] args) {
        //Locale idiomalocal = Locale.getDefault();
        String idiomalocal = Locale.getDefault().getDisplayLanguage();

        //System.out.println("Código de idioma: " + idiomalocal.getLanguage());
        //System.out.println("O idioma do sistema está em:" + idiomalocal.getDisplayLanguage());
        System.out.println("O idioma do sistema é:");
        System.out.println(idiomalocal);
    }
}
