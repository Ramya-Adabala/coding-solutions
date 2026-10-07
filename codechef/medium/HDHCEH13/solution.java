class Dog{
    String breed;
    String name;
}

class Codechef {
    public static void main(String[] args) {
        // Create an object for Dog class here 
        Dog d=new Dog();
        
        // assign values for breed and name, breed is "pug" and name is "bob"
       d.breed="pug";
        d.name="bob";
        
        // print the result
        System.out.println("Breed: " + d.breed);
        System.out.println("Name: " + d.name);
    }
}
