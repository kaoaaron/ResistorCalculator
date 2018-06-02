clc;
clear 'all';

img  = imread('images/10kOhm-test.png');

img2 = img(:,22:1045,:);

sampleLine = img2(106,:,:);

M = 32;

big = uint8(zeros(M, 1024, 3));

for k = 1:M
	big(k,:,:) = sampleLine;
end

scan = img2(95:115,:,:);

% 3-D clustering of resistor color values in RGB-space
% use CIE-LAB space or HSV space instead

x = rgb2gray(sampleLine);

S = fft(x);
