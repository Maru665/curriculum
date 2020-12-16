package check;

public class Check {

	  private static String firstName= "丸山";
	  private static String lastName ="陽平";

	  private static String printName(String firstName,String lastName) {
			 return firstName + lastName;

	  }


	  public static void main(String[] args) {

        System.out.println(printName("printNameメゾッド→" +firstName, lastName));

        Pet pet=new Pet(constants.Constants.CHECK_CLASS_JAVA,constants.Constants.CHECK_CLASS_HOGE );
        pet.introduce();

		RobotPet robotPet= new RobotPet(constants.Constants.CHECK_CLASS_R2D2,constants.Constants.CHECK_CLASS_LUKE);
        robotPet.introduce();

}


}