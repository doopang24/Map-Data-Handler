package Map;

import java.util.Map;
import java.util.HashMap;

public class Converter {

    private static final Map<Character, Integer> symbolToValue = new HashMap<>();   // 기호를 숫자로 연결하는 HashMap 저장

    static {    // 클래스가 로드될 때 실행되는 정적 초기화 블록
        symbolToValue.put(' ', 0);  // 빈 공간
        symbolToValue.put('O', 1);  // 구멍
        symbolToValue.put('o', 2);  // 공
        symbolToValue.put('P', 3);  // 플레이어
        symbolToValue.put('#', 4);  // 벽
    }

    public int charToValue(char symbol) {
        return symbolToValue.getOrDefault(symbol, -1);
    }
}
