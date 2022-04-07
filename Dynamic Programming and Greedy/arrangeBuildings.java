public class arrangeBuildings {
    public static long solution(int len){
        // same question as count binary strings
        // 0  ---> Buildings
        // 1  ---> Spaces

        long old_countSpaces = 1;
        long old_countBuildings = 1;

        for(int i = 2; i <= len; i++){
            long new_countSpaces = old_countBuildings + old_countSpaces;
            long new_countBuildings = old_countSpaces;
            
            old_countSpaces = new_countSpaces;
            old_countBuildings = new_countBuildings;
        }

        long oneSide_OfRoad = old_countBuildings + old_countSpaces;
        long bothSides_OfRoad = oneSide_OfRoad * oneSide_OfRoad;
        return bothSides_OfRoad;
    }
}
