1class Solution {
2    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
3        int unplaced = 0;
4        
5        for (int i =0 ; i <fruits.length;i++){
6            boolean placed = false;
7            for (int j= 0 ; j<baskets.length;j++) {
8                if (baskets[j]>=fruits[i]) {
9                    baskets[j]=-1;
10                    placed = true;
11                    break;
12
13                }
14            }
15            if (!placed){
16                unplaced++;
17            }
18        } return unplaced;
19    } 
20}