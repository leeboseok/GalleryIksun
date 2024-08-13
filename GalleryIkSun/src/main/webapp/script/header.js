$(function(){
    $("nav> ul> li").mouseenter(function(){
        $(".sub").stop().slideDown();
        $(".bg").show();
    });
    $("nav> ul> li").mouseleave(function(){
        $(".sub").stop().slideUp();
        $(".bg").hide();
    });
});