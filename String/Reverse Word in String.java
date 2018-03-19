// For example,
// Given s = "the sky is blue",
// return "blue is sky the".
// do it in-place

public void reverseWords(char[] str) {
	if(str == null || str.length == 0){
		return;
    }

    // reverse the whole
    reverseHelper(str, 0, str.length - 1);

    // reverse each word in the reversed sentence
    int start = 0;
    for(int end = 0; end <= str.length; end++){
	    if(end == str.length || str[end] == ' ') {  // If there is a space or reach the end, reverse the word and reset the start index
		    reverseHelper(str, start, end-1);
		    start = end + 1;
        }
    }


}

public void reverseHelper(char[] str, int start, int end){    // helper function
	char tmp;
	while(start < end){
		tmp = str[start];
		str[start] = str[end];
		str[end] = tmp;
		start++;
		end--;
    }
    
}