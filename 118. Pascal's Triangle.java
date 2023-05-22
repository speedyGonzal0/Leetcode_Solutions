class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<List<Integer>>();


        for (int i = 0; i < numRows; i++){
            if(i == 0){
                List<Integer> row = new ArrayList<Integer>();
                row.add(1);
                triangle.add(row);
            }
            else if(i == 1){
                List<Integer> row = new ArrayList<Integer>();
                row.add(1);
                row.add(1);
                triangle.add(row);
            }
            else{
                Integer[] row = new Integer[i + 1];
                row[0] = 1;
                row[i] = 1;

                Integer[] prevRow = triangle.get(i - 1).toArray(new Integer[0]);

                int k = 1;

                for (int j = 0; j < prevRow.length - 1; j++){
                    row[k++] = prevRow[j] + prevRow[j + 1];
                }

                triangle.add(Arrays.asList(row));
            }
        }

        return triangle;
        
    }
}