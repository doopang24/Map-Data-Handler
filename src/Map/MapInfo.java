package Map;

public class MapInfo {

    private String stageName;
    private String inputStage;
    private int[][] mapData;
    private int width;
    private int height;
    private int holeCount;  // 구멍 갯수
    private int ballCount;  // 공 갯수
    private int playerRow;  // 플레이어 행 위치
    private int playerCol;  // 플레이어 열 위치

    public String getStageName() { return stageName; }
    public void setStageName(String stageName) { this.stageName = stageName; }

    public String getInputStage() { return inputStage; }
    public void setInputStage(String inputStage) { this.inputStage = inputStage; }

    public int[][] getMapData() { return mapData;}
    public void setMapData(int[][] mapData) { this.mapData = mapData; }

    public int getWidth() { return width; }
    public void setWidth(int width) { this.width = width; }

    public int getHeight() { return  height; }
    public void setHeight(int height) { this.height = height; }

    public int getHoleCount() { return holeCount; }
    public void setHoleCount(int holeCount) { this.holeCount = holeCount; }

    public int getBallCount() { return ballCount; }
    public void setBallCount(int ballCount) { this.ballCount = ballCount; }

    public int getPlayerRow() { return playerRow; }
    public void setPlayerRow(int playerRow) { this.playerRow = playerRow; }

    public int getPlayerCol() { return playerCol; }
    public void setPlayerCol(int playerCol) { this.playerCol = playerCol; }
}
