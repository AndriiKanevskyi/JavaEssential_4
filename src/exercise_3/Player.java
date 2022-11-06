package exercise_3;

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
