package ca.bcit.comp1510.lab09;

/**
 * The class of Cat.
 * @author echo
 * @version 1.0
 */
public class Cat {

    /**
     * The cat's name.
     */
    private final String name;
    
    /**
     * The cat's age.
     */
    private int age;
    
    /**
     * Constructor of the Cat class.
     * @param name the formal parameter of name
     * @param age the formal parameter of age
     */
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * The accesor of name.
     * @return name of the Cat object
     */
    public String getName() {
        return name;
    }

    /**
     * The accessor of age.
     * @return the age of the Cat object
     */
    public int getAge() {
        return age;
    }
    
    /**
     * The mutator of age.
     * @param age stands for the new age of cat
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    /**
     * The information of the cat.
     * @return the string contains the info
     */
    @Override
    public String toString() {
        return "Name: " + name + "\tAge: " + age;
    }


    
}
