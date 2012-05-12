


import java.util.HashMap;
import java.util.Map;

import org.jdesktop.beansbinding.ELProperty;

public class ELBeansTest {

    public static void main(String[] args) {
        Person mom = new Person("Anna", null);
        Person son = new Person("huy", mom);
        Dog dog = new Dog("Foxy");

        ELProperty<Person, String> el = ELProperty.create("${name}'s mom is ${mother.name}");
        System.out.println(el.getValue(son));
        
        ELProperty<Map, String> mapEL = ELProperty.create("${mother.name}'s dog is ${dog.name}");
        Map map = new HashMap();
        map.put("mother", mom);
        map.put("dog", dog);        
        System.out.println(mapEL.getValue(map));
    }
    
    public static class Person{
        private String name;
        private Person mother;        
        public Person(String name, Person mother){
            this.name = name;
            this.mother = mother;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        public void setMother(Person mother) {
            this.mother = mother;
        }
        public Person getMother() {
            return mother;
        }        
    }
    public static class Dog{
        private String name;        
        public Dog(String name){
            this.name = name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }

    
}

	

