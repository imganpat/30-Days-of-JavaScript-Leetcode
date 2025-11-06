class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int count = 0, playerIndex = 0, trainerIndex= 0;
        
        while(playerIndex < players.length && trainerIndex < trainers.length){
            if(players[playerIndex] <= trainers[trainerIndex]){
                count++;
                playerIndex++;
                trainerIndex++;
            } else{
                trainerIndex++;
            }
        }

        return count;
    }
}