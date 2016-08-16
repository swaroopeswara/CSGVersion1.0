
function AutoExpand(textArea, maxRows) {
    while (
                textArea.rows > 1 &&
                textArea.scrollHeight < textArea.offsetHeight
    ) {
        textArea.rows--;
    }
    var h = 0;
    while (textArea.scrollHeight > textArea.offsetHeight && h !== textArea.offsetHeight) {
        h = textArea.offsetHeight;
        if (textArea.rows < maxRows) textArea.rows++;
    }
    if (textArea.rows < maxRows) textArea.rows++;
}

function WidgetContain(widget) {
    var widgets = document.getElementsByClassName("expansion-panel");
    if (widgets != null) {
        for (var i = 0; i < widgets.length; i++) {
            if (widgets[i] != widget) {
                $(widgets[i]).hide(1000);
            }
        }
    }
    Toggle(widget);
}

function OpenPopup(url) {
    window.open(url, "_blank");
}

function CloseAllPanels(con) {
    //todo:must be converted to jquery
    var sections = document.getElementsByClassName("time-content");
    if (sections != null) {
        for (var i = 0; i < sections.length; i++) {
            if (sections[i] != con) {
                $(sections[i]).hide(1000);
            }
        }
    }
    Toggle(con);
}

function Navigate2(url) {

    window.location = url;
}

function Toggle(con) {
    $(con).toggle(500);
}

function Logout() {
    alert('web service called');
    window.close();
}

function ScrollToPanel(obj) {
    $('html, body').animate({
        scrollTop: $(obj).offset().top - 120
    }, 1000);
}

function GalleryOpen(pic) {
    var obj = null;
    switch (pic.style.width) {
        default:
            pic.style.width = '800px';
            //scroll to pic 
            obj = pic;
            break;
        case '800px':
            pic.style.width = '200px';
            //scroll to gallery
            obj = pic.parentNode;
            break;
    }
    this.ScrollToPanel(obj);
}

