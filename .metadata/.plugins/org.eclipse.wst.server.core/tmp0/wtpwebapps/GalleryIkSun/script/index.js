$(function(){
    $("nav> ul> li").mouseenter(function(){
        $(".sub").stop().slideDown();
        $(".bg").show();
    });
    $("nav> ul> li").mouseleave(function(){
        $(".sub").stop().slideUp();
        $(".bg").hide();
    });
    function slide(){
        $(".slide ul").animate({left:-100+("%")},2000,function(){
            $(".slide ul").append($(".slide ul li").first());
            $(".slide ul").css({left:0});
        })
    }
    setInterval(slide,3000);
});