

    //  $('#IMAGE').click(function() { $('#VIDEO').play(); });


$(document).ready(function() { 
        
    var vid = $("video").get(0);
    
    $("video").on("mouseenter",function(){ 
     vid.play(); 
    }); 
});