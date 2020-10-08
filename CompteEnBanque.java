import java.util.Date;

public class CompteEnBanque {
    private double solde;
    private Date derniereOperation;

    public CompteEnBanque(double solde) {
        this.solde = solde;
        derniereOperation = new Date(); // recupere la date courante
    }

    public double getSolde() {
        return solde;
    }

    public Date getDerniereOperation() {
        return derniereOperation;
    }

    public void ajouter(double somme) {
        solde += somme;
        derniereOperation = new Date(); // recupere la date courante
    }

    public void retirer(double somme) {
        solde -= somme;
        derniereOperation = new Date(); // recupere la date courante
    }
}