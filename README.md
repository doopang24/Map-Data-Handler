# Map-Data-Handler

- 맵 정보를 객체로 저장 및 출력하기


## 필요한 기능

- stage를 String으로 입력받음
- 입력받은 stage를 "====="를 기준으로 나눔
- 나눈 stage n의 내용을 숫자 배열로 변환
- 변환된 숫자배열로 MapInfo 클래스를 사용해서 정보를 읽고 저장
- 읽어낸 정보 출력


## 프로그램 구성

### Application.java
- Stage의 정보를 문자열로 입력받음
- 지도 정보로 가공할 수 있게 문자열을 숫자 배열로 변환해서 MapInfo 객체로 저장
- 저장한 MapInfo 객체의 정보 출력

### MapInfo.java
- 데이터들을 읽고 저장할 수 있는 변수들을 가진 클래스

### Converter.java
- 입력받은 symbol을 그에 맞는 저장값으로 변환할 때 사용할 수 있는 클래스


## 겪은 문제상황

- stage 문자열을 "====="로 나누고, 첫 번째 줄을 stageName으로 정했음
- stage1은 잘 되는데 stage2부터 stageName을 찾지 못함
  - 원인 : 각 stage의 위 아래로 예상치 못한 공백 줄 발생
  - 해결 : strip()으로 공백 제거


## 소감

- 지금까지 혼자서 풀어본 코딩테스트 과제들은 모두 문제를 풀어내거나, 게임을 구현하거나 중 하나였는데, 정보를 읽은 후에 정해진 형식으로 출력하는 것은 처음이라 어려웠습니다.




