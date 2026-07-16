// BMICalculator class is a utility class that's used to calculate the BMI value in both Imperial and Metric systems
public class BMICalculator {

    // Please declare 4 attributes/properties to represent weight in pounds, height in inches, weight in kilos and height in meters
    private double weightInPounds;
    private double heightInInches;
    private double weightInKilos;
    private double heightInMeters;


    // Please use this default no arguments constructor to initialize the 4 properties to some initial values
    public BMICalculator() {
        weightInPounds = 127.8;
        heightInInches = 70;
        weightInKilos = 58;
        heightInMeters = 1.73;
    }

    // Please implement the calculateBmiImperial() method to take in weight and height to calculate and return the BMI value in the Imperial system
    public double calculateBmiImperial(double weightInPounds, double heightInInches) {
        return (703 * weightInPounds) / (heightInInches * heightInInches);
    }

    // Please implement the calculateBmiMetric() method to take in weight and height to calculate and return the BMI value in the Metric system
    public double calculateBmiMetric(double weightInKilos, double heightInMeters) {
        return weightInKilos / (heightInMeters * heightInMeters);
    }

    // Please implement the getBMICategory() method so that it takes the BMI value and returns the BMI category based on it
    public String getBMICategory(double bmi) {
        String bmiCategory;

        if (bmi < 18.5) {
            bmiCategory = "Underweight";
        } else if (bmi < 25) {
            bmiCategory = "Normal Weight";
        } else if (bmi < 30) {
            bmiCategory = "Overweight";
        } else {
            bmiCategory = "Obese";
        }

        return bmiCategory;
    }
}
