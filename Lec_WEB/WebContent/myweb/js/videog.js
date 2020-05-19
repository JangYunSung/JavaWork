

$('#player_screen .top_img').on('click', function (e) {
  e.preventDefault();
  var $item_top = $("#player_screen").find("iframe").attr("src");
  $('#player_screen .top_img').fadeOut("slow");
  $('#player_screen iframe').show().attr("src", $item_top + "&autoplay=1");
});




$('#list .movs a').on('click', function (e) {
  e.preventDefault();
  var $itemx = $(this).parents("dl.movs")
  var $itemx_tit = $itemx.find("dt").html();
  var $itemx_desc = $itemx.find("dd.desc").html();
  var $itemx_url = $itemx.find("dd.url iframe").attr("src");
  var $sc_top = $(document).scrollTop();
  var $player_top = $('#player').offset().top



  $('#player_screen .top_img').hide();
  $('#player_screen iframe').attr("src", $itemx_url + "&autoplay=1");
  $('#player_screen iframe').show();
  $('#player_text dt').html($itemx_tit);
  $('#player_text dd').html($itemx_desc);
  if($player_top < $sc_top) {
    $('html, body').animate({
      scrollTop: $player_top
    }, "slow");
  }
  else {
    return false
  }
});

$(document).ready(function () {
  $('.aa tr').hide();
  $('.aa').find('.studygroup').parent().show();

  $('.aa tr').toggle(
    function () {
      var tr = $('.aa tr');
      var rindex = $(this).parent().children().index(this);
      for (var i = rindex; i <= rindex + 1; i++) {
        $(tr[i]).show();
      }
    },
    function () {
      var tr = $('.aa tr');
      var rindex = $(this).parent().children().index(this);
      for (var i = rindex + 1; i <= rindex + 1; i++) {
        $(tr[i]).hide();
      }

    });

});