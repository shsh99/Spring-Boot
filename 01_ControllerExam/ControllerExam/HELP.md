# SpringBoot 프로젝트 생성법
1) 웹 제작(Spring initializer) : http://start.spring.io
    - Project 빌드     : Gradle - Groovy
    - spring boot 버전 : 2.7.16 선택
    - spring Metadata : Artifact : 프로젝트 명 넣기 (예: helloworld)
    - Packaging       : War 선택
    - Java            : jdk 11 선택
    - (오른쪽화면) Dependencies : ADD Dependencies 버튼 클릭 : 라이브러리 추가
      (1) Spring Boot DevTools
      (2) Lombok
      (3) Spring Web
    - GENERATE 버튼 클릭 : zip 압축된 spring 프로젝트 파일 다운로드 됨
2) 인텔리제이 Ultimate(상용) : 위의 기능이 내장되어 있음
    - 이름 : 프로젝트명 넣기 (예: helloworld)

# SpringBoot 환경 설정 :
1) 인텔리제이 툴 설정 : 에디터 - 파일 인코딩 - (우측화면) 프로퍼티 파일 인코딩 : UTF-8
   명확한 Native에서 ASCII로 변환(체크)
2)                    빌드,실행,배포 - 컴파일러 - (우측화면) 프로젝트 자동빌드(체크)
3)                    고급 설정 - (우측화면) 컴파일러 - 개발된 애플리케이션이 현재...(체크)


