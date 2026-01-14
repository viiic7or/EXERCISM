public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        if(daysSkipped >=5){
            return 0.85;
        }
        return 1.0;
    }

    public int bonusMultiplier(int productsSold) {
        if(productsSold >= 20){
            return 13;
        }
        return 10;
    }

    public double bonusForProductsSold(int productsSold) {
        int bonusMulti = this.bonusMultiplier(productsSold);
        return productsSold * bonusMulti;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double bonusMulti = this.bonusForProductsSold(productsSold);
        double salaryMulti = this.salaryMultiplier(daysSkipped);

        double total = (1000.00 * salaryMulti) + bonusMulti; 
        if(total > 2000){
            return 2000;
        }
        return total;
    } 
}
