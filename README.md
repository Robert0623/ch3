# 스프링의 정석 3장 학습

## git strategy
1. 깃허브사이트에서 origin main(자동생성), dev(수동생성)브랜치 생성
2. IntelliJ에서 초기세팅 후, 로컬 main에서 commit, push.
3. IntelliJ에서 로컬 dev브랜치 생성 후 로컬 main과 merge.(merge into dev - 로컬dev에 check out하고, 로컬main에서 merge)
4. 추가, 수정 코드는 로컬 dev에서 강의별로 commit. 
5. 하루분량 commit이 끝나면 origin dev로 push.
6. 로컬 dev에서 merge into main후, origin main으로 push.
7. 깃허브사이트에서 readme 작성 후, IntelliJ에서 로컬 main으로 pull.
8. 로컬 dev와 merge, 원격 dev로 push.

## 06.10
- 인텔리제이와 깃허브 연동
- ch3-1 ~ ch3-5
- Spring DI - 이론, 실습
- @Component, @Autowired, @Resource, @Value, @Qulifier
- config.xml에 bean 등록 <property>, <constructor-args>, <component-scan>
