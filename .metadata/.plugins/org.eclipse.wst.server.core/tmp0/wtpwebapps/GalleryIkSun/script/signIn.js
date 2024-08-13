$(function(){
    $(".tabmenu li").click(function(){
        $(".tabmenu li").removeClass("on");
        $(this).addClass("on");

        let i=$(this).index();
        $(".tabcon").hide();
        $(".tabcon").eq(i).show();

        return false;
    });
});