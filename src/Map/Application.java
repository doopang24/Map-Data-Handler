package Map;

import java.util.*;

public class Application {

    MapInfo mapInfo = new MapInfo();

    public static void main(String[] args) {
        Application application = new Application();

        application.receiveMapInfo();


    }

    public void receiveMapInfo() {
        Scanner scanner = new Scanner(System.in);
    }

    public void printMapInfo() {
        System.out.println("가로크기: ");
        System.out.println("세로크기: ");
        System.out.println("구멍의 수: ");
        System.out.println("공의 수: ");
        System.out.println("플레이어 위치: ");
    }
}
