package Map;

public class Application {

    Converter converter = new Converter();

    public static void main(String[] args) {
        Application application = new Application();
        String[] stages = application.receiveStages();
        for (String singleStage : stages) {
            MapInfo mapInfo = application.parseStage(singleStage.strip());
            application.printMapInfo(mapInfo);
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

    public MapInfo parseStage(String singleStage) {
        MapInfo mapInfo = new MapInfo();
        String[] lines = singleStage.split("\n");
        String stageName = lines[0].trim();

        int height = lines.length - 1;
        int width = lines[1].length();
        int[][] mapData = new int[height][width];

        int holeCount = 0;
        int ballCount = 0;
        int playerRow = -1;
        int playerCol = -1;

        for (int i = 1; i <= height; i++) {
            String line = lines[i];
            for (int j = 0; j < width; j++) {
                char symbol = line.charAt(j);
                int value = converter.charToValue(symbol);
                mapData[i - 1][j] = value;

                if (value == 1) holeCount++;
                else if (value == 2) ballCount++;
                else if (value == 3) {
                    playerRow = i - 1;
                    playerCol = j;
                }
            }
        }
        mapInfo.setStageName(stageName);
        mapInfo.setMapData(mapData);
        mapInfo.setHeight(height);
        mapInfo.setWidth(width);
        mapInfo.setHoleCount(holeCount);
        mapInfo.setBallCount(ballCount);
        mapInfo.setPlayerRow(playerRow);
        mapInfo.setPlayerCol(playerCol);

        return mapInfo;
    }

    public void printMapInfo(MapInfo mapData) {
        System.out.println(mapData.getStageName());
        System.out.println();
        System.out.println(mapData.getMapData());
        System.out.println();
        System.out.println("가로크기: " + mapData.getWidth());
        System.out.println("세로크기: " + mapData.getHeight());
        System.out.println("구멍의 수: " + mapData.getHoleCount());
        System.out.println("공의 수: " + mapData.getBallCount());
        System.out.println("플레이어 위치: " + mapData.getPlayerRow() + "행 " + mapData.getPlayerCol() + "열");
        System.out.println();
    }
}
