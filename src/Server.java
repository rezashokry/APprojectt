import java.util.ArrayList;

public class Server {
    private ArrayList<Player> allPlayers;
    private ArrayList<Game> allGames;
    private ArrayList<String> input;
    private ArrayList<String> output;
    private Viewer viewer;

    public void createAccount(){

    }
    public void login(String username, String password){

    }
    public void leaderboard(){

    }
    public void save(){

    }
    public void logOut(){

    }


    public ArrayList<Player> getAllPlayers() {
        return allPlayers;
    }

    public void setAllPlayers(ArrayList<Player> allPlayers) {
        this.allPlayers = allPlayers;
    }

    public ArrayList<Game> getAllGames() {
        return allGames;
    }

    public void setAllGames(ArrayList<Game> allGames) {
        this.allGames = allGames;
    }

    public ArrayList<String> getInput() {
        return input;
    }

    public void setInput(ArrayList<String> input) {
        this.input = input;
    }

    public ArrayList<String> getOutput() {
        return output;
    }

    public void setOutput(ArrayList<String> output) {
        this.output = output;
    }
}
