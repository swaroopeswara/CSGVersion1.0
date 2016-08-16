function LoadSections() {
    //popoulate SectionListPanel
   
    var display = document.getElementById("SectionListPanel");
    if (display != null) {
        var sections = document.getElementsByClassName("content-section");
        if (sections != null) {
            for (var i = 0; i < sections.length; i++) {
                var sectionId = 'SECT_' + i.toString();
             
                var link = null;
                for (var j = 0; j < sections[i].attributes.length; j++) {
                    if (sections[i].attributes[j].name == 'data-title') {
                        link = document.createElement("div");
                        link.innerText = sections[i].attributes[j].value;
                        sections[i].id = sectionId;
                        var descr = document.createElement("p");
                        descr.innerText = sections[i].attributes[j + 1].value;
                        link.appendChild(descr);
                        if (sections[i].attributes[j + 1].value == 'HIDE') link = null;
                    }
                }
                if (link != null) {
                
                    display.appendChild(link);
                    
                    link.setAttribute("onclick", "ScrollToPanel(" + sectionId + ")");
                }
            }

        }
    }
}


function Navigate3(url) {
    location.href = url;
}





function CreateOCRTable() {
    try {
        var myState = [
            {
                S: 'AB', DIS: 11, DEG: 249, MIN: 52, SEC: 00, VER: 'A', Y: -65104.53, X: 2914360.90
            },
            {
                S: 'BC', DIS: 11, DEG: 249, MIN: 52, SEC: 00, VER: 'B', Y: -65104.53, X: 2914360.90
            },
            {
                S: 'CD', DIS: 11, DEG: 249, MIN: 52, SEC: 00, VER: 'C', Y: -65104.53, X: 2914360.90
            },
            {
                S: 'DA', DIS: 11, DEG: 249, MIN: 52, SEC: 00, VER: 'D', Y: -65104.53, X: 2914360.90
            },
        ];

        var row = $('<tr/>');
        var table = $('#OCRTable').css({
            "font-size": "0.9em",
            "border-collapse": "collapse",
            "margin": "20px",
            "border": "10px solid #cccc",
        });

        row.addClass('ItemTitle');
        table.append(row);
        $(row).append($('<th/>').text('Side- Character').css('font-size', '10pt'));
        $(row).append($('<th/>').text('Distance- number (meter)').css('font-size', '10pt'));
        $(row).append($('<th/>').text('Degree').css('font-size', '10pt'));
        $(row).append($('<th/>').text('Minute').css('font-size', '10pt'));
        $(row).append($('<th/>').text('Second').css('font-size', '10pt'));
        $(row).append($('<th/>').text('Point ( Vertex)- number').css('font-size', '10pt'));
        $(row).append($('<th/>').text('Y (meter)-number ').css('font-size', '10pt'));
        $(row).append($('<th/>').text('X (meter)-number').css('font-size', '10pt'));
        $.each(myState, function (index, i) {
            row2 = $('<tr/>');
            table.append(row2);
            $(row2).append($('<td/>').append($('<input/>').val(i.S).attr("id", index + "_" + "0").css("width", "90px")));
            $(row2).append($('<td/>').append($('<input/>').val(i.DIS).attr("id", index + "_" + "1").attr("onkeypress", "return NumAndDecimal(event,this)").css("width", "100px")));
            $(row2).append($('<td/>').append($('<input/>').val(i.DEG).attr("id", index + "_" + "2").attr("onkeypress", "return NumOnly(event,this)").css("width", "90px")));
            $(row2).append($('<td/>').append($('<input/>').val(i.MIN).attr("id", index + "_" + "3").attr("onkeypress", " return NumOnly(event,this)").css("width", "90px")));
            $(row2).append($('<td/>').append($('<input/>').val(i.SEC).attr("id", index + "_" + "4").attr("onkeypress", "return NumOnly(event,this)").css("width", "90px")));
            $(row2).append($('<td/>').append($('<input/>').val(i.VER).attr("id", index + "_" + "5").css("width", "90px")));
            $(row2).append($('<td/>').append($('<input/>').val(i.X).attr("id", index + "_" + "6").attr("onkeypress", " return NumAndDecimal(event,this)").css("width", "100px")));
            $(row2).append($('<td/>').append($('<input/>').val(i.Y).attr("id", index + "_" + "7").attr("onkeypress", " return NumAndDecimal(event,this)").css("width", "100px")));
        });


    } catch (e) {
        alert(e.description);
    }
}

function AddRow() {
    var table = $('#OCRTable');
    index = $("#OCRTable > tbody > tr").length - 1;
    row2 = $('<tr/>');
    table.append(row2);
    $(row2).append($('<td/>').append($('<input/>').attr("id", index + "_" + "0").css("width", "90px")));
    $(row2).append($('<td/>').append($('<input/>').attr("id", index + "_" + "1").attr("onkeypress", "return NumAndDecimal(event,this)").css("width", "100px")));
    $(row2).append($('<td/>').append($('<input/>').attr("id", index + "_" + "2").attr("onkeypress", " return NumOnly(event,this)").css("width", "90px")));
    $(row2).append($('<td/>').append($('<input/>').attr("id", index + "_" + "3").attr("onkeypress", " return NumOnly(event,this)").css("width", "90px")));
    $(row2).append($('<td/>').append($('<input/>').attr("id", index + "_" + "4").attr("onkeypress", " return NumOnly(event,this)").css("width", "90px")));
    $(row2).append($('<td/>').append($('<input/>').attr("id", index + "_" + "5").css("width", "90px")));
    $(row2).append($('<td/>').append($('<input/>').attr("id", index + "_" + "6").attr("onkeypress", " return NumAndDecimal(event,this)").css("width", "100px")));
    $(row2).append($('<td/>').append($('<input/>').attr("id", index + "_" + "7").attr("onkeypress", " return NumAndDecimal(event,this)").css("width", "100px")));

}

function NumOnly(evt, element) {
    var key = window.event ? event.keyCode : evt.which;

    if (evt.keyCode === 8 || evt.keyCode === 46
     || evt.keyCode === 37 || evt.keyCode === 39) {
        return true;
    }
    else if (key < 48 || key > 57) {
        return false;
    }
    else return true;
}

function NumAndDecimal(evt, element) {
    var charCode = (evt.which) ? evt.which : event.keyCode
    if (
        (charCode != 45 || $(element).val().indexOf('-') != -1) &&      // “-” CHECK MINUS, AND ONLY ONE.
        (charCode != 46 || $(element).val().indexOf('.') != -1) &&      // “.” CHECK DOT, AND ONLY ONE.
        (charCode < 48 || charCode > 57)) {
        return false;
    } else
        return true;
}