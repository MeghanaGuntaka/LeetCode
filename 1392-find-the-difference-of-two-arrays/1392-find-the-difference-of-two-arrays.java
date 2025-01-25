class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> uniq1=new ArrayList<>();
       List<Integer> uniq2=new ArrayList<>();
      Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        for (int a:nums1){
            s1.add(a);
        }
        for (int b:nums2){
            s2.add(b);
        }
        for (Integer a:s1){
            if (!s2.contains(a)){
                uniq1.add(a);
            }
        }
        for (Integer b:s2){
            if (!s1.contains(b)){
                uniq2.add(b);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(uniq1);
        result.add(uniq2);
        return result;
    }
}