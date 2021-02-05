<template>
  <div class="l-wrap">
    <div class="l-header">
      <h1 class="logo"><a href=""></a></h1>

      <dl class="align-center">
        <dt>김길동</dt>
        <dd>SKTelecom</dd>
        <dd>Cloud Application Architect팀</dd>
      </dl>

      <div class="links">
        <a href="">ITSD</a>
        <a href="">PCP</a>
        <a href="">정보보안포털</a>
      </div>
    </div>

    <div class="page-main">
      <div class="main-visual-wrap">
        <div class="main-visual">
          <div class="w-inner">
            <p class="main-visual-txt-1"></p>
            <p class="main-visual-txt-2"></p>
            <p class="main-visual-txt-3"></p>
          </div>
        </div>
      </div>
      <section class="sc-pro w-inner">
        <header class="align-center">
          <h1 class="sc-tit">참여중인 프로젝트 정보</h1>
          <a href="" class="btn-go ml-auto">프로젝트 생성변경 <i></i></a>
        </header>

        <ul class="pro-list">
          <li class="pro-item">
            <div class="header-wrap">
              <div class="header">
                <div class="header-inner">
                  <h2>T World Push 서비스</h2>
                  <small>2021.01.03~2021.12.31</small>
                  <p>기획자</p>
                </div>

                <div class="status type-ongoing">진행중</div>
              </div>

              <div class="sites">
                <a href="" class="link-jira">Jira</a>
                <a href="" class="link-confluence">Confluence</a>
                <a href="" class="link-bitbucket">Bitbucket</a>
                <a href="" class="link-jenkins">Jenkins</a>
              </div>
            </div>

            <div class="details">
              <div class="scroll">
                <ul class="details-list scroll-list">
                  <li class="details-item">
                    <button class="btn-sm btn-round type-ongoing">진행중</button
                    ><a href="">신규 사용자 등록 화면 설계</a>
                  </li>

                  <li class="details-item">
                    <button class="btn-sm btn-round type-ongoing">진행중</button
                    ><a href="">로그인화면 화면 설계</a>
                  </li>

                  <li class="details-item">
                    <button class="btn-sm btn-round type-ongoing">진행중</button
                    ><a href="">Demo 시나리오 화면 설계</a>
                  </li>

                  <li class="details-item">
                    <button class="btn-sm btn-round type-ongoing">진행중</button
                    ><a href="">신규 사용자 등록 화면 설계</a>
                  </li>

                  <li class="details-item">
                    <button class="btn-sm btn-round type-ongoing">진행중</button
                    ><a href="">로그인화면 화면 설계</a>
                  </li>

                  <li class="details-item">
                    <button class="btn-sm btn-round type-ongoing">진행중</button
                    ><a href="">Demo 시나리오 화면 설계</a>
                  </li>
                </ul>
              </div>
            </div>
          </li>

          <li class="pro-item">
            <div class="header-wrap">
              <div class="header">
                <div class="header-inner">
                  <h2>Public Cloud Portal 구축</h2>
                  <small>2021.01.03~2021.12.31</small>
                  <p>PM</p>
                </div>

                <div class="status type-closing">종료<br />예정</div>
              </div>

              <div class="sites">
                <a href="" class="link-jira">Jira</a>
                <a href="" class="link-confluence">Confluence</a>
                <a href="" class="link-bitbucket">Bitbucket</a>
                <a href="" class="link-jenkins">Jenkins</a>
              </div>
            </div>

            <div class="details">
              <div class="scroll">
                <ul class="details-list">
                  <li class="details-item">
                    <button class="btn-sm btn-round type-standby">
                      배포대기</button
                    ><a href="">로고변경사항 최종 적용</a>
                  </li>

                  <li class="details-item">
                    <button class="btn-sm btn-round type-closing">
                      종료예정</button
                    ><a href="">사용성테스트 진행</a>
                  </li>
                </ul>
              </div>
            </div>
          </li>

          <li class="pro-item">
            <div class="header-wrap">
              <div class="header">
                <div class="header-inner">
                  <h2>IT DevOps그룹 CT추진 WG</h2>
                  <small>2021.01.03~2021.12.31</small>
                  <p>기획자</p>
                </div>

                <div class="status type-done">종료</div>
              </div>

              <div class="sites">
                <a href="" class="link-jira">Jira</a>
                <a href="" class="link-confluence">Confluence</a>
                <a href="" class="link-bitbucket">Bitbucket</a>
                <a href="" class="link-jenkins">Jenkins</a>
              </div>
            </div>

            <div class="details">
              <div class="scroll">
                <ul class="details-list">
                  <li class="details-item">
                    <button class="btn-sm btn-round type-done">종료</button
                    ><a href="">운영기 이관 진행 검토</a>
                  </li>

                  <li class="details-item">
                    <button class="btn-sm btn-round type-done">종료</button
                    ><a href="">최종 통합테스트 실행</a>
                  </li>
                </ul>
              </div>
            </div>
          </li>
        </ul>
      </section>
      <!-- -------------------------------- 차트 시작 ---------------------------------------- -->

      <!-- <section class="sc-dash w-inner">
  <h1 class="sc-tit">Dashboard</h1>

  <div class="tabs">
      <a href="tab1" class="on">프로젝트진척률</a>
      <a href="tab2">결함발생률</a>
      <a href="tab3">주단위 배포건수</a>
      <a href="tab4">조직 내 프로젝트 진행건수</a>
  </div>

</section> -->

      <!-- -------------------------------- 차트 끝 ---------------------------------------- -->
      <section class="sc-aside w-inner">
        <div class="notice">
          <div class="align-center">
            <h1 class="sc-tit">공지사항</h1>
            <button class="btn-more"></button>
          </div>

          <ul class="notice-list">
            <li>
              <a href=""
                >Public Cloud 기반 통합 Toolchain 환경 구성이 완료되었습니다.</a
              >
              <small>2021.01.07</small>
            </li>
            <li>
              <a href="">DOSS시스템 패치 작업 공지 1.13(수) </a>
              <small>2021.01.07</small>
            </li>
            <li>
              <a href=""
                >새롭게 선보인 DOSS 시스템에 대해 구성원 여러분들의 의견을
                듣습니다.
              </a>
              <small>2021.01.07</small>
            </li>
          </ul>
        </div>

        <ul class="download-list">
          <li>
            <a href="">
              <p>DOSS 전사 공통가이드</p>
              <span>다운로드</span>
            </a>
          </li>

          <li>
            <a href="">
              <p>DOSS 사용자 매뉴얼</p>
              <span>다운로드</span>
            </a>
          </li>
        </ul>
      </section>
    </div>

    <div class="l-footer">COPYRIGHT© SK TELECOM ALL RIGHTS RESERVED.</div>
  </div>
</template>

<script>

export default {
  name: "Home",
  components: {
    
  },
};
</script>
