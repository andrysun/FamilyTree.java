public class Main {
    public static void main(String[] args) {
        int index = 0;
        FamileTree famileTree = new FamileTree();
        Human human1 = new Human(index++, "Анна", 44, null, null);
        Human human2 = new Human(index++, "Вячеслав", 45, null, null);
        Human human3 = new Human(index++, "Геннадий", 19, "Анна", "Вячеслав");

        famileTree.addHuman(human1);
        famileTree.addHuman(human2);
        famileTree.addHuman(human3);
        System.out.println(famileTree.getHumanListInfo());
    }
}
