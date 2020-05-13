(function(){
    // 바다
    var $waterFront = $("#water-front");
    var $waterBack = $("#water-back");

    (function loopSea(){
        $waterFront
            .animate({'bottom' : '-65px', 'left' : '-30px'}, 500)
            .animate({'bottom' : '-60px', 'left' : '-25px'}, 500);

        $waterBack
            .animate({'bottom' : '15px', 'left' : '-20px'}, 500)
            .animate({'bottom' : '10px', 'left' : '-25px'}, 500);
            
        $.when($waterFront, $waterBack).done(loopSea);   
    })();

    // 구름
    var $cloud1 = $('#cloud-group-1');
    var $cloud2 = $('#cloud-group-2');

    (function loopCloud(){
        $cloud1
            .animate({'left' : '-720px'}, 10000)
            .animate({'left' : '0px'}, 0);
        $cloud2
            .animate({'left' : '0px'}, 10000)
            .animate({'left' : '720px'}, 0, loopCloud);
    })();
    
    // 보트
    var $boat = $('#boat');
    var $questionMark = $('#question-mark');
    var $title1 = $('#title1');
    var $title2 = $('#title2');
    var $form = $('#form');

    $boat.css({'left' : '-220px'});  // 최초, 화면 왼쪽 바깥 위치
    $questionMark.css({'opacity' : 0});  // 최초 투명
    $title1.css({'opacity' : 0});
    $title2.css({'opacity' : 0});
    $form.css({'left' : '370px'});

    $boat.animate({'left' : '20px'}, 2000, function(){
        loopBoat();
        $questionMark.delay(500).animate({'opacity': 1}, 1000, function(){
             $title1.animate({'opacity' : 1}, 1000, function(){
                $title2.animate({'opacity' : 1}, 1000, function(){
                    $form.animate({'left' : 0}, 500); // end $form
                }); // end $title2
             }); // end $title1  
        }); // end $questionMark
    }); // end $boat

    function loopBoat(){
        $boat
            .animate({'bottom' : '15px'}, 500)
            .animate({'bottom' : '25px'}, 500, loopBoat);
    }


})()