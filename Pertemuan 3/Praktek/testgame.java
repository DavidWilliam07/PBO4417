public class testgame {
    public static void main(String[] args){
        gameplayer player = new gameplayer();
        gameenemy enemy = new gameenemy();

        player.run();
        player.run(30);
        enemy.run();
    }
}