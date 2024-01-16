public class BMI {

    private double weight;
    private double height;

    public BMI(double weight, double height){
        this.weight = weight;
        this.height = height;
    }

    public double bmiCalculator(){
        return weight / (height*height);
    }

    public boolean isUnderweight(){
        if (bmiCalculator()<18.5){
            return true;
        }
        return false;
    }
    public boolean isNormalWeight(){
        if (bmiCalculator()>=18.5 && bmiCalculator()<=25){
            return true;
        }
        return false;
    }
    public boolean isOverweight(){
        if (bmiCalculator()>25){
            return true;
        }
        return false;
    }

}
