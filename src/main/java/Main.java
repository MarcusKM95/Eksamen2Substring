public class Main {
    public static void main(String[] args) {


        /*BMI bmi = new BMI(68,1.78);

        bmi.bmiCalculator();
        System.out.println(bmi.bmiCalculator());
        System.out.println(bmi.isUnderweight());
        System.out.println(bmi.isNormalWeight());
        System.out.println(bmi.isOverweight());*/

        /*Article article = new Article("Sommerferie", "Jeg har i min sommerferie haft en rigtig god tur med Gitte til Alanya. Det var så mums", "Marcus");

        System.out.println(article.getLongesWord());

        article.getWords();*/

        User user = new User("Marcus Mortensen", "kons1234");

        System.out.println(user.generateUserID().toLowerCase());
        System.out.println(user.validUsierID());

    }



}
