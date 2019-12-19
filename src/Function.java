import java.util.Random;

public class Function {

    public static Random random = new Random();
    public static int goalRandom = random.nextInt(10);

    public FootballPlayer bestPlayer (FootballPlayer [] playerss){
        FootballPlayer player = playerss[0];
        for (int i=0; i<playerss.length; i++){
            if (player.getGoalCount() < playerss[i].getGoalCount()){
                player.setGoalCount(playerss[i].getGoalCount());
            }
        }
        return player;
    }

    public  void createPlayerInfo () {
        FootballPlayer player = new FootballPlayer();
        player.setName("Sergey");
        player.setGoalCount(5);
        player.setYellowCardCount(1);
        player.addYellowCard(4);
        player.setNumber(4);
        player.setClub("Armada");
        System.out.println("Игрок " + player.namePlayer() + " имеет " + player.countOfGoal() + " голов" + " И у него " + player.contOfYellowCard() + " желтых карточки" + " и он " + player.accessToGame());
        System.out.println(player.namePlayer() + " играет в "+ player.nameOfClub() + " под номером " + player.numberPlayer());

        FootballPlayer player2 = new FootballPlayer("Миша", "Левый полузащитник", 24, "Armada", 9, 0, 0, false, 0, 0);
        player2.addGoalCount(goalRandom);
        player2.addYellowCard(2);
        player2.addPassCount(4);
        System.out.println();
        System.out.println("Количество голов у " + player2.namePlayer() + " " + player2.countOfGoal() + " голов" + " и у него " + player2.contOfYellowCard() + " желтых карточки" + " и он " + player2.accessToGame());

        FootballPlayer player3 = new FootballPlayer();
        player3.setName("Kirill");
        player3.setNumber(1);
        player3.setGoalCount(3);
        player3.setYellowCardCount(2);
        player3.setClub("Armada");
        System.out.println("Игрок " + player3.getName() + " из " + player3.getClub() + " c номером " + player3.getNumber() + "и имеет" + player3.getGoalCount() + " голов" + " и у него " + player3.getYellowCardCount() + " желтых карточки" );


        FootballPlayer [] masPlayers = {player, player2, player3};
        System.out.println(bestPlayer(masPlayers));
    }





}
