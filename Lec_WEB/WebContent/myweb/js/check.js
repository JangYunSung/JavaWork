

$(".agree").click(function () {

    if ($("input:checkbox[name=chk]:checked").length !=
        $("input:checkbox[name=chk]").length) {
        alert("약관 전부 동의해주세요!");
    } else {
        location.href= "join.html";
    }
    return false;    // '버튼' 으로 자바스클립트 온클릭이벤트나 
                // 제이쿼리 클릭이벤트를 넣어줄때는 꼭 리턴값을 넣어줘야한다
    });
        // alert("a");
        // self.close();
        // $(window.location).attr('href','join.html');
        // window.location = link.href;
        //location.replace = "join.html";
        // self.close();
        // window.close();
    //    window.open("join.html");
    //    window.location.href("join.html");
    //    window.location.assign("join.html");
    //    close();


    $( document ).ready( function() {
        $( '.cheka' ).click( function() {
          $( '.chek1' ).prop( 'checked', this.checked );
        } );
      } );

// $('.checkall').click(function () {
//     if ($("input:checkbox[name=chk]").is(":checked") != true) {
//         $("input[name=chk]:checkbox").prop("checked", false);
//     } else {
//         $("input[name=chk]:checkbox").prop("checked", true);

//     }
// });


// if ($(".checkAll").is(':checked')) {
//     $("input[type=checkbox]").prop("checked", true);
// } else {
//     $("input[type=checkbox]").prop("checked", false);
// }