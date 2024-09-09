$(document).ready(function() {

    $("nav> ul> li").mouseenter(function(){
        $(".sub").stop().slideDown();
        $(".bg").show();
    });
    $("nav> ul> li").mouseleave(function(){
        $(".sub").stop().slideUp();
        $(".bg").hide();
    });


    // 팝업창 및 오버레이 요소
    var $popup = $('.popup');
    var $popup_b = $('#popup_b');
    var $popup_c = $('#popup_c');
    var $popup_w = $('#popup_w');
    var $overlay = $('.popup-overlay');

    // '바로구매' 버튼 클릭 시 팝업창 표시
    $('input[name="b_buy"]').on('click', function() {
        login_check();
    });
    $('input[name="b_cart"]').on('click', function() {
        login_check1();
    });
    $('input[name="b_wish"]').on('click', function() {
        login_check2();
    });
// 로그인이 되어 있는지 확인하는 함수
    function checkLogin() {
        // 실제 로그인 상태를 확인하는 로직을 여기에 추가해야 합니다.
        // 현재 예제에서는 로그인 여부를 간단히 확인하기 위해
        // 특정 변수나 상태를 가정하고 사용합니다.
        // 예: 로그인 상태를 나타내는 변수
        return window.isLoggedIn; // 예를 들어, 이 변수를 통해 로그인 여부를 확인
    }

// 로그인 체크 후 이동 함수
    function login_check() {
        if (checkLogin()) {
            // 로그인된 상태라면 order.jsp로 이동
            $overlay.fadeIn();
            $popup_b.fadeIn();
            alert('주문페이지로 이동합니다.');
            window.location.href = 'order.jsp';
        } else {
            // 로그인되지 않은 상태라면 경고창을 띄운 후 signIn.jsp로 이동
            alert('로그인 후 이용하실 수 있습니다');
            window.location.href = 'signIn.jsp';
        }
    }
    function login_check1() {
        if (checkLogin()) {
            // 로그인된 상태라면 cart.jsp로 이동
            $overlay.fadeIn();
            $popup_c.fadeIn();
            window.location.href = 'cart.jsp';
        } else {
            // 로그인되지 않은 상태라면 경고창을 띄운 후 signIn.jsp로 이동
            alert('로그인 후 이용하실 수 있습니다');
            window.location.href = 'signIn.jsp';
        }
    }
    function login_check2() {
        if (checkLogin()) {
            // 로그인된 상태라면 wishlist.jsp로 이동
            $overlay.fadeIn();
            $popup_w.fadeIn();
            window.location.href = 'wishlist.jsp';
        } else {
            // 로그인되지 않은 상태라면 경고창을 띄운 후 signIn.jsp로 이동
            alert('로그인 후 이용하실 수 있습니다');
            window.location.href = 'signIn.jsp';
        }
    }

    // '구매' 버튼 클릭 시 동작
    $('#buy-confirm').on('click', function() {
        $popup.fadeOut();
        $overlay.fadeOut();
        // 구매 처리를 여기에 추가할 수 있음
        login_check();
    // 예제: 로그인 상태를 나타내는 변수를 설정 (실제 구현에서는 서버에서 가져온 정보 사용)
    // 예를 들어, 서버 사이드 스크립트에서 로그인 상태를 이 변수로 설정해줄 수 있습니다.
    // window.isLoggedIn = false; // 로그인 상태가 아니라고 가정
    // window.isLoggedIn = true;  // 로그인 상태라고 가정

    });
    // '장바구니로 이동' 버튼 클릭 시 동작
    $('#move-cart').on('click', function() {
        $popup.fadeOut();
        $overlay.fadeOut();

        login_check1();
    });
    // '위시리스트로 이동' 버튼 클릭 시 동작
    $('#move-wish').on('click', function() {
        $popup.fadeOut();
        $overlay.fadeOut();
        // 이동 처리를 여기에 추가할 수 있음
        login_check2();
    });

    // '취소' 버튼 클릭 시 팝업창 숨김
    $('.buy-cancel').on('click', function() {
        $popup.fadeOut();
        $overlay.fadeOut();
    });

    // 오버레이 클릭 시 팝업창 숨김
    $overlay.on('click', function() {
        $popup.fadeOut();
        $overlay.fadeOut();
    });
});