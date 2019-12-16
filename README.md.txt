spring Legacy Project
 ( 스프링부트를 사용하지않고 직접 세팅하면서 구조를 익힌다. )

openjdk 1.8.0_232
STS 3.8.2 RELEASE
tomcat 9.0
MySql ( WorkBench )
mybatis

------------------------------------------------------------------

root-context.xml
	/ex00/src/main/webapp/WEB-INF/spring/root-context.xml
	- STS가 스프링 프로젝트를 생성할 때 만들어 주는 파일에서 가장 중요한 파일
	- 스프링과 관련된 설정, 즉 웹 자원과 관련되지 않는 모든 자원의 설정을 위해 존재

servlet-context.xml 
	/ex00/src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml
	스프링 MVC 관련 설정만을 분리하기 위해 만들어진 파일
