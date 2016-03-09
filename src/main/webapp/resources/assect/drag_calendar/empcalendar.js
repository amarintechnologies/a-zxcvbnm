//actually cursor position
var currentMousePos = {
    x: -1,
    y: -1
};

jQuery(document).ready(function () {

   jQuery(document).on("mousemove", function (event) {
        currentMousePos.x = event.pageX;
        currentMousePos.y = event.pageY;
    });

var testBlla = jQuery.parseJSON('[{"title":"X","start":"2015-03-04","end":"2015-03-04","allDay":true,"resource":"jusa","backgroundColor":"rgb(178, 34, 34)","mandays":"3"}, {"title":"X","start":"2015-03-02","end":"2015-03-02","allDay":true,"resource":"mapl","backgroundColor":"rgb(178, 34, 34)","mandays":"5"}, {"title":"X","start":"2015-03-18","end":"2015-03-18","allDay":true,"resource":"zone","backgroundColor":"rgb(178, 34, 34)","mandays":"8"}, {"title":"X","start":"2015-02-11","end":"2015-02-11","allDay":true,"resource":"jusa","backgroundColor":"rgb(178, 34, 34)","mandays":"13"}, {"title":"X","start":"2015-03-25","end":"2015-03-25","allDay":true,"resource":"mamu","backgroundColor":"rgb(178, 34, 34)","mandays":"14"}, {"title":"X","start":"2015-03-15","end":"2015-03-15","allDay":true,"resource":"mapl","backgroundColor":"rgb(178, 34, 34)","mandays":"15"}, {"title":"X","start":"2015-02-19","end":"2015-02-19","allDay":true,"resource":"zone","backgroundColor":"rgb(178, 34, 34)","mandays":"16"}, {"title":"X","start":"2015-02-20","end":"2015-02-20","allDay":true,"resource":"jusa","backgroundColor":"rgb(178, 34, 34)","mandays":"13"}, {"title":"X","start":"2015-02-10","end":"2015-02-10","allDay":true,"resource":"mamu","backgroundColor":"rgb(178, 34, 34)","mandays":"8"}, {"title":"X","start":"2015-03-13","end":"2015-03-13","allDay":true,"resource":"jusa","backgroundColor":"rgb(178, 34, 34)","mandays":"3"}, {"title":"X","start":"2015-02-17","end":"2015-02-17","allDay":true,"resource":"jusa","backgroundColor":"rgb(178, 34, 34)","mandays":"11"}, {"title":"X","start":"2015-02-14","end":"2015-02-14","allDay":true,"resource":"jusa","backgroundColor":"rgb(178, 34, 34)","mandays":"7"}, {"title":"X","start":"2015-03-10","end":"2015-03-10","allDay":true,"resource":"jusa","backgroundColor":"rgb(178, 34, 34)","mandays":"9"}, {"title":"X","start":"2015-02-26","end":"2015-02-26","allDay":true,"resource":"jusa","backgroundColor":"rgb(178, 34, 34)","mandays":"9"}, {"title":"X","start":"2015-02-02","end":"2015-02-02","allDay":true,"resource":"jusa","backgroundColor":"rgb(178, 34, 34)","mandays":"2"}]');

var testBRe = jQuery.parseJSON('[{"id":"mapl","name":"Martin"},{"id":"zone","name":"Zora"},{"id":"jusa","name":"Julius"},{"id":"mamu","name":"Marcel"},{"id":"mami","name":"Marian"},{"id":"jahr","name":"Jan"},{"id":"peli","name":"Peter"}]');

    jQuery("td[name=role]").each(function (i, roleEl) {
        var rColor = getRandomColor(i);
        jQuery(roleEl).parent().find(".external-event").each(function (j, taskEl) {
            jQuery(taskEl).css("background-color", rColor);
            jQuery(taskEl).parent().css("background-color", rColor);
            jQuery(taskEl).next().css("background-color", rColor);
        });
    });

    jQuery('#external-events div.external-event').each(function () {

        // create an Event Object (http://arshaw.com/fullcalendar/docs/event_data/Event_Object/)
        // it doesn't need to have a start or end
        var eventObject = {
            title: jQuery.trim(jQuery(this).text()),
            mandays: jQuery(this).next().text(),
            backgroundColor: jQuery(this).css("background-color"),
            color: jQuery(this).css("background-color"),
            className: "task-in-call"
        };

        // store the Event Object in the DOM element so we can get to it later
        jQuery(this).data('eventObject', eventObject);

        // make the event draggable using jQuery UI
        jQuery(this).draggable({
            zIndex: 999,
            revert: true, // will cause the event to go back to its
            revertDuration: 0 //  original position after the drag
        });

    });

    var calendar = jQuery('#calendar').fullCalendar({
        header: {
            left: 'prev,next today',
            center: 'title',
            right: ' Save '
        },
        titleFormat: {
            resourceMonth: 'MMM yyyy',
        },
	events: testBlla,
        columnFormat: {
            month: 'dddd',
            week: 'ddd d.M.',
            day: 'dddd d.M.',
            resourceDay: 'HH:mm',
            resourceMonth: 'd.M.',
            resourceWeek: 'dddd d.M.',
            resourceNextWeeks: 'dddd d.M.'
        },

        firstDay: 1,
        defaultView: "resourceMonth",
        editable: true,
        dragRevertDuration: 0,
        droppable: true,
        drop: function (date, allDay, ev, ui, resource) { // this function is called when something is dropped

            var originalEventObject = jQuery(this).data('eventObject');
            var copiedEventObject = jQuery.extend({}, originalEventObject);

            copiedEventObject.resource = resource.id;

            var startDate = new Date(date);
            startDate.setHours(0);
            startDate.setMinutes(0);
            startDate.setSeconds(0);
            startDate.setMilliseconds(0);

            copiedEventObject.start = date;
            var endDate = new Date(date);
            endDate.setDate(endDate.getDate() + parseInt(originalEventObject.mandays) - 1);
            endDate.setHours(0);
            endDate.setMinutes(0);
            endDate.setSeconds(0);
            endDate.setMilliseconds(0);
            copiedEventObject.end = endDate;

            copiedEventObject.mandays = originalEventObject.mandays;
	    copiedEventObject.id = (resource.id + "-" + copiedEventObject.title).replace(" ", "") + "_-_" +
                new Date().getTime();
                
                console.log("tu nacitane: " + copiedEventObject.id);

            // render the event on the calendar
            // the last `true` argument determines if the event "sticks" (http://arshaw.com/fullcalendar/docs/event_rendering/renderEvent/)
            if (checkEvent(copiedEventObject)) {

               jQuery('#calendar').fullCalendar('renderEvent', copiedEventObject, true);
                jQuery("#message").text('dragged');
//
//                if (jQuery('#drop-remove').is(':checked')) {
//                    // if so, remove the element from the "Draggable Events" list
//                    var bgcolor = jQuery(this).css("background-color");
//                    jQuery(this).removeAttr("style");
//                    jQuery(this).addClass("movedTask");
//                    jQuery(this).css("background-color", bgcolor);
//                }
            }

        },
        selectable: true,
        minTime: 8,
        maxTime: 16,
        selectHelper: true,
        resources: testBRe,
        //events: testBlla,
	select: function(start, end) {
	//alert(start.date);
	fancyOpen();
	},
        resourceRender: function (resource, element, view) {
            // this is triggered when the resource is rendered, just like eventRender
        },
	eventMouseover: function (event, jsEvent) {
	    jQuery(this).mousemove(function (e) {
		var trashEl = jQuery('#calendarTrash');
		if (isElemOverDiv()) {
		    if (!trashEl.hasClass("to-trash")) {
		        trashEl.addClass("to-trash");
		    }
		} else {
		    if (trashEl.hasClass("to-trash")) {
		        trashEl.removeClass("to-trash");
		    }

		}
	    });
	},
	eventDragStop: function (event, jsEvent, ui, view) {
	    if (isElemOverDiv()) {
		console.log("removing " + event.id);
		jQuery('#calendar').fullCalendar('removeEvents', event.id);

		var trashEl = jQuery('#calendarTrash');
		if (trashEl.hasClass("to-trash")) {
		    trashEl.removeClass("to-trash");
		}
	    } else {
	    	console.log("not in trash");
	    }
	},
	loading: function (bool) {
		console.log("test");
	    if (!bool) {

		//jQuery('.fc-header-left').append('<div id="calendarTrash" class="calendar-trash"><img src="/images/cal-trash.png"></img></div>');


	    }
	},	
        eventResize: function (event, dayDelta, minuteDelta, revertFunc, jsEvent, ui, view) {
            jQuery("#message").text('event was resized, new endtime: ' + event.end);
        },
        eventClick: function (calEvent, jsEvent, view) {

        }
    });


    jQuery("#forTest").on("click", function(e){
        getEvents();
    });


//jQuery('.fc-header-left').append('<div id="calendarTrash" class="calendar-trash"><img src="images/cal-trash.png"></img></div>');
});

//fancybox

    function fancyOpen() {
			//code
			 $.fancybox.open([
            {
                
                fitToView: false,
                width: '40%',
                height: '65%',
                autoSize: false,
                closeClick: false,
                openEffect: 'none',
                closeEffect: 'none',
                type: 'ajax',
                href: 'leave.html'
            }
        ]);
		}
function checkEvent(newEvent) {
    var allEvents = jQuery('#calendar').fullCalendar('clientEvents');
    var len = allEvents == null ? 0 : allEvents.length;
    var newStart = newEvent.start.getTime();
    var newMandays = newEvent.mandays
    var newTaskName = newEvent.title;
    var newResourceId = newEvent.resource;


    for (var i = 0; i < len; i++) {
        if (newEvent != allEvents[i]) {
            var evStart = allEvents[i].start.getTime();
            var evMandays = allEvents[i].mandays;
            var evTaskName = allEvents[i].title;
            var evResourceId = allEvents[i].resource;
            console.log("data: " + allEvents[i].mandays);

            if (newStart == evStart && newMandays == evMandays && evTaskName == newTaskName && evResourceId == newResourceId) {
                jQuery("#message").text("Cant drag this task: task exist");
                return false;
            }
        }
    }
    return true;
}

function getEvents() {
    var allEvents = jQuery('#calendar').fullCalendar('clientEvents');
    var len = allEvents == null ? 0 : allEvents.length;
    var result = new Array();

    for (var i = 0; i < len; i++) {

    var title = allEvents[i].title;
    var start = jQuery.fullCalendar.formatDate(allEvents[i].start, "yyyy-MM-dd");
    var end = allEvents[i].end != null ? jQuery.fullCalendar.formatDate(allEvents[i].end, "yyyy-MM-dd") : start;
    var allDay = allEvents[i].allDay;
    var resource = allEvents[i].resource[0];
    var backgroundColor = allEvents[i].backgroundColor;
    var textColor = allEvents[i].textColor;
    var mandays = allEvents[i].mandays;



        var jEvent = {
            title: title,
            start: start,
            end: end,
            allDay: allDay,
            resource: resource,
            backgroundColor: backgroundColor,
            textColor: textColor,
            mandays: mandays
        }
        result.push(jEvent);
    }
    console.log(JSON.stringify(result));
}


function getRandomColor(index) {
    //    var letters = '23456789ABCD'.split('');
    //    var color = '#';
    //    for (var i = 0; i < 6; i++) {
    //        color += letters[Math.round(Math.random() * 12)];
    //    }
    var color = new Array("#483D8B", "#228B22", "#008B8B", "#B22222");
    return color[index];
}

//check if cursor is in trash 
    function isElemOverDiv() {
        var trashEl = jQuery('#calendarTrash');
	
        var ofs = trashEl.offset();
	
        var x1 = ofs.left;
        var x2 = ofs.left + trashEl.outerWidth(true);
        var y1 = ofs.top;
        var y2 = ofs.top + trashEl.outerHeight(true);
	//alert(y2);
        if (currentMousePos.x >= x1 && currentMousePos.x <= x2 &&
            currentMousePos.y >= y1 && currentMousePos.y <= y2) {
            return true;
        }
        return false;
    }
