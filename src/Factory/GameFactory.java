package Factory;

public class GameFactory {
    public static Game getGame(String gameType) {
        switch (gameType) {
            case "XBOX": {
                return new Microsoft();
            }
            case "PS4": {
                return new Sony();
            }
            default: {
                return null;
            }
        }
    }
}
