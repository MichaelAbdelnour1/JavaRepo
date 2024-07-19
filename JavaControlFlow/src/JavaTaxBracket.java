import java.util.*;

public class JavaTaxBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the IRS Simulator: ");
        System.out.println("How are you filing your taxes: ");
        System.out.println("(1) Single");
        System.out.println("(2) Married Filing Jointly or Qualifying Widow(er)");
        System.out.println("(3) Married Filing Separately");
        System.out.println("(4) Head of the HouseHold");
        int choice = sc.nextInt();
        System.out.print("How much did you make this year: ");
        int income = sc.nextInt();

        switch (choice) {
            case 1:
                if(income>0 && income<=8350) {
                    System.out.println("As a single individual, your tax is $" + (.010*income));
                } else if (income>=8351 && income<=33950) {
                    System.out.println("As a single individual, your tax is $" + (.015*income));
                } else if (income>=33951 && income<=82250) {
                    System.out.println("As a single individual, your tax is $" + (.025*income));
                } else if (income>=82251 && income<=171550){
                    System.out.println("As a single individual, your tax is $" + (.028*income));
                } else if (income>=171551 && income<=372950){
                    System.out.println("As a single individual, your tax is $" + (.033*income));
                } else if (income>=372951){
                    System.out.println("As a single individual, your tax is $" + (.035*income));
                }
                break;
            case 2:
                if(income>0 && income<=16700) {
                    System.out.println("As a Married Joint couple, your tax is $" + (.010*income));
                } else if(income>=16701 && income<=67900){
                    System.out.println("As a Married Joint couple, your tax is $" + (.015*income));
                } else if (income>=67901 && income<=137050){
                    System.out.println("As a Married Joint couple, your tax is $" + (.025*income));
                } else if(income>= 137051 && income<=208850){
                    System.out.println("As a Married Joint couple, your tax is $" + (.028*income));
                } else if(income>=208851 && income<=372950){
                    System.out.println("As a Married Joint couple, your tax is $" + (.033*income));
                } else if(income>=372951){
                    System.out.println("As a Married Joint couple, your tax is $" + (.035*income));
                }
                break;
            case 3:
                if (income>0 && income<=8350) {
                    System.out.println("As a married couple filing separately, your tax is $" + (.010*income));
                }else if(income>=8351 && income<=33950){
                    System.out.println("As a married couple filing separately, your tax is $" + (.015*income));
                }else if(income>=33951 && income<=68525){
                    System.out.println("As a married couple filing separately, your tax is $" + (.025*income));
                }else if(income>=68526 && income<=104425){
                    System.out.println("As a married couple filing separately, your tax is $" + (.028*income));
                }else if(income>=104426 && income<=186475){
                    System.out.println("As a married couple filing separately, your tax is $" + (.033*income));
                }else if(income>=186476){
                    System.out.println("As a married couple filing separately, your tax is $" + (.035*income));
                }
                break;
            case 4:
                if (income>0 && income<=11950) {
                    System.out.println("As the head of the household filing separately, your tax is $" + (.010*income));
                }else if(income>=11951 && income<=45500){
                    System.out.println("As the head of the household, your tax is $" + (.015*income));
                }else if(income>=45501 && income<=117450){
                    System.out.println("As the head of the household, your tax is $" + (.025*income));
                }else if(income>=117451 && income<=190200){
                    System.out.println("As the head of the household, your tax is $" + (.028*income));
                }else if(income>=190201 && income<=372950){
                    System.out.println("As the head of the household, your tax is $" + (.033*income));
                }else if(income>=372951){
                    System.out.println("As the head of the household, your tax is $" + (.035*income));
                }
        }

    }
}
