public class OOP_1{
    public static void main(String[] args) {
        BankAcc a1 = new BankAcc(); // 'BankAcc()' is a constructor of BankAcc class created by java by default
        a1.setAccNum(788888888);
        a1.setPassword("abcdefghijklmnopqrstuvwxyz");
        System.out.println(a1.getAccNum());
        System.out.println(a1.getPassword());
    }
}

// Encapsulation 💊 : defined as wrapping up data & methods under a single unit. It also implements data hiding

class BankAcc{
    private int accNum;
    private String password;

    // setters : sets value
    void setAccNum(int acc) {  // 'acc' is value assigned to object while calling this method
        this.accNum = acc;     // 'this' here means object which will be created in future
    }

    void setPassword(String pwd){
        this.password = pwd;
    }

    // getters : gets value 
    int getAccNum(){
        return this.accNum;
    }
    String getPassword(){
        return this.password;
    }
}