public class FootballPlayer extends Human {
    private String name;
    private int age;
    private String position;
    private String club;
    private int number;
    private int goalCount;
    private int passCount;
    private boolean capitan;
    private boolean goalkipper;
    private int yellowCardCount;
    private int redCardCount;
    private String rating;

     FootballPlayer () {

    }

    /* Капитан*/
    public FootballPlayer(String name, String position, int age, String club, int number, int goalCount, int passCount, boolean capitan, int yellowCardCount, int redCardCount) {
       // super(name, age);
        super();
        this.position = position;
        this.club = club;
        this.number = number;
        this.goalCount = goalCount;
        this.passCount = passCount;
        this.capitan = capitan;
        this.yellowCardCount = yellowCardCount;
        this.redCardCount = redCardCount;
    }


    /* Обычный игрок */
    public FootballPlayer(String name, String position, int age, String club, int number, int goalCount, int passCount, int yellowCardCount, int redCardCount) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.club = club;
        this.number = number;
        this.goalCount = goalCount;
        this.passCount = passCount;
        this.yellowCardCount = yellowCardCount;
        this.redCardCount = redCardCount;
    }

    /* Игрок не заявлен не за одну команду */
    public FootballPlayer(String name, String position, int age, int number, int goalCount, int passCount, int yellowCardCount, int redCardCount) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.number = number;
        this.goalCount = goalCount;
        this.passCount = passCount;
        this.yellowCardCount = yellowCardCount;
        this.redCardCount = redCardCount;
    }

    /* Игрок из резерва у которго нету номера */
    public FootballPlayer(String name, String position, int age, String club, int goalCount, int passCount, int yellowCardCount, int redCardCount) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.club = club;
        this.goalCount = goalCount;
        this.passCount = passCount;
        this.yellowCardCount = yellowCardCount;
        this.redCardCount = redCardCount;
    }

    /* Арбитр */
    public FootballPlayer(String name, int age, String rating) {
        this.name = name;
        this.age = age;
        this.rating = rating;
    }

    /* Болельщик */

    public FootballPlayer(String name, int age) {
        this.name = name;
        this.age = age;
    }






    //Отображение названия команды
    public String nameOfClub ()
    {
        return club;
    }


    //Отображение номера игрока
    public int numberPlayer (){
        return number;
    }


    //Отображение имени
    public String namePlayer() {
        return name;
    }

    //Отображение Количество забитых голов
    public int countOfGoal () {
        return goalCount;
    }

    //Отображения количества желтрых карточек
    public int contOfYellowCard () {
        return yellowCardCount;
    }




    /* Добавление количества забитых голов голов */
    public int addGoalCount (int goalC) {
        return goalCount += goalC;
    }

    //Добавление количество передач
    public void addPassCount (int yellowC){
         yellowCardCount += yellowC;
    }

    //Добавление желтых карточек
    public int addYellowCard (int yellowC){
        return yellowCardCount += yellowC;
    }

    //Проверка допущен ли игрок на игру
    public String accessToGame () {
        if (yellowCardCount>2) {
            return "Не допущен на игру";
        }
        else
            return "Допущен на игру";
    }

    @Override
    public String toString() {
        return "Игрок " +
                "с именем " + name  +
                ", И количеством голов " + goalCount ;
    }

    //Чтение имени
    @Override
    public String getName() {
        return name;
    }

    //Запись имени
    public void setName (String name) {
        this.name =name;
    }


    //Чтение номера
    public int getNumber() {
        return number;
    }

    //Запись номера
    public void  setNumber (int number) {
        this.number = number;
    }


    //Чтение название команды
    public String getClub() {
        return club;
    }

    //Запись название команды
    public void setClub (String club) {
        this.club = club;
    }


    //Запись количества голов
    public void setGoalCount(int goalCount) {
        this.goalCount = goalCount;
    }

    //Чтение голов
    public int getGoalCount() {
        return goalCount;
    }

    //Запись количества пасов
    public void setPassCount(int passCount) {
        this.passCount = passCount;
    }

    //Чтение количества пассво
    public int getPassCount() {
        return passCount;
    }


    //Чтение количество желтых карточек
    public int getYellowCardCount() {
        return yellowCardCount;
    }

    //Запись количества желтых карточек
    public void setYellowCardCount (int yellowCardCount) {
        this.yellowCardCount = yellowCardCount;
    }

}
