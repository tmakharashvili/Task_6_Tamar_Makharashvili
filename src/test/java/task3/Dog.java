package task3;

 class Dog extends Mammal {
    protected String breed;

    public Dog(String species, String diet, String breed){
         super(species, diet);
         this.breed = breed;
     }

     public String toString(){
        return "Dog[Species:" + species + ",Diet:"+ diet + ".Breed:" + breed + "]";
     }

     public static void main(String[] args) {
         Dog dog = new Dog("Pet", "Hunter", "Beagle");
         System.out.println(dog);
     }
}


