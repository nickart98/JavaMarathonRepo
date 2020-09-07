package day13;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("Nikita");
        User user2 = new User("Ilya");
        User user3 = new User("Danil");
        user1.sendMessage(user2,"Илюх, привет! Какие планы на выходные?");
        user2.sendMessage(user1,"Здоров, Никитос, да ничего еще не строил");
        user2.sendMessage(user1, "А у тебя?");
        user1.sendMessage(user2,"Да я вот думал пацанами выбраться куда-нибудь, сто лет не собирались");
        user2.sendMessage(user1,"Я в деле, напиши Данилу");
        user1.sendMessage(user3,"Дань, здоров, мы тут думали собраться на выходных, ты как?");
        user3.sendMessage(user1,"Доброго дня, я бы с радостью, вот только работаю на этих выходных");
        user3.sendMessage(user1,"Хотя, подожди");
        user3.sendMessage(user1,"С работой на этих выходных покончено");
        user1.sendMessage(user3,"Понял, тогда в субботу в 22 около дворика");
        user3.sendMessage(user1,"Отлично, договорились, на связи");
        user1.sendMessage(user3,"Добро, увидимся!");
        MessageDatabase.showDialog(user1,user2);
    }
}
