package day07;

import java.util.Scanner;

public class BankAccount {
    private int account;
    private String password;
    private double moneys;
    public String name;
    public BankAccount(){}
    public int getAccount(){
        return this.account;
    }
    public String getPassword(){
        return this.password;
    }
    public double getMoneys(){
        return this.moneys;
    }
    public void setAccount(int account){
        this.account=account;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setMoneys(double moneys){
        this.moneys=moneys;
    }
    public void addMoney(BankAccount bank){
        Scanner sc=new Scanner(System.in);
        System.out.print("欢迎进入存款界面，请输入你要存的钱(只能存整百):");
        int money=sc.nextInt();
        while ((money%100)!=0){
            System.out.println("请存入整百:");
            money=sc.nextInt();
        }
        boolean i=true;
        while (i){
            bank.moneys+=money;
            setMoneys(bank.moneys);
            System.out.println("你已经成功存款"+money+"元");
            System.out.println("是否继续存款(y/n):");
            String j=sc.next();
            if (!(j.equals("y"))) {
                i=false;
                break;
            }
            System.out.println("请继续存入");
            money=sc.nextInt();
        }
        bank.exit(bank);
    }

    public void minusMoney(BankAccount bank){
        Scanner sc=new Scanner(System.in);
        System.out.print("欢迎进入取款界面，请输入你要取的钱(只能取整百):");
        int money=sc.nextInt();
        while ((money%100)!=0){
            System.out.println("只能取整百");
            money=sc.nextInt();
        }
        boolean i=true;
        while (i){
            while (money>bank.moneys){
                System.out.println("对不起，余额不足，请调整取款数");
                money=sc.nextInt();
            }
            bank.moneys-=money;
            setMoneys(bank.moneys);
            System.out.println("你已经成功取款"+money+"元");
            System.out.println("是否继续取款(y/n):");
            String j=sc.next();
            if (!(j.equals("y"))) {
                i=false;
                break;
            }
            System.out.println("请继续取钱");
            money=sc.nextInt();
        }
        bank.exit(bank);
    }
    public void getMoney(BankAccount bank){
        System.out.println("你当前的余额为："+bank.moneys);
        bank.exit(bank);
    }
    public void exit(BankAccount bank){
        Scanner sc=new Scanner(System.in);
        System.out.println("请继续选择：1.其他操作   2.退出系统");
        int nums=sc.nextInt();
        switch (nums){
            case 1:bank.menu(bank);break;
            case 2:System.out.println("退出成功!");break;

        }
    }
    public void reg(BankAccount bank){
        Scanner sc=new Scanner(System.in);
        System.out.println("*****枫哥哥超棒银行开户界面*****");
        System.out.println("请输入你的名字:");
        bank.name=sc.next();
        System.out.print("请输入你的账户名(8位)：");
        int account=sc.nextInt();
        bank.setAccount(account);
        System.out.print("请输入你的密码(6位):");
        String password=sc.next();
        bank.setPassword(password);
        System.out.println("恭喜你成功注册枫哥哥超棒银行账户!");
        System.out.println("枫哥哥大气！赠送了你100元！");
        bank.setMoneys(100);
        System.out.println("你的账户是:"+bank.account);
        System.out.println("你的密码是:"+bank.password);
        System.out.println("你当前的余额是:"+bank.moneys);
    }
    public void menu(BankAccount bank){
        Scanner sc=new Scanner(System.in);
        System.out.println("*****枫哥哥超棒银行系统登陆成功*****");
        System.out.println("尊敬的会员"+bank.name+"，请选择操作:");
        System.out.println("1.存款        2.取款      3.查询余额    ");
        System.out.print("请输入编号:");
        int num=sc.nextInt();
        System.out.println("**********************************");
        switch (num){
            case 1:bank.addMoney(bank);break;
            case 2:bank.minusMoney(bank);break;
            case 3:bank.getMoney(bank);
        }
    }
    public void load(BankAccount bank){
        Scanner sc=new Scanner(System.in);
        System.out.println("*****枫哥哥超棒银行系统欢迎你*****");
        System.out.println("*****1.登录      2.退出    ******");
        System.out.print("请输入编号:");
        int num=sc.nextInt();
        System.out.println("********************************");
        switch (num){
            case 1:
                System.out.print("请输入账号:");
                int account=sc.nextInt();
                System.out.print("请输入密码：");
                String password=sc.next();
                int j=0;
                boolean i=true;
                exit:
                while (i){
                    if (((account==bank.account)&&(password.equals(bank.password)))){
                        break exit;
                    }else {
                        j++;
                        if (j==3){
                            //i=false;            //用false会执行完再退出，用break会马上退出
                            break exit;           //false的话总共有4次输错机会，break的话总的三次
                        }
                        System.out.println("你还有"+(3-j)+"次输入机会");
                        System.out.println("账号或密码错误，请重新输入");
                        System.out.print("请重新输入账号:");
                        account=sc.nextInt();
                        System.out.print("请重新输入密码：");
                        password=sc.next();
                    }
                }
                if(j<3){
                    bank.menu(bank);
                }else {
                    System.out.println("你的机会用尽,已经退出登录系统");
                    break;
                }
            case 2:
                System.out.println("退出成功");
                break;
            default:
                break;
        }
    }
    public static void main(String[] args) {
        BankAccount bank=new BankAccount();
        bank.reg(bank);
        bank.load(bank);
    }
}
