package exercise_2_AbstractHandler;
/*
Завдання 2

Використовуючи IntelliJ IDEA, створіть проект.
Потрібно: Створити клас AbstractHandler.
У тілі класу створити методи void open(), void create(), void change(), void save().
 Створити похідні класи XMLHandler, TXTHandler, DOCHandler від базового класу AbstractHandler.
  Написати програму, яка виконуватиме визначення документа і для кожного формату мають бути методи відкриття,
   створення, редагування, збереження певного формату документа.
 */

public class Main {

    public static void main(String[] args) {
     AbstractHandler file1 = new XMLHandler();
     AbstractHandler file2 = new TXTHandler();
     AbstractHandler file3 = new DOCHandler();


     operete(file1);
     operete(file2);
     operete(file3);

    }

 public static void operete(AbstractHandler obj){
  if (obj instanceof XMLHandler){
   System.out.println("Отриманий файл це .XML");
   obj.create();
   obj.open();
   obj.change();
   obj.save();
   System.out.println("--------------------------");}

  if (obj instanceof TXTHandler){
   System.out.println("Отриманий файл це .TXT");
   obj.create();
   obj.open();
   obj.change();
   obj.save();
   System.out.println("--------------------------");}


  if (obj instanceof DOCHandler){
   System.out.println("Отриманий файл це .DOC");
   obj.create();
   obj.open();
   obj.change();
   obj.save();
   System.out.println("--------------------------");}
    }

    }
