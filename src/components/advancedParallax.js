$(document).ready(function() {

    console.log(232)
    $(window).scroll(function () {
        let wScroll = $(this).scrollTop();
        let scropp = wScroll * -0.15;
        let textscroll = wScroll * 1.5;
        $('.parallax-advanced__background--front').css({
            "transform": "translate(0px," + scropp + "px)"
        })
        $('.parallax-advanced__background--text').css({
            "transform": "translate(0px," + textscroll + "px)",
            "opacity": 1 - (textscroll * 0.002),
        })
    })

});