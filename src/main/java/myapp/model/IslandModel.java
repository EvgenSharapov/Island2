package myapp.model;

public class IslandModel {

    public void startIsland() throws InterruptedException {
        System.out.print("Запускаю приложение .");
        for(int i=0;i<10;i++){
            System.out.print(" . ");
            Thread.sleep(100);
        }
    }
}
