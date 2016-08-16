
function FlagWidget(canvas, dataPoints) {
    var data = [{ value: dataPoints[0], color: "Red", label: "Top priority" },
                        { value: dataPoints[1], color: "Orange", label: "Priority" },
                        { value: dataPoints[2], color: "#1A1A1A", label: "Normal" }
    ];

    var pieFlags = canvas.getContext("2d");
    new Chart(pieFlags).Pie(data, {
        percentageInnerCutout: 30,
        animationSteps: 30,
        segmentShowStroke: false,
        tooltipFontSize: 10,
    });
}

function AgeWidget(canvas, dataPoints) {
    var data = {
        labels: [">M", ">2W", ">W", "This W"],
        datasets: [
            {
                label: "Record Count",
                fillColor: "rgba(220,220,220,0.8)",
                strokeColor: "rgba(220,220,220,1)",
                pointColor: "rgba(220,220,220,1)",
                pointStrokeColor: "#fff",
                pointHighlightFill: "#fff",
                pointHighlightStroke: "rgba(220,220,220,1)",
                datasetFill: true,
                data: dataPoints
            }
        ]
    };

    var barAge = canvas.getContext("2d");

    var chart = new Chart(barAge).Bar(data, {
        showScale: true,
        showTooltips: false,
        animationSteps: 30,
        scaleFontSize: 9,
        barValueSpacing: 2,
        scaleFontColor: "rgba(220, 218, 218, 0.9)",
        scaleShowGridLines: true,
        scaleGridLineColor: "rgba(220, 218, 218, 0.05)",
        scaleGridLineWidth: 1,
        scaleShowHorizontalLines: true,
        scaleShowVerticalLines: false,
        scaleBeginAtZero: true
    });

    //var data = [{ value: dataPoints[0], color: "Red", label: "More than a Month" },
    //                    { value: dataPoints[1], color: "Orange", label: "More than 2 weeks" },
    //                    { value: dataPoints[2], color: "#0A2D6D", label: "More than a week" },
    //                    { value: dataPoints[3], color: "#0A2D6D", label: "This week" }
    //];

    //var barAge = canvas.getContext("2d");

    //new Chart(barAge).Pie(data, {
    //    percentageInnerCutout: 30,
    //    animationSteps: 30,
    //    segmentShowStroke: false,
    //    tooltipFontSize: 10,
    //});
}


function TrendWidget(widget, detailPanel, funcName) {
    var title = $(widget).data('title');
    var dispValue = $(widget).data('state');
    var fillValue = $(widget).data('fill');
    var description = $(widget).data('description');

    widget.setAttribute("onclick", "ShowSection(" + detailPanel + "); " + funcName + "();");

    var lbl = document.createElement('span');
    lbl.innerText = title;
    widget.appendChild(lbl);

    var dummy1 = document.createElement('div');
    var dummy2 = document.createElement('div');
    widget.appendChild(dummy2);
    widget.appendChild(dummy1);

    var data = ($(widget).data('trend'));

    var velocity = document.createElement('label');
    dummy1.appendChild(velocity);
    var trendy = CalculateTrend(data[data.length - 1], data[data.length - 2], data[data.length - 3]);
    switch (trendy[0]) {
        case 0: velocity.setAttribute("class", "orange"); velocity.innerText = trendy[1]; break;
        case 1: velocity.setAttribute("class", "green"); velocity.innerText = trendy[1]; break;
        case -1: velocity.setAttribute("class", "red"); velocity.innerText = trendy[1]; break;
    }

    var lineData = {
        labels: ["Older than 2 m", "> Month", "Older than a week", "Less than a week"],
        datasets: [
            {
                label: "Task count",
                fillColor: "rgba(220,220,220,0.2)",
                strokeColor: "rgba(220,220,220,1)",
                pointColor: "transparent",
                pointStrokeColor: "transparent",
                datasetFill: true,
                pointDot: true,
                data: data,
                animationSteps: 30
            }
        ]
    };

    var canvas = document.createElement('canvas');
    dummy1.appendChild(canvas);
    canvas.setAttribute("class", "line-canvas");



    var stateCanvas = canvas.getContext("2d");

    new Chart(stateCanvas).Line(lineData, {
        showScale: false,
        showTooltips: false,
        scaleFontColor: "rgba(120, 218, 218, 0.69)",
        scaleGridLineWidth: 1,
        scaleShowHorizontalLines: true,
        scaleShowVerticalLines: false,
        animationSteps: 30
    });

    var pieData = [
    {
        value: fillValue,
        color: "#FAD228",
        label: "Y"
    }, {
        value: 100 - fillValue,
        color: "#0A2D6D",
        label: "N"
    }
    ];

    var canvas2 = document.createElement('canvas');
    dummy2.appendChild(canvas2);
    canvas2.setAttribute("class", "pie-canvas");

    var state2Canvas = canvas2.getContext("2d");
    new Chart(state2Canvas).Pie(pieData, {
        percentageInnerCutout: 70,
        animationSteps: 10,
        segmentShowStroke: false,
        showTooltips: false,

        animationEasing: "linear"
    });

    var state = document.createElement('div');
    state.setAttribute("class", "inner-text");
    state.innerText = dispValue;
    dummy2.appendChild(state);

    var descr = document.createElement('p');
    descr.innerText = description;
    dummy1.appendChild(descr);


}

function CalculateTrend(v1, v2, v3) {
    if (v1 > v2 & v2 > v3) return [1, "OK"];
    if (v1 < v2 & v2 < v3) return [-1, "CHECK"];
    return [0, "OK"];
}

function BarChart(canvas, dataPoints) {
    var data = {
        labels: ["J", "F", "M", "A", "M", "J"],
        datasets: [
            {
                label: "Record Count",
                fillColor: "rgba(220,220,220,0.8)",
                strokeColor: "rgba(220,220,220,1)",
                pointColor: "rgba(220,220,220,1)",
                pointStrokeColor: "#fff",
                pointHighlightFill: "#fff",
                pointHighlightStroke: "rgba(220,220,220,1)",
                datasetFill: true,
                data: dataPoints
            }
        ]
    };

    var barAge = canvas.getContext("2d");

    var chart = new Chart(barAge).Bar(data, {
        showScale: true,
        showTooltips: false,
        animationSteps: 30,
        scaleFontSize: 9,
        barValueSpacing: 2,
        scaleFontColor: "rgba(220, 218, 218, 0.9)",
        scaleShowGridLines: true,
        scaleGridLineColor: "rgba(220, 218, 218, 0.05)",
        scaleGridLineWidth: 1,
        scaleShowHorizontalLines: true,
        scaleShowVerticalLines: false,
        scaleBeginAtZero: true
    });
}

function PieChart(canvas, dataPoints, legendContainer) {

    var pieFlags = canvas.getContext("2d");
    new Chart(pieFlags).Pie(dataPoints, {
        percentageInnerCutout: 33,
        animationSteps: 20,
        segmentShowStroke: false,
        tooltipFontSize: 10,
        animationEasing: "linear"
    });

    if (legendContainer != null) {
        legend(legendContainer, dataPoints);
    }
}

function LineChart(canvas, dataPoints, legendContainer) {
    var data = {
        labels: ["A week", "2 Weeks", "A Month", "Older"],
        datasets: [
            {
                label: "Task count",
                fillColor: "rgba(220,220,220,0.2)",
                strokeColor: "rgba(220,220,220,1)",
                pointColor: "rgba(220,220,220,1)",
                pointStrokeColor: "#fff",
                pointHighlightFill: "#fff",
                pointHighlightStroke: "rgba(220,220,220,1)",
                datasetFill: true,
                data: dataPoints
            }
        ]
    };

    var barAge = canvas.getContext("2d");

    var chart = new Chart(barAge).Line(data, {
        showScale: true,
        showTooltips: false,
        pointDot: true,
        animationSteps: 30,
        scaleFontColor: "rgba(220, 218, 218, 0.69)"
    });
    if (legendContainer != null) {
        legend(legendContainer, data);
    }
}

function AgeAnalysis(labels, canvas, dataTotal, dataNew, legendContainer) {
    var data = {
        labels: labels,
        datasets: [
            {
                label: "Total",
                fillColor: "rgba(220,220,220,0.8)",
                strokeColor: "rgba(220,220,220,1)",
                pointColor: "rgba(220,220,220,1)",
                pointStrokeColor: "#fff",
                pointHighlightFill: "#fff",
                pointHighlightStroke: "rgba(220,220,220,1)",
                data: dataTotal
            },
            {
                label: "New",
                fillColor: "rgba(10,45,109,0.8)",
                strokeColor: "rgba(10,45,109,1)",
                pointColor: "rgba(10,45,109,1)",
                pointStrokeColor: "#fff",
                pointHighlightFill: "#fff",
                pointHighlightStroke: "rgba(10,45,109,1)",
                data: dataNew
            }
        ]
    };

    var barAge = canvas.getContext("2d");

    var chart = new Chart(barAge).Line(data, {
        showScale: true,
        showTooltips: true,
        scaleFontSize: 9,
        scaleFontColor: "rgba(220, 218, 218, 0.9)",
        scaleColor: "gray",
        animationSteps: 30,
        tooltipFontSize: 9,
        pointDot: true,
        scaleGridLineColor: "rgba(220, 218, 218, 0.05)",
        scaleGridLineWidth: 1,
        scaleShowHorizontalLines: true,
        scaleShowVerticalLines: false
    });
    if (legendContainer != null) {
        legend(legendContainer, data);
    }
}

function LineChart2(labels, canvas, data1, data2, legendContainer) {
    var data = {
        labels: labels,
        datasets: [
            {
                label: "Public",
                fillColor: "rgba(220,220,220,0.2)",
                strokeColor: "rgba(220,220,220,1)",
                pointColor: "rgba(220,220,220,1)",
                pointStrokeColor: "#fff",
                pointHighlightFill: "#fff",
                pointHighlightStroke: "rgba(220,220,220,1)",
                data: data1
            },
            {
                label: "Internal",
                fillColor: "rgba(10,45,109,0.4)",
                strokeColor: "rgba(10,45,109,1)",
                pointColor: "rgba(10,45,109,1)",
                pointStrokeColor: "#fff",
                pointHighlightFill: "#fff",
                pointHighlightStroke: "rgba(10,45,109,1)",
                data: data2
            }
        ]
    };

    var barAge = canvas.getContext("2d");

    var chart = new Chart(barAge).Line(data, {
        showScale: true,
        showTooltips: true,
        animationSteps: 30,
        scaleFontSize: 9,
        scaleFontColor: "rgba(220, 218, 218, 0.69)",
        scaleGridLineColor: "rgba(220, 218, 218, 0.05)",
        scaleGridLineWidth: 1,
        scaleShowHorizontalLines: true,
        scaleShowVerticalLines: false
    });
    if (legendContainer != null) {
        legend(legendContainer, data);
    }
}

