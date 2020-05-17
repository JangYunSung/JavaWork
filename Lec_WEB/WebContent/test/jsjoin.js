$(function(){
    $("#frn").validate({
        submitHandler: function() {
            var f = confirm("중개소등록을 하시겠습니까?");
            if(f){
                return true;
            } else {
                return false;
            }
        },rules:{   // 정책 정하기 
            mb_email:{
                required :true   // 필수입력항목
                , email : true   // 이메일
                 // ajax, 결과 값으로는 true, false (문자열)
                , remote:'<?php echo SNW_SITE_URL; ?>/member/email_check' 
            }
            ,mb_password:{
                pw_regexp : true   // 정규식
                ,minlength : 4     // 최소입력글수  4자
                ,maxlength : 12    // 최대입력글수 12자
            } 
            ,mb_password_re:{
                equalTo : '#mb_password'   // #mb_password 와 일치하는지 확인
            }
        },	messages:{   // 정책 위반시 메세지
            mb_email:{
                required : '이메일을 입력해주세요.'
                , email : '이메일형식으로 입력해주세요.'
                , remote : '이미 등록된 이메일입니다.'
            }
            ,mb_password:{
                pw_regexp : '영문대소문자,숫자,툭수문자를 반드시 입력해주시기 바랍니다.'
                , minlength : '{0}자 이상 입력해주시기 바랍니다.'
            }
            ,mb_password_re:{
                equalTo : '패스워드가 일치하지 않습니다.'
            }
        }

    });


   $.extend( $.validator.messages, {
           required: "필수 항목입니다."    // required 속성의 공동 메세지 
   });

   // 패스워드 정규직
   $.validator.addMethod("pw_regexp",  function( value, element ) {
        return this.optional(element) ||  /^.*(?=.*\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*$/.test(value);
   });

});