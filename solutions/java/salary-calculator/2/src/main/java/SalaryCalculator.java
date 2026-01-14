public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= 5 ? .85 : 1;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        int bonusMulti = this.bonusMultiplier(productsSold);
        return productsSold * bonusMulti;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double bonusMulti = this.bonusForProductsSold(productsSold);
        double salaryMulti = this.salaryMultiplier(daysSkipped);

        double total = (1000.00 * salaryMulti) + bonusMulti; 
        return total > 2000 ? 2000 : total;
    } 
}
