function y = colourCheck(x) 

	black = 	[0 0 0];
	brown = 	[102 51 49];
	red = 		[253 0 0];
	orange = 	[255 102 0];
	yellow = 	[255 255 0];
	green = 	[51 203 51];
	blue = 		[102 102 255];
	violet = 	[205 102 255];
	grey =		[147 147 147];
	white = 	[255 255 255];

	chart = [	black; 
				brown;
				red;
				orange;
				yellow;
				green;
				blue;
				violet;
				grey;
				white;]./256;

	labels = {	'black'; 
				'brown';
				'red';
				'orange';
				'yellow';
				'green';
				'blue';
				'violet';
				'grey';
				'white'};
	
	d = zeros(length(chart),1);

	for k = 1:length(chart)
		d(k) = (x(1) - chart(k,1))^2 + (x(2) - chart(k,2))^2 + (x(3) - chart(k,3))^2;
	end

	[m, i] = min(d);

	hold 'on';
	grid 'on';
	for k = 1:length(chart)
		scatter3(chart(k,1), chart(k,2), chart(k,3));
		text(chart(k,1), chart(k,2), chart(k,3), labels(k));
	end

	scatter3(x(1), x(2), x(3), 'xk');
	line([x(1) chart(i,1)], [x(2) chart(i,2)], [x(3) chart(i,3)]);

	xlabel('R');
	ylabel('G');
	zlabel('B');

	y = labels{i};
end
