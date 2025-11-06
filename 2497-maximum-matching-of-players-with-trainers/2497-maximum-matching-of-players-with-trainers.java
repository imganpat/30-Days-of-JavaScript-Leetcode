class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int count = 0, playerIndex = 0, trainerIndex= 0;

        Arrays.sort(players);
        Arrays.sort(trainers);

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