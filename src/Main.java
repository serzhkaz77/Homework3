public class Main {
    public  static void main(String[] args) {
        //задание1
        System.out.println("задание1");
        int banBundle=5;
System.out.println("Значение переменной с типом int"+banBundle);
byte superBundle=8;
System.out.println("Значение переменной с типом byte"+superBundle);
short plusBundle=16;
System.out.println("Значение переменной с типом short"+plusBundle);
long moreBundle=7_500_000_000L;
System.out.println("Значение переменной с типом long"+moreBundle);
float pi=3.1415926F;
System.out.println("Значение переменной с типом float"+pi);
double e=2.8; // Основание натурального логарифма
System.out.println("Значение переменной с типом double"+e);
     //задание2
        System.out.println("задание2");
        float variable1=27.12F;// переменная
        long variable2=987_678_965_549L; // VARI
        double variable3=2.786; // VARI
        boolean variable4=false;// VARI
        char variable5=569;
        short variable6=-159;
        int variable7=27897;
        byte variable8=67;
        System.out.println("Переменные"+variable1+variable2+variable3+variable4+variable5+variable6+variable7+variable8);
        //задание3
        System.out.println("задание3");
        int clasOne=23;
        int clasTwo=27;
        int clasThree=30;
        int paperCount=480;
        int paperStudent=paperCount/(clasOne+clasTwo+clasThree);
        System.out.println("На каждого ученика расчитано" +  paperStudent  + "листов бумаги");
// задание4
                System.out.println("задание4");
                int bootle=16;
                int minut=2;
                int efficiency=bootle/minut;
                int efficiencyminut=20;
                System.out.println("За"+efficiencyminut+"минут машина произвела бутылок"+efficiency+efficiencyminut+"штук");
                int daysminut=24*60;
                System.out.println("За"+daysminut+"минут машина произвела бутылок"+efficiency+daysminut+"штук");
                int threedays=3*daysminut;
                System.out.println("За"+threedays+"минут машина произвела бутылок"+efficiency+threedays+"штук");
                int minmonth=10*threedays;//в месяце зо дней
                System.out.println("За"+minmonth+"минут машина произвела бутылок"+efficiency+minmonth+"штук");
                // задание5
                System.out.println("задание5");
                int totalCans=120;
                int whiteCansPerClass=2;
                int braunCansPerClass=4;
                int totalClasses=totalCans/(whiteCansPerClass+braunCansPerClass);
int totalWhiteCans=totalClasses*whiteCansPerClass;
int totalBraunCans=totalClasses*braunCansPerClass;
System.out.println("В школе где"+totalClasses+"классов нужно"+totalWhiteCans+"банок белой краскии"+totalBraunCans+"банок коричневой красок");
        // задание6
        System.out.println("задание6");
        int bananOne=80;
        int bananRecipe=5*bananOne;
        int molokoOne=105;
        int molokoRecipe=2*molokoOne;
        int bricetOne=100;
        int bricetRecipe=2*bricetOne;
        int eggOne=70;
        int eggRecipe=4*eggOne;
        int sportsBreakfast=bananRecipe+molokoRecipe+bricetRecipe+eggRecipe;
        double sportsBreakfast1;
       sportsBreakfast1=sportsBreakfast*0.001;
        System.out.println("Вес спорт завтрака"+sportsBreakfast+"грамм"+"а в килограммах"+sportsBreakfast1);
            // задание7
            System.out.println("задание7");
         int oneDays1=250;
         int oneDays2=500;
         int loseDays1=7000/oneDays1;
         int loseDays2=7000/oneDays2;
         int averageDays=(loseDays1+loseDays2)/2;
         System.out.println("Дней на похудение"+loseDays1+"если в день теряет"+oneDays1+"в граммах");
            System.out.println("Дней на похудение"+loseDays2+"если в день теряет"+oneDays2+"в граммах");
            System.out.println("Среднее значение дней на похудение"+averageDays);
        // задание8
        System.out.println("задание8");
        int masha=67760;
        int denis=83630;
        int kristina=76230;
        int tenmashaMes=masha/10;
        int tendenisMes=denis/10;
        int tenkristinaMes=kristina/10;
        int increaseMasha=masha+tenmashaMes;
        int increaseDenis=denis+tendenisMes;
        int increaseKristina=kristina+tenkristinaMes;
        int jahrMasha=masha*12;
        int jahrDenis=denis*12;
        int jahrKristina=kristina*12;
        int jahrincreaseMasha=increaseMasha*12;
        int jahrincreaseDenis=increaseDenis*12;
        int jahrincreaseKristina=increaseKristina*12;
        int incomejahrMasha=jahrincreaseMasha-jahrMasha;
        int incomejahrDenis=jahrincreaseDenis-jahrDenis;
        int incomejahrKristina=jahrincreaseKristina-jahrKristina;
        System.out.println("Маша теперь получает"+increaseMasha+"рублей. Годовой доход вырос на"+incomejahrMasha+"рублей");
        System.out.println("Денис теперь получает"+increaseDenis+"рублей. Годовой доход вырос на"+incomejahrDenis+"рублей");
        System.out.println("Кристина теперь получает"+increaseKristina+"рублей. Годовой доход вырос на"+incomejahrKristina+"рублей");
           }
    }
