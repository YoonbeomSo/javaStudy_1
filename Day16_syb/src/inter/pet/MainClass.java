package inter.pet;

public class MainClass {

	public static void main(String[] args) {
		
		Dog baduk = new Dog();
		Animal nabi = new Cat();
		Tiger hodol = new Tiger();
		
		Animal[] animals = {baduk, nabi, hodol};
		
		for(Animal a : animals) {
			a.eat();
		}
		
		System.out.println("------------");
		
		IPet[] pets = new IPet[3];
		pets[0] = baduk;
//		pets[1] = (Cat)nabi;
		pets[1] = (IPet)nabi;
//		pets[2] = (IPet)hodol; //runtime error
//		pets[3] = new Shark(); //complie error
		pets[2] = new GoldFish();
		
		for(IPet pet: pets) {
			pet.play();
		}
		
		
		System.out.println("---------------");
		
		PetShop shop = new PetShop();
		shop.carePet(baduk);
		shop.carePet((IPet)nabi);
		shop.carePet(pets[2]);
		

	}

}
