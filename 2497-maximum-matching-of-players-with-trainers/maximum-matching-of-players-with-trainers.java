class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int i = 0;
        int j = 0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        while(i<players.length && j<trainers.length){
            if(players[i] <= trainers[j]){
            i++;
        }
        j++;
    }
    return i;
  }
}
