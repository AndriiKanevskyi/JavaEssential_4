package exercise_3;

/*
Використовуючи IntelliJ IDEA, створіть проект.
 Потрібно: Створіть 2 інтерфейси Playable та Recodable.
  У кожному з інтерфейсів створіть по 3 методи void play() / void pause() / void stop()
  та void record() / void pause() / void stop() відповідно.
   Створіть похідний клас Player від базових інтерфейсів Playable та Recodable.
    Написати програму, яка виконує програвання та запис.
 */

public class Player implements Playable,Recodable{

    public void play(){
        System.out.println("Програвання розпочалось");
    }

    public void record(){
        System.out.println("Запис розпочався");
    }

    @Override
    public void pause() {
        System.out.println("Пауза");
    }

    @Override
    public void stop() {
        System.out.println("Стоп");
    }


    public static void main(String[] args) {
        Player sony = new Player();
        sony.record();
        sony.pause();
        sony.stop();
        sony.play();
        sony.pause();
        sony.stop();
    }
}
