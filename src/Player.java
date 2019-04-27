import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> mainDeck;
    private ArrayList<Card> collection;
    private ArrayList<Card[]> allDecks;
    private int money;
    private ArrayList<EndedMatches> listOfMacthes;
    private String password;
    private int numberOfWins;

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public void addWin(int numberOfWins) {
        this.numberOfWins ++;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Card> getMainDeck() {
        return mainDeck;
    }

    public void setMainDeck(ArrayList<Card> mainDeck) {
        this.mainDeck = mainDeck;
    }

    public ArrayList<Card> getCollection() {
        return collection;
    }

    public void setCollection(ArrayList<Card> collection) {
        this.collection = collection;
    }

    public ArrayList<Card[]> getAllDecks() {
        return allDecks;
    }

    public void setAllDecks(ArrayList<Card> allDecks) {
        allDecks = allDecks;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public ArrayList<EndedMatches> getListOfMacthes() {
        return listOfMacthes;
    }

    public void setListOfMacthes(ArrayList<EndedMatches> listOfMacthes) {
        this.listOfMacthes = listOfMacthes;
    }

}
