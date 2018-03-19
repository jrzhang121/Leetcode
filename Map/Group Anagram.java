// Given an array of strings, group anagrams together.
// For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
// Return:

//[
//    ["ate", "eat","tea"],
//    ["nat","tan"],
//    ["bat"]
//]


// consider we have m words, each word has n chars
// Time Complexity: O(m * nlogn)
// Space: O(m)


    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if(strs == null || strs.length == 0){   // corner case
            return result;
        }

        // hashmap to group the results together
        Map<String, List<String>> map = new HashMap<>();

        // loop through the strings
        for(int i = 0; i < strs.length; i++){
        // because string is immutable, if we want to sort we need to convert them to char array
            char[] cha = strs[i].toCharArray();
            Arrays.sort(cha);

            // take this sorted string as key: the identifier!!!
            String anaString = new String(cha);

            if(map.get(anaString) == null){
            // generate a new group of anagrams!
            // key is identifier, value is the group of anagrams!
                map.put(anaString, new ArrayList<String>());
            }
            // add the new string to the group
            map.get(anaString).add(strs[i]);
            
        }

        // loop through the map's values to get the results
        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            result.add(entry.getValue());
        
        }
        return result;
    }