package exercise_2_AbstractHandler;

public class DOCHandler extends AbstractHandler{
    public  void open(){
        System.out.println("Відкрито .DOC файл");
    };

    public void create() {
        System.out.println("Створено .DOC файл");
    }


    public  void change(){
        System.out.println("Змінено .DOC файл");
    }
    public  void save(){
        System.out.println("Збережено .DOC файл");
    }
}
