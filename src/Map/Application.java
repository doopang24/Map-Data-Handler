package Map;

import java.util.*;

public class Application {

    MapInfo mapInfo = new MapInfo();
    Converter converter = new Converter();

    public static void main(String[] args) {
        Application application = new Application();
        String[] stages = application.receiveStages();
        for (String singleStage : stages) {
            application.parseStage(singleStage);
        }
    }

    public String[] receiveStages() {  // 통채로 들어오는 String
        String input = """
                Stage 1
                #####
                #OoP#
                #####
                =====
                Stage 2
                  #######  
                ###  O  ###
                #    o    #
                # Oo P oO #
                ###  o  ###
                  #  O  #  
                  #######  
                """;
        String[] stages = input.split("=====");     // "="구분자로 나눠서 배열로 둠
        return stages;
    }

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
