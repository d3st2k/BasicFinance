/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author erjon
 */
public interface Finance {
     /**
     * Metoda kthen interesin vjetor
     * @return double interesin vjetor
     */
    double getAnnualInterestRate();
    
    /**
     * Metoda vendos vleren qe deshirojme ta ruajme pas disa vitesh ne banke
     * @param double vlera qe deshirojme ta ruajme
     * @return void
     */
    void setSavingsBalance(double SavingStartingBalance);

    /**
     * Metoda llogarit hipoteken, duke marre si sigurim edhe ndonje objekt ne pronesi te perdoruesit nese nuk paguhet hipoteka
     * @param arg1 double vlera e hipotekes ne fillim
     * @return double vleren e pageses mujore
     */
    double mortgageCalculator();

    /**
     * Metoda vendos interesin e ri vjetor
     * @param arg1 double vlere ne perqindje
     * @return void vetem vendose vlere
     */
    void setAnnualInterestRate(double AnnualInterestRate);

    /**
     * Metoda kthen numrin e viteve per kredine
     * @return int numrin e viteve
     */
    int getNumberOfYears();

    /**
     * Metoda vendos numrin e viteve per kredi
     * @param arg1 int numrin e viteve
     * @return void vetem vendose vlere
     */
    void setNumberOfYears(int NumberOfYears);
    
    /**
     * Metoda vendos numrin e muajve
     * @param NumberOfMonths
     * @return void
     */
    void setNumberOfMonths(int NumberOfMonths);
    
    /**
     * Metoda kthen numrin e muajve
     * @param NumberOfMonths
     * @return int numrin e muajve
     */
    int getNumberOfMonths();

    /**
     * Metoda kthen vleren e kredise
     * @return double vleren e kredise
     */
    double getLoanAmount();

    /**
     * Metoda vendos vleren e kredise
     * @param arg1 double vlera e kredise
     * @return void vetem vendose vlere
     */
    void setLoanAmount(double LoanAmount);

    /**
     * Metoda gjen pagesen mujore
     * @param arg1 double sa here ne vite do te paguhet interesi
     * @param arg2 double sa here duhet te aplikohet interesti
     * @return double pagesen mujore
     */
    double getMonthlyPayment(double PayBack, double Compounding);

    /**
     * Metoda gjen vleren totale te kredise per ta paguar
     * @param arg1 double vlera e pageses mujore
     * @return double pagesen totale
     */
    double getTotalPayment(double PayBack);

    /**
     * Metoda kthen daten kur kredia eshte marre
     * @return java.util.Date kthen daten e kredise
     */
    java.util.Date getLoanDate();
    
    /**
     * Metoda vendose vleren ne llogari te perdoruesit dhe e perditesone llogarin e tije
     * @param arg1 double vleren e deshiruar
     * @return void shtone vleren ne llogari
     */
    void deposit(double DepositAmmount);

    /**
     * Metoda terhjeke vleren e kerkuar nga perdoruesi dhe e perditesone llogarin e tije
     * @param arg1 double vleren e kerkuar
     * @return double vleren e kerkuar
     * @return boolean terheqja a ka qene e suksesshem ose jo
     * @return double vlera e mbetur ne llogari
     */
    boolean withdraw(double WithdrawalAmomount);

    /**
     * Metoda kthen vleren momentale te llogarise, kur perdoruesi ben kerkese
     * @return double vleren momentale ne llogari te perdoruesit
     */
    double checkBalance();

    /**
     * Metoda dergon nje shume te caktuar nga perdoruesi tek nje llogari tjeter
     * @param arg1 double vleren e kerkuar
     * @param arg2 double numrin e llogarise tjeter
     * @return double vleren 
     * @return boolean transfera ka qene e suksesshme ose jo
     */
    boolean transfer(double TransferAmmount, double BankAccountNumber);

    /**
     * Metoda llogarit kursimet e perdoruesit dhe kthen vleren qe do te fitohet
     * @param arg1 double vlera fillestare ne llogari
     * @param arg2 double vlera e depozitimeve
     * @param arg3 int frequenca ne te cilen deponohet te hollat
     * @param arg4 int numri i viteve
     * @param arg5 double perqindja e interesit
     * @param arg6 int sa here aplikohet interesi
     * @return double vlera e fituar
     */
    double calculateSavings(double Frequency, double Compounding);

    /**
     * Metoda kthen vlerat qe duhen te kthehen kur perdoruesi klikon tek nje nga opsionet
     * @param arg1 string titulli i opsionit
     * @return double vlera e duhur
     */
    double compoundingValue(String OptionString);
    
    /**
     * Metoda llogarit se sa interes eshte nga kredia totale 
     * @return dobule vleren e interesit nga kredia totale
     */
    double getTotalInterest();
}
