import java.util.ArrayList;
import java.util.List;

public class FamileTree {
    private List<Human> humanList;

    public FamileTree(){
        humanList = new ArrayList<>();
    }

    public Human getHumanByName(String humanName){
        for (Human human: humanList){
            if (human.getName().equals(humanName)){
                humanList.remove(human);
                return human;
            }
        }
        return null;
    }

    public void addHuman(Human human){
        humanList.add(human);
    }

    public String getHumanListInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список людей:\n");
        for (Human human: humanList){
            stringBuilder.append(human);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
