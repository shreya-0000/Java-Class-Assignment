public class Addition {

    int num1;
    int num2;

    Addition(int a, int b){
        num1 = a;
        num2 = b;
    }

    void add(){
        int result = num1 + num2;
        System.out.println(result);
    }
     public static void main(String[] args) {
        Addition obj = new Addition(60,30);
        obj.add();
     }
}
