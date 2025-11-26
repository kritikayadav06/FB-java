import java.util.*;

class Boy implements Comparable<Boy> {
    private String name;
    private int age;
    private String branch;

    public Boy(String name, int age, String branch){
        this.name = name;
        this.age = age;
        this.branch = branch;
    }

    
    public int compareTo(Boy b){
        return this.age - b.getAge();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBranch() {
        return branch;
    }
}

public class Main {      // ← renamed class
    public static void main(String[] args) {

        ArrayList<Boy> list = new ArrayList<>();
        list.add(new Boy("Ayush Sharma",24,"DS"));
        list.add(new Boy("Nukul",20,"CSE"));
        list.add(new Boy("Shivang",18,"CSE"));
        list.add(new Boy("Pari",16,"DS"));

        Collections.sort(list);   // Works now

        for(Boy b: list){
            System.out.println(b.getName() + " " + b.getBranch() + " " + b.getAge());
        }
    }
}
