public class Human {
    private int id;
    private String name;
    private int age;
    private String mother;
    private String father;

    public Human(int id, String name, int age, String mother, String father){
        this.id = id;
        this.name = name;
        this.age = age;
        this.mother = mother;
        this.father = father;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFather() {
        return father;
    }

    public String getMother() {
        return mother;
    }
    
    @Override
    public String toString() {
        
        return "id: " + id + ", name: " + name + ", age: " + age + " years, mother: " + mother + ", father: " + father;
    }
}