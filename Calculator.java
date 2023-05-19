
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erjon
 */

// Imports
import java.util.Date;

public class Calculator implements Finance{
    private double AnnualInterestRate;
    private int NumberOfYears;
    private int NumberOfMonths;
    private double LoanAmount;
    private double MonthlyPayment;
    private double TotalPayment;
    private Date LoanDate;
    private double FutureSavings;
    private double Balance;
    private double InitialDeposit;
    private double DepositAmount;
    private String UserName;
    private String UserSurname;
    

    public void setUserName(String UserName){
        if(!UserName.isBlank())
            this.UserName = UserName.substring(0, 1).toUpperCase() + UserName.substring(1);
    }
    
    public void setUserSurname(String UserSurname){
        if(!UserSurname.isBlank())
            this.UserSurname = UserSurname.substring(0, 1).toUpperCase() + UserSurname.substring(1);
    }
    
    public String getAccountInfo(int n){
        if(n == 0){
            return UserName;
        } else if(n == 1){
            return UserSurname;
        } else {
            return UserName + " " + UserSurname;
        }
    }
    
    
    @Override
    public double getAnnualInterestRate() {
        // TODO Auto-generated method stub
        return AnnualInterestRate;
    }
    
    public void setDepositAmount(double DepositAmount){
        this.DepositAmount = DepositAmount;
    }
    
    @Override
    public void setSavingsBalance(double SavingStartingBalance){
        this.InitialDeposit = SavingStartingBalance;
    }
    
    

    @Override
    public double mortgageCalculator(){
        throw new UnsupportedOperationException("Unimplemented method 'setAnnualInterestRate'");
    }

    @Override
    public void setAnnualInterestRate(double AnnualInterestRate) {
        // TODO Auto-generated method stub
        this.AnnualInterestRate = AnnualInterestRate;
    }

    @Override
    public int getNumberOfYears() {
        // TODO Auto-generated method stub
        return NumberOfYears;
    }

    @Override
    public void setNumberOfYears(int NumberOfYears) {
        // TODO Auto-generated method stub
        this.NumberOfYears = NumberOfYears;
    }
    
    @Override
    public void setNumberOfMonths(int NumberOfMonths){
        this.NumberOfMonths = NumberOfMonths;
    }
    
    @Override 
    public int getNumberOfMonths(){
        return NumberOfMonths;
    }

    @Override
    public double getLoanAmount() {
        // TODO Auto-generated method stub
        return LoanAmount;
    }

    @Override
    public void setLoanAmount(double LoanAmount) {
        // TODO Auto-generated method stub
        this.LoanAmount = LoanAmount;
        this.LoanDate = new java.util.Date();
    }

    @Override
    public double getMonthlyPayment(double PayBack, double Compounding) {
        // TODO Auto-generated method stub
        double MonthlyInterestRate = (AnnualInterestRate / 100.0) / Compounding;
        double TotalNumberOfYears = NumberOfYears + (NumberOfMonths / 12.0);
//        MonthlyPayment = (LoanAmount * (MonthlyInterestRate / Compounding)) / (1 - Math.pow(1 + (MonthlyInterestRate / Compounding), -1 * TotalNumberOfMonths));
        MonthlyPayment = (LoanAmount * MonthlyInterestRate * Math.pow(1 + MonthlyInterestRate, TotalNumberOfYears * PayBack))
                         /  (Math.pow(1 + MonthlyInterestRate, TotalNumberOfYears * PayBack) - 1);
        return MonthlyPayment;
    }

    @Override
    public double getTotalPayment(double PayBack) {
        // TODO Auto-generated method stub
        double TotalNumberOfYears = NumberOfYears + (NumberOfMonths / 12.0);
        this.TotalPayment = MonthlyPayment * TotalNumberOfYears * PayBack;
        return this.TotalPayment;
    }
    
    @Override
    public double getTotalInterest(){
        double TotalInterest = this.TotalPayment - getLoanAmount();
        return TotalInterest;
    }

    @Override
    public Date getLoanDate() {
        // TODO Auto-generated method stub
        return LoanDate;
    }

    @Override
    public void deposit(double DepositAmount) {
        // TODO Auto-generated method stub
        Balance += DepositAmount;
    }

    @Override
    public boolean withdraw(double WithdrawalAmount) {
        // TODO Auto-generated method stub
        if(checkBalance() > -500){
            if(checkBalance() - WithdrawalAmount >= -500){
                Balance -= WithdrawalAmount;
                return true;
            }
        }
        return false;
    }

    @Override
    public double checkBalance() {
        // TODO Auto-generated method stub
        return Balance;
    }

    @Override
    public boolean transfer(double TransferAmmount, double BankAccountNumber) {
        // TODO Auto-generated method stub
        if(checkBalance() > -500){
            if(checkBalance() - TransferAmmount >= -500){
                Balance -= TransferAmmount;
                return true;
            }
        }
        return false;
    }

    @Override
    public double calculateSavings(double Frequency, double Compounding){
        // TODO Auto-generated method stub
        FutureSavings = InitialDeposit;
        double InterestRate = (AnnualInterestRate / 100.0) / Compounding;
        int times;
        for(int i = 0; i < NumberOfYears; i++){
            if(Frequency > Compounding){
                times = (int) (Frequency / Compounding);
                for(int j = 0; j < (int)Frequency; j++){
                    FutureSavings += DepositAmount;
                    if(Frequency % times == 0){
                        FutureSavings += FutureSavings * InterestRate;
                    }
                }
            } else if(Frequency == Compounding){
                for(int j = 0; j < (int)Frequency; j++){
                    FutureSavings += DepositAmount;
                    FutureSavings += FutureSavings * InterestRate; 
                }
            }
            else{
                times = (int) (Compounding / Frequency);
                for(int j = 0; j < (int) Compounding; j++){
                    FutureSavings += FutureSavings * InterestRate;
                    if(Compounding % times == 0){
                        FutureSavings += DepositAmount;
                    }
                }
            }  
        }
        return FutureSavings;
    }
    
    @Override
    public double compoundingValue(String OptionString){
        return switch (OptionString) {
            case "Daily (365/Yr)", "Every Day" -> 365.0;
            case "Weekly (52/Yr)", "Every Week" -> 52.0;
            case "Bi-Weekly (26/Yr)", "Every 2 Weeks" -> 26.0;
            case "Semi-Monthy (24/Yr)", "Every Half-Month" -> 24.0;
            case "Monthly (12/Yr)", "Every Month" -> 12.0;
            case "Bi-Monthly (6/Yr)" -> 6.0;
            case "Quaterly (4/Yr)", "Every Quarter" -> 4.0;
            case "Semi-Annually (2/Yr)", "Every 6 Months" -> 2.0;
            case "Annually (1/Yr)", "Every Year" -> 1.0;
            default -> 1.0;
        };
    }
}
