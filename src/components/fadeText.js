$(document).ready(function() {
    $.fn.extend({
        toggleText: function(stateOne, stateTwo) {
            return this.each(function() {
                stateTwo = stateTwo || '';
                $(this).text() !== stateTwo && stateOne ? $(this).text(stateTwo)
                    : $(this).text(stateOne);
            });
        }
    });
    $('.button').click(function(){
        $(this).siblings().toggleClass('showHidetext');
        $(this).toggleText('Vis mere', 'Vis Mindre')
    });
});

