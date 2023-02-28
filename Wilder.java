public class Wilder {
    // attributs
    private String firstname;
    private boolean aware;

    // constructeur
    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = false;
    }

    // getters
    public String getFirstname() {
        return this.firstname;
    }

    public boolean isAware() {
        return this.aware;
    }
    // setters

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    // méthode whoAmI() retournant le texte "Je m'appelle firstname et je suis
    // aware" ou "Je m'appelle firstname et je ne suis pas aware"
    public String whoIam() {
        if (aware == true) {
           return "Je m'appelle " + this.getFirstname()+ " et je suis aware ";
        } else {
           return "Je m'appelle " + this.getFirstname() + " et je ne suis pas aware ";
        }
        
    }
   
}



