# lv3-final-mission

1. 필수 요구사항

- [x] 애플리케이션을 AWS에 배포 가능한 상태로 구축해야 한다.
- [x] 애플리케이션 서버와 데이터베이스 서버를 물리·네트워크 계층에서 분리해야 한다.
- [x] 개발(dev)과 운영(prod)의 설정을 서로 독립적으로 관리·배포해야 한다.

2. 추가 요구사항(선택)

- [x] 소스 변경 시 자동 빌드·배포가 수행되도록 파이프라인을 구성해야 한다.
  - Docker 이미지로 스프링 앱의 버전 관리
  - private submodule을 이용해서 민감한 secret 관리
  - GitHub Actions의 self-hosted runner를 사용하여, develop/main 브랜치에 변경이 발생했을 때 dev/prod 환경에 자동 빌드, 배포 수행

- [x] 개인 도메인을 애플리케이션에 연결하고 HTTPS를 적용해야 한다.
  - dev 환경 도메인: `lv3-final-dev.courseitda.me`
  - prod 환경 도메인: `lv3-final-prod.courseitda.me`
- 애플리케이션 로그를 파일 또는 수집기로 영속화하고 조회 절차를 제공해야 한다.
- 서버 자원(CPU·메모리·네트워크 등)을 지표·대시보드로 시각화해야 한다.
- 운영 중 스키마 변경 시 데이터 보존 상태로 마이그레이션 및 재배포를 완료해야 한다.
- [x] 제공 API의 문서 명세를 작성·공개해야 한다.
  - `lv3-final-prod.courseitda.me/swagger-ui/index.html`
- [x] 전체 인프라를 다이어그램으로 작성하고 각 구성요소 역할을 설명해야 한다. 
  - ![AWS 네트워크 구성도.jpg](imgs%2FAWS%20%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC%20%EA%B5%AC%EC%84%B1%EB%8F%84.jpg)
  - Nginx를 이용하여 HTTP 요청을 HTTPS로 리다이렉트, HTTPS 요청을 EC2 내부 스프링 앱(8080포트)으로 연결
  - dev는 실험 환경이므로, 자유도 높고 접근이 쉬운 Docker 컨테이너로 실행한 DB를 사용한다.
  - prod는 실제 서비스 환경이므로, 보안 위협이 적은 private subnet에 위치시키고, 스냅샷/롤백 기능/AZ 문제 발생 시 장애 대응 등 가용성이 높은 기능을 제공해주는 RDS를 사용한다.
