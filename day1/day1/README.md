# Java 환경설정

1. Github repository 생성
2. JDK 17 설치
    1. homebrew로 jdk 17 설치
        
        ```bash
        brew install openjdk@17
        ```
        
    2. path 지정
        
        ```bash
        vi ~/.zshrc
        ```
        
        ```bash
        # jdk path
        export PATH=/opt/homebrew/Cellar/openjdk@17/17.0.10/bin:$PATH
        ```
        
        - 문제사항
            
            참조한 글에서 안내한 export PATH 와 실제 openjdk가 설치된 PATH가 다름.
            
            finder 로 실제 경로를 찾아 해결
            
    
    c. version 확인
    
    ```bash
    java -version
    #openjdk version "17.0.10" 2024-01-16
    #OpenJDK Runtime Environment Homebrew (build 17.0.10+0)
    #OpenJDK 64-Bit Server VM Homebrew (build 17.0.10+0, mixed mode, sharing)
    ```
    
3. JAVA extension 설치
    
    ![Java Extension](https://github.com/jacti/Java_practice/assets/90906272/b2641607-98aa-4981-9f0b-414555f786b9)

    
4. Java project 생성
    1. command + shift + p
    2. Java: Create Java project
    3. No build tools

# Java 기본 문법

[Java 기본 문법](https://www.w3schools.com/java/java_syntax.asp)

## Syntax

- 모든 라인은 Class 안에 작성되어야함
- 클래스는 무조건 대문자로 시작
- {} 로 코드 블락 표시
- System : built in java class
- ; 으로 끝나야함

### Output

- println → print 이후 새 라인
- Text는 “”로 넣어야함
- 숫자, 수식은 그냥 쓰면 됨

### Comments

```java
///로 주석 넣음
/* 로
여러줄 주석 넣음
*/
System.out.println("주석 끝");
```

### Data type

- `String` - ”string”
- `int` - 0, 1, -1
- `float` - 19.99f 뒤에 f 붙여야함
- `double` - 19.9999999d 뒤에 d 붙여야함
- `char` - ‘a’
- `boolean` - true, false
- x = y = z = 50 처럼 선언 가능
- **Non-primitive Types**
    - reference types
    - null 가능
    - call method 가능
    - 대문자로 시작
    - Strings, Arrays, Classes, Interface, etc.
    - [== vs equals](https://non-major-developer.tistory.com/19)

### Type Casting