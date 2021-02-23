package Model;

public class Client extends Personne {
    private int type;

    public Client() {

    }

    public Client(int id, String nom, String prenom, String login, String password, int type) {
        super(id, nom, prenom, login, password);
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
