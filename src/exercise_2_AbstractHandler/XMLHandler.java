package exercise_2_AbstractHandler;

public  class XMLHandler extends AbstractHandler{

    public   void  open(){
        System.out.println("Відкрито .XML файл");
    };

    public void create() {
        System.out.println("Створено .XML файл");
    }


    public  void change(){
        System.out.println("Змінено .XML файл");
    }
    public  void save(){
        System.out.println("Збережено .XML файл");
    }
}
