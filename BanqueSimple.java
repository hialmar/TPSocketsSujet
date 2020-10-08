import java.util.Date;
import java.util.HashMap;

public class BanqueSimple {
    HashMap<String, CompteEnBanque> comptes;

    public BanqueSimple() {
        comptes = new HashMap<String, CompteEnBanque>();
    }

    public void creerCompte(String id, double somme) {
        comptes.put(id, new CompteEnBanque(somme));
    }

    public void ajouter(String id, double somme) {
        CompteEnBanque cpt = comptes.get(id);
        cpt.ajouter(somme);
    }

    public void retirer(String id, double somme) {
        CompteEnBanque cpt = comptes.get(id);
        cpt.retirer(somme);
    }

    public double getSolde(String id) {
        CompteEnBanque cpt = comptes.get(id);
        return cpt.getSolde();
    }

    public Date getDerniereOperation(String id) {
        CompteEnBanque cpt = comptes.get(id);
        return cpt.getDerniereOperation();
    }

    public boolean compteExiste(String id) {
        return comptes.containsKey(id);
    }

    public static void main(String[] args) {
        BanqueSimple s = new BanqueSimple();
        s.creerCompte("ABC1234", 1000); s.ajouter("ABC1234", 100);
        s.retirer("ABC1234", 30);
        double solde = s.getSolde("ABC1234");
        Date date = s.getDerniereOperation("ABC1234");
        System.out.println("ABC1234 -> " + solde + " " + date);
    }
}
