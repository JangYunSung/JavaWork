//  $('#IMAGE').click(function() { $('#VIDEO').play(); });



$(document).ready(function () {

    $(".d004").click(function(){
		$(".d04").fadeToggle(2000);
    });

    // var vid = $("video").get(0);

    // $("video").on("click", function () {
    //     vid.play();
    // });
    
    var $main_img = $("#main_img").find("ul");

    var $main_imgWidth = $main_img.children().outerWidth(); //이미지의 폭
    var $main_imgHeight = $main_img.children().outerHeight(); // 높이
    var $length = $main_img.children().length; //이미지의 갯수
    var rollingId;

    //정해진 초마다 함수 실행
    rollingId = setInterval(function () {
        rollingStart();
    }, 6000); //다음 이미지로 롤링 애니메이션 할 시간차

    function rollingStart() {
        // console.log($main_img);
        // console.log($length);
        // console.log($main_imgWidth * $length);
        // console.log($main_imgWidth);
        $main_img.css("width", $main_imgWidth * $length + "px");
        $main_img.css("height", $main_imgHeight + "px");
        //alert(main_imgHeight);
        //배너의 좌측 위치를 옮겨 준다.
        $main_img.animate({
            left: -$main_imgWidth + "px"
        }, 3000, function () { //숫자는 롤링 진행되는 시간이다.
            //첫번째 이미지를 마지막 끝에 복사(이동이 아니라 복사)해서 추가
            $(this).append("<li>" + $(this).find("li:first").html() + "</li>");
            //뒤로 복사된 첫번재 이미지는 필요 없으니 삭제.
            $(this).find("li:first").remove();
            //다음 움직임을 위해서 배너 좌측의 위치값을 초기화 .
            $(this).css("left", 0);
            //계속 롤링하는 배너
        });
    }

var didScroll;
var lastScrollTop = 0;
var delta = 5;
var navbarHeight = $('header').outerHeight();

$(window).scroll(function (event) {
    didScroll = true;
});
setInterval(function () {
    if (didScroll) {
        hasScrolled();
        didScroll = false;
    }
}, 200);

// Hide Header on on scroll down 
function hasScrolled() {
    var st = $(this).scrollTop();
    // Make sure they scroll more than delta 
    if (Math.abs(lastScrollTop - st) <= delta)
        return;
    // If they scrolled down and are past the navbar, add class .nav-up. 
    // This is necessary so you never see what is "behind" the navbar. 
    if (st > lastScrollTop && st > navbarHeight) {
        // Scroll Down 
        $('header').removeClass('nav-down').addClass('nav-up');
    } else {
        // Scroll Up
        if (st + $(window).height() < $(document).height()) {
            $('header').removeClass('nav-up').addClass('nav-down');
        }
    }
    lastScrollTop = st;
}



var loginBtn = document.getElementById("loginBtn");
var modal = document.getElementById("id01");
var close = document.getElementsByClassName("close")[0];
var header = document.getElementById("headerz")

loginBtn.onclick = function () {
    modal.style.display = "block";
    header.style.display = "none"
}

close.onclick = function () {
    modal.style.display = "none";
    header.style.display = "block"
}

window.onclick = function (event) {
    if (event.target == modal) {
        modal.style.display = "none";
        header.style.display = "block"
    }
}

// var userId = document.fmField.userId;
//     // 아이디 입력 유무 체크
//     if(userId.value == '' || !(userId.value.length >= 3 && userId.value.length <= 12)) {
//         window.alert("아이디를 입력하시오");
//         document.fmField.uerId.focus();
//         document.getElementById('userId').select();
//         return false; // 아이디 입력이 안되어 있다면 submint 이벤트를 중지
//     }
//     var userPw = document.getElementById('userPw');
//     // 암호 입력 유무 체크
//     if(document.fmField.userPw.value == ''){
//         alert('암호를 입력하세요.');
//         userPw.focus();
//         return false;
//     }
});


// $("#video").on("ended", function() {
//     var $video2=$("#video-1");
//     $(window).scrollTop($video2.offset().top);
//     $video2[0].play();
//     });



