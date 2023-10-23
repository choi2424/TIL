<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<!doctype html>
<html lang="en" class="h-100">
<head>
<meta charset="utf-8">
<meta name="viewport"
   content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author"
   content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Hugo 0.101.0">
<title>Sticky Footer Navbar Template · Bootstrap v4.6</title>

<link rel="canonical"
   href="https://getbootstrap.com/docs/4.6/examples/sticky-footer-navbar/">



<!-- Bootstrap core CSS -->
<link rel="stylesheet"
   href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
   integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
   crossorigin="anonymous">


<style>
.bd-placeholder-img {
   font-size: 1.125rem;
   text-anchor: middle;
   -webkit-user-select: none;
   -moz-user-select: none;
   -ms-user-select: none;
   user-select: none;
}

@media ( min-width : 768px) {
   .bd-placeholder-img-lg {
      font-size: 3.5rem;
   }
}
</style>


<!-- Custom styles for this template -->
<link href="/resources/sticky-footer-navbar.css" rel="stylesheet">
</head>
<body class="d-flex flex-column h-100">

   <header>
      <!-- Fixed navbar -->
      <%@include file="/WEB-INF/views/comm/header.jsp"%>
   </header>

   <%-- <c: --%>

   <!-- Begin page content -->
   <main role="main" class="flex-shrink-0">
      <div class="container">
         <section>
            <div class="row">
               <!-- row는 하위 div를 12개를 사용 할 수 있다. -->
               <!-- <div class="col-해상도-숫자(하위 div에서 사용하는 사이즈. 총합이 12가 되어야 한다.)"></div> -->
               <div class="col-md-12">

                  <div class="box">
                     <div class="box-header with-border">
                        <h3 class="box-title">List</h3>
                     </div>

                     <div class="box-body">
                        <table class="table table-bordered">
                           <tbody>
                              <tr>
                                 <th style="width: 10%">번호</th>
                                 <th style="width: 40%">제목</th>
                                 <th style="width: 20%">작성자</th>
                                 <th style="width: 20%">등록일</th>
                                 <th style="width: 10%">조회수</th>
                              </tr>

                              <c:forEach items="${ list }" var="board">
                                 <tr>
                                    <td>${board.idx }</td>
                                    <td><a class="move" href="#" data-idx="${board.idx}">${ board.subject }</a></td>
                                    <td>${board.author }</td>
                                    <td><fmt:formatDate value="${ board.createdate }" pattern="yyyy/MM/dd" /></td>
                                    <td>${board.editdate }</td>
                                 </tr>
                              </c:forEach>

                           </tbody>
                        </table>
                     </div>


                     <div class="box-footer clearfix">
                        <div class="row">
                           <div class="col-6">
                              <nav aria-label="Page navigation example">
                                 <ul class="pagination">
                                    <!-- 이전 표시여부 -->
                                    <c:if test="${pageMaker.prev }">
                                       <li class="page-item">
                                          <a class="page-link" href="/board/list?pageNum=${pageMaker.startPage -1 }">Previous</a>
                                       </li>
                                    </c:if>
                                    <!-- 페이지 번호 출력 -->
                                    <!-- 1	2	3	4	5	5	7	8	9	10	[다음] -->
                                    <!-- [이전]	11	12	13	15	15	16	17	18	19	20	[다음] -->
                                 <c:forEach begin="${pageMaker.startPage }" end="${pageMaker.endPage }" var="num">
                                    <li class='page-item ${pageMaker.cri.pageNum == num ? "active":"" }' aria-current="page">
                                       <a class="page-link movepage" href="#" data-page="${num }">${num }</a>
                                    </li>
                                 </c:forEach>
                                    
                                    <!-- 다음 표시여부 -->
                                    <c:if test="${pageMaker.next }">                                       
                                       <li class="page-item">
                                          <a class="page-link" href="/board/list?pageNum=${pageMaker.endPage +1 }">Next</a>
                                       </li>
                                    </c:if>

                                 </ul>
                              </nav>
                           </div>

                           <!-- 검색기능 -->
                           <div class="col-6">
                              <form action="/board/list" method="get">
                                 <select name="type">
                                    <option selected>검색종류선택</option>
                                    <option value="T" ${pageMaker.cri.type == 'T'?'selected':''}>제목</option>
                                    <option value="C" ${pageMaker.cri.type == 'C'?'selected':''}>내용</option>
                                    <option value="W" ${pageMaker.cri.type == 'W'?'selected':''}>작성자</option>
                                    <option value="TC" ${pageMaker.cri.type == 'TC'?'selected':''}>제목 or 내용</option>
                                    <option value="TW" ${pageMaker.cri.type == 'TW'?'selected':''}>제목 or 작성자</option>
                                    <option value="TWC" ${pageMaker.cri.type == 'TWC'?'selected':''}>제목 or 작성자 or 내용</option>
                                 </select>
                                 <input type="text" name="keyword" value="${pageMaker.cri.keyword}" />
                                 <input type="hidden" name="pageNum" value="1" />
                                 <input type="hidden" name="amount" value="${pageMaker.cri.amount}" />
                                 <button type="submit" class="btn btn-primary">검색</button>
                              </form>
                              <!--1)페이지번호 [이전] 1  2  3  4  5  6  [다음] 페이지 이동목적으로 클릭할 때 사용  -->
                              <!--2)목록에서 제목 클릭할 때 사용  action="/board/get"-->
                              <form id="actionForm" action="/board/list" method="get">
                                 <input type="hidden" name="pageNum" id="pageNum" value="${pageMaker.cri.pageNum}" />
                                 <input type="hidden" name="amount" id="amount" value="${pageMaker.cri.amount}" />
                                 <input type="hidden" name="type" id="type" value="${pageMaker.cri.type}" />
                                 <input type="hidden" name="keyword" id="keyword" value="${pageMaker.cri.keyword}" />
                                 <input type="hidden" name="idx" id="idx" />
                              </form>
                           </div>
                        </div>
                        <a class="btn btn-primary" href="/board/register" role="button">글쓰기</a>

                     </div>
                  </div>

               </div>
            </div>
         </section>
      </div>
   </main>

   <footer class="footer mt-auto py-3">
      <%@include file="/WEB-INF/views/comm/footer.jsp"%>
   </footer>
   <%@include file="/WEB-INF/views/comm/plug-in.jsp"%>

   <script>
      
      let actionForm = document.getElementById("actionForm");
      
      
      
      const movePages = document.getElementsByClassName("movepage");
      Array.from(movePages).forEach(function(mv_page) {
         // actionForm폼 전송
         
         mv_page.addEventListener("click",function(event){
            event.preventDefault();
            
            
            
            document.getElementById("pageNum").value = event.target.dataset.page;
            actionForm.setAttribute("action","/board/list");

            
            actionForm.submit(); // board/list

         });
      });

      
      
      const moves = document.getElementsByClassName("move");
      Array.from(moves).forEach(function(move) {
         // actionForm폼 전송
         move.addEventListener("click",function(event){
            event.preventDefault();
            
            
            document.getElementById("idx").remove();


            
            let idx = event.target.dataset.idx;
            
            const newInput = document.createElement("input");
            newInput.setAttribute("type","hidden");
            newInput.setAttribute("name","idx");
            newInput.setAttribute("id","idx");
            newInput.setAttribute("value",idx);
            actionForm.appendChild(newInput);

            actionForm.setAttribute("action","/board/get");

            actionForm.submit(); 
         });
      });
      
   </script>
</body>
</html>