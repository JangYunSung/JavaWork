var viewItem = "depth=1&parent=0";   //초기값을 세팅해준다



$(document).ready(function(){
	$( '#mycate span:nth-child(1) select' ).addClass( 'first' );
	$( '#mycate span:nth-child(2) select' ).addClass( 'second' );
	$( '#mycate span:nth-child(3) select' ).addClass( 'third' );
	
	loadPage(); //첫번째 드롭박스의 나열될 값을 받아온다
	
	
	                                                                                           // 0번째이니까 
	// class first의 값이 변할때  .first에서 선택한 옵션의 uid 데이터 와 .first에서 선택한 옵션의 depth 값을 int형으로 변환한값에 +1한 값을 viewItem 변수에 담는다   
	$(".first").change(function(){
		if($(this).val() == 0){
	         $(".second").attr("disabled",true);
	         $(".second").html("");
	         $(".third").attr("disabled",true);
	         $(".third").html("");
	         
	      }else{
	    	  viewItem = "depth="+(parseInt($('.first option:selected').attr('data-depth'))+1)+"&parent="+$('.first option:selected').attr('data-uid');
	    	  console.log(viewItem);
	    	  loadPage();   // class first값이 변하고나서 나열될 값을 로딩한다
	      }
	});
	
	$(".second").change(function(){
		if($(this).val() == 0){
	         $(".third").attr("disabled",true);
	         $(".third").html("");
	         
	      }else{
	    	  viewItem = "depth="+(parseInt($('.second option:selected').attr('data-depth'))+1)+"&parent="+$('.second option:selected').attr('data-uid');
	  		console.log(viewItem);
	  		loadPage();
	      }
		
	});
}); 

//$(document).ready( function() {
//	$( '#mycate span:nth-child(1) select' ).attr('id', 'first');
//} );
//$(document).ready( function() {
//	$( '#mycate span:nth-child(2) select' ).attr('id', 'second');
//} );
//$(document).ready( function() {
//	$( '#mycate span:nth-child(3) select' ).attr('id', 'third');
//} );
//$(document).ready(function(){

//	loadPage();
//	
//	
//	
//	
//	$("#first").change(function(){
//		viewItem = "uid="+$('#first option:selected').attr('data-uid')+"&depth="+(parseInt($('#first option:selected').attr('data-depth'))+1);
//		console.log(viewItem);
//		loadPage();
//	});
//	
//	$("#second").change(function(){
//		viewItem = "uid="+$('#second option:selected').attr('data-uid')+"&depth="+(parseInt($('#second option:selected').attr('data-depth'))+1);
//		console.log(viewItem);
//		loadPage();
//	});
//}); 
function loadPage(){
	$.ajax({
		url : "cate_list.ajax",  //category list.ajax 에 값을 넘겨준다
		type : "POST",    // 형식은 GET방식말고 POST 방식 
		data : viewItem,   // 데이터는 viewItem에 담아서 보낸다   viewItem : uid=?&
		cache : false,   // false 를 하는 이유 : ajax로 통신하는중 남아있는 데이터가 있을경우 새로운 값을 받지 못하기때문에 false 로 한다 .
		success : function(data, status){
			if(status == "success"){    //seccess (PlainObject data, String textStatus, jqXHR jqXHR) : 요청이 성공 했을 때 호출할 콜백 함수
				console.log(data);
				updateList(data);        // success된다면   업데이트리스트에 데이터를 담는다 
			}
		}
	})
}

function updateList(jsonObj){         // jsonObj 값에 data를 받아온다
	result = "<option value='0'>선택하세요---</option>"; 
	
	if(jsonObj.status == "OK"){
		
		var count = jsonObj.count;    // jsonObj에 담긴 데이터에 갯수 
		var i;
		var items = jsonObj.data;   // jsonObj가 불러온 데이터를  item에 담는다
		for(i = 0; i < count; i++){       //선택하는 드롭박스에 depth은 다 똑같으니까    items[0].depth 
		
			$('.cate span:nth-child('+ items[0].depth + ') select').attr("disabled", false);
			result += "<option class= 'optionf' data-uid='"+ items[i].uid+"' data-depth='"+ items[i].depth+"'>" + items[i].name + "</option>"
			
			
		}   // 클래스 .cate 자식 span (현재 items[0].depth값  ajax값이 한바퀴 돌때마다 +1) 
		$('.cate span:nth-child('+ items[0].depth + ') select').html(result);
		$('.cate span:nth-child('+ (items[0].depth + 1) + ') select').attr("disabled", true);
		$('.cate span:nth-child('+ (items[0].depth + 1) + ') select').html("");
		return true;
	} else {
		alert(jsonObj.message);
		return false;
	}
	return false;
} 