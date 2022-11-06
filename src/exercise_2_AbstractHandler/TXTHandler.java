package exercise_2_AbstractHandler;

public class TXTHandler extends AbstractHandler {
    public  void open(){
        System.out.println("Відкрито .TXT файл");
    };

    public void create() {
        System.out.println("Створено .TXT файл");
    }


    public  void change(){
        System.out.println("Змінено .TXT файл");
    }
    public  void save(){
        System.out.println("Збережено .TXT файл");
    }
}
