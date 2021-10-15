# 클래스(객체)를 체인 패턴으로 쓰기 위한 코드

ChainOfResponsibility -> 체인 패턴

ChainAssembler -> 인터페이스

* 하나의 특정 객체(예: Map)을 가지고 각 각 기능 모듈에서 검사하는 로직을 허용하기 위해 임시로 만든 모듈
* setNextChecker 등록을 통해 객체 별 테스트 순서를 지정할 수 있다.
* 싱글턴으로 사용할 경우 변수가 겹치는 경우가 발생 될 수 있어 @Scope를 Prototype으로 지정한다.

* Sender 클래스를 @Bean이 아닌 @Component로 등록시 context로 로드할 경우 에러가 발생되는 경우가 있음
해당 문제로 인해 Bean으로 등록해서 사용한다.
