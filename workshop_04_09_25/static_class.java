package workshop_04_09_25;

public class static_class {
    public static void main(String[] args) {
        System.out.println("I am in constructor");
        
    }

    public String getname(){
        String name="manjeet";
        String UniversityName="GLA UNIVERITY";
        return this.getname();
    }

    class staticThisFinal{
        public String getName(){
            return this.getName();
        }
    }
}

