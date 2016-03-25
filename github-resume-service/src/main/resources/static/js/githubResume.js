/**
 * @author Mustafa Dagher
 */

$(document).ready(function() {

	resume = github_resume(username, fill_resume);
});

var github_resume = function(username, callback) {
	$.getJSON('/resumeAPI/' + username, callback);
};

fill_resume = function(data) {
	$('#name').html(data.name);
	$('#email').html(data.email);

	languages = {};
	languages = data.languages;

	x = 1;
	if (languages) {
		var ul = $('<ul class="talent"></ul>'), percent, li;
		$.each(languages, function(key, lang) {
			console.log(lang.name + ' ' + lang.percent);

			percent = lang.percent;
			li = $('<li>' + lang.name.toString() + ' (' + percent + '%)</li>');

			if (x % 3 == 0
					|| (languages.length < 3 && i == languages.length - 1)) {
				li.attr('class', 'last');
				ul.append(li);
				$('#content-languages').append(ul);
				ul = $('<ul class="talent"></ul>');
			} else {
				ul.append(li);
				$('#content-languages').append(ul);
			}
			x++;
		});
	} else {
		$('#mylanguages').hide();
	}
};