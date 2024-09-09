$(function(){
    $("nav> ul> li").mouseenter(function(){
        $(".sub").stop().slideDown();
        $(".h_bg").show();
    });
    $("nav> ul> li").mouseleave(function(){
        $(".sub").stop().slideUp();
        $(".h_bg").hide();
    });
});